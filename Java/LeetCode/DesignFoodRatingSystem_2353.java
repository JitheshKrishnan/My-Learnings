//! Topics: Array, Hash Table, String, Design, Heap (Priority Queue), Ordered Set

//? Medium Difficulty

//* Best Solution: 171ms

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import javax.xml.transform.SourceLocator;

class FoodRatings {
    class Food {
        String name;
        int rating;
        
        public Food(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }
    }
    
    Map<String, String> foodToCuisine;
    Map<String, Integer> foodToRating;
    Map<String, PriorityQueue<Food>> cuisineToHeap;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating = new HashMap<>();
        cuisineToHeap = new HashMap<>();
        
        for (int i = 0; i < foods.length; i++) {
            foodToCuisine.put(foods[i], cuisines[i]);
            foodToRating.put(foods[i], ratings[i]);
            
            cuisineToHeap.putIfAbsent(cuisines[i], new PriorityQueue<>(
                (a, b) -> b.rating != a.rating ? b.rating - a.rating : a.name.compareTo(b.name)
            ));
            
            cuisineToHeap.get(cuisines[i]).add(new Food(foods[i], ratings[i]));
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        foodToRating.put(food, newRating);
        cuisineToHeap.get(cuisine).add(new Food(food, newRating));
    }
    
    public String highestRated(String cuisine) {
        PriorityQueue<Food> heap = cuisineToHeap.get(cuisine);
        
        while (true) {
            Food top = heap.peek();
            if (foodToRating.get(top.name) == top.rating) {
                return top.name;
            }
            heap.poll();  // Remove outdated entry
        }
    }
}

public class DesignFoodRatingSystem_2353 {
    public static void main(String[] args) {
        String[] foods = {"kimchi","miso","sushi","moussaka","ramen","bulgogi"};
        String[] cuisines = {"korean","japanese","japanese","greek","japanese","korean"};
        int[] ratings = {9,12,8,15,14,7};
        FoodRatings frs = new FoodRatings(foods, cuisines, ratings);
        System.out.println(frs.highestRated("korean"));
        System.out.println(frs.highestRated("japanese"));
        frs.changeRating("sushi", 16);
        System.out.println(frs.highestRated("japanese"));
        frs.changeRating("ramen", 16);
        System.out.println(frs.highestRated("japanese"));
    }
}
