import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class JavaCollections {

    public static void arrayList(){
        //! ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);

        list.set(2, 100);

        //? ArrayList to Array
        Integer[] arr = list.toArray(new Integer[0]); //? Basically if array size is 0, then it will dynamically assign array size according to list size and this is standard approach 
        for(int a : arr) System.out.print(a + " ");

        List<Integer> alist = new ArrayList<>();
        alist.add(5);
        alist.add(6);
        alist.addAll(list);

        List<Integer> subList = alist.subList(1, 4);
        subList.set(1, 67); //? Be careful - sublist is a shallow copy, 
        //?                                                 so it references that same list,
        //?                                                 thus changes made in sublist will be reflected
        //?                                                 main list as well

        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));
        System.out.println(alist);
        System.out.println(subList);
    }

    public static void linkedList(){
        //! LinkedList

        List<Integer> lk = new LinkedList<>();
        lk.add(1);
        lk.add(2);
        lk.add(3);

        ListIterator<Integer> iterator = lk.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next()); //? Returns the current element and moves the pointer to next element
        System.out.println(iterator.previous()); //? Moves the pointer to the previous element and then returns the element in that position

    }

    public static void queue(){
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.poll();
        }
    }

    public static void stack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    
    public static void deque(){
        Deque<Integer> dq = new ArrayDeque<>();
        //? Deque as a stack
        dq.offerFirst(1);
        dq.offerFirst(2);
        System.out.println(dq.peekFirst());
        dq.pollFirst();
        System.out.println(dq.peekFirst());
        System.out.println("deque is by default prints as a stack "+dq);

        //? Deque as a normal queue
        dq.clear();
        dq.offerLast(1);
        dq.offerLast(2);
        System.out.println(dq.peekFirst());
        dq.pollFirst();
        System.out.println(dq.peekFirst());
    }

    public static void priorityQueue(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);
        while (!pq.isEmpty()) {
            // System.out.println(pq.peek());
            pq.poll();
        }

        List<StudentMarks> studentMarks = new ArrayList<>();
        studentMarks.add(new StudentMarks(70, 80));
        studentMarks.add(new StudentMarks(38, 10));
        studentMarks.add(new StudentMarks(100, 38));
        studentMarks.add(new StudentMarks(40, 88));
        studentMarks.add(new StudentMarks(97, 19));

        PriorityQueue<StudentMarks> spq = new PriorityQueue<>((a, b) -> b.getPhysics() - a.getPhysics());
        for(StudentMarks sm : studentMarks) spq.add(sm);

        List<StudentMarks> top3 = new ArrayList<>();
        int index = 0;
        while (!spq.isEmpty()) {
            if(index == 3) break;
            top3.add(spq.poll());
            index++;
        }
        System.out.println(top3);
    }
    
    public static void set(){
        //? If implementing a HashSet or a LinkedHashSet using custom class object then you must define hashCode and equals methods or the reference values will be compared
        //? LinkedHashSet is just an ordered HashSet that maintains the order in which the elements are inserted
    }
    
    public static void treeSet(){
        NavigableSet<Integer> tset = new TreeSet<>();
        tset.add(8);
        tset.add(1);
        tset.add(3);
        tset.add(0);
        System.out.println(tset);
        System.out.println(tset.higher(2));
        System.out.println(tset.lower(1));
        System.out.println(tset.ceiling(2));
        System.out.println(tset.floor(5));
    }
    public static void main(String[] args) {
        // arrayList();
        // linkedList();
        // queue();
        // stack();
        // deque();
        // priorityQueue();
        treeSet();
    }
}

//? Helper classes for PriorityQueue
class MyCustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2){
        return o2 - o1;
    }
}

class StudentMarks implements Comparable<StudentMarks> {
    
    private int maths;
    private int physics;

    public StudentMarks(int maths, int physics){
        this.maths = maths;
        this.physics = physics;
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    @Override
    public int compareTo(StudentMarks o) {
        return o.maths - this.maths;
    }

    @Override
    public String toString() {
        return "StudentMarks [maths=" + maths + ", physics=" + physics + "]";
    }
}