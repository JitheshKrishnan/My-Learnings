//! Topics: Array, Hash Table, Design, Heap (Priority Queue), Ordered Set

//? Hard Difficulty

//* Better Solution: 521ms

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

class MovieRentingSystem {
    private static class Node {
        final int shop;
        final int movie;
        final int price;
        Node(int shop, int movie, int price) {
            this.shop = shop;
            this.movie = movie;
            this.price = price;
        }
    }

    // Order: price ↑, shop ↑, movie ↑  (strict: never returns 0 for distinct nodes)
    private static final Comparator<Node> CMP =
        (a, b) -> {
            int c = Integer.compare(a.price, b.price);
            if (c != 0) return c;
            c = Integer.compare(a.shop, b.shop);
            if (c != 0) return c;
            return Integer.compare(a.movie, b.movie);
        };

    // Available copies grouped by movie
    private final Map<Integer, TreeSet<Node>> availableByMovie = new HashMap<>();
    // All currently rented copies
    private final TreeSet<Node> rentedSet = new TreeSet<>(CMP);
    // Quick lookup from (shop, movie) -> Node
    private final Map<Long, Node> byPair = new HashMap<>();

    private static long key(int shop, int movie) {
        return (((long) shop) << 32) ^ (movie & 0xffffffffL);
    }

    public MovieRentingSystem(int n, int[][] entries) {
        for (int[] e : entries) {
            int shop = e[0], movie = e[1], price = e[2];
            Node node = new Node(shop, movie, price);
            byPair.put(key(shop, movie), node);
            availableByMovie
                .computeIfAbsent(movie, k -> new TreeSet<>(CMP))
                .add(node);
        }
    }

    // Return up to 5 shops with this movie, cheapest then shop asc.
    public List<Integer> search(int movie) {
        List<Integer> ans = new ArrayList<>(5);
        TreeSet<Node> set = availableByMovie.get(movie);
        if (set == null || set.isEmpty()) return ans;
        Iterator<Node> it = set.iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) {
            ans.add(it.next().shop);
        }
        return ans;
    }

    // Move (shop,movie) from available -> rented
    public void rent(int shop, int movie) {
        long k = key(shop, movie);
        Node node = byPair.get(k);
        if (node == null) return; // defensive
        TreeSet<Node> set = availableByMovie.get(movie);
        if (set != null) set.remove(node);
        rentedSet.add(node);
    }

    // Move (shop,movie) from rented -> available
    public void drop(int shop, int movie) {
        long k = key(shop, movie);
        Node node = byPair.get(k);
        if (node == null) return; // defensive
        rentedSet.remove(node);
        availableByMovie
            .computeIfAbsent(movie, x -> new TreeSet<>(CMP))
            .add(node);
    }

    // Return up to 5 rented copies [shop, movie], cheapest then shop asc, then movie asc.
    public List<List<Integer>> report() {
        List<List<Integer>> ans = new ArrayList<>(5);
        Iterator<Node> it = rentedSet.iterator();
        for (int i = 0; i < 5 && it.hasNext(); i++) {
            Node n = it.next();
            ans.add(Arrays.asList(n.shop, n.movie));
        }
        return ans;
    }
}

/**
 * Your MovieRentingSystem object will be instantiated and called as such:
 * MovieRentingSystem obj = new MovieRentingSystem(n, entries);
 * List<Integer> param_1 = obj.search(movie);
 * obj.rent(shop,movie);
 * obj.drop(shop,movie);
 * List<List<Integer>> param_4 = obj.report();
 */

public class DesignMovieRentalSystem_1912 {
    public static void main(String[] args) {
        int[][] entries = {
            {0, 1, 5}, {0, 2, 6}, {0, 3, 7},
            {1, 1, 4}, {1, 2, 7}, {2, 1, 5}
        };

        MovieRentingSystem mrs = new MovieRentingSystem(3, entries);

        // search(1)
        System.out.println(mrs.search(1)); // expect shops with movie 1, cheapest first

        // rent(0,1)
        mrs.rent(0, 1);

        // rent(1,2)
        mrs.rent(1, 2);

        // report()
        System.out.println(mrs.report());

        // drop(1,2)
        mrs.drop(1, 2);

        // search(2)
        System.out.println(mrs.search(2));
    }
}
