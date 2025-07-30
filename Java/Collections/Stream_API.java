package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Stream_API {
    public static void main(String a[]){
        List<Integer> list = Arrays.asList(1,2,4,8,3);
        
        //method 1:
        
        System.out.println("Method 1:");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // Method 2:

        int sum=0;
        System.out.println("Method 2:");
        for(int n : list){
            if(n%2==0){
                n=n*2;
                sum=sum+n;
            }
        }
        System.out.println(sum);

        // Method 3:

        System.out.println("Method 3:");
        list.forEach(n -> System.out.println(n));

        // Method 4:

        System.out.println("Method 4: Stream API");
        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c,e) -> c+e);
        System.out.println(result);

        // Method 5:

        System.out.println("Method 5: Stream API with less lines of code");
        int res = list.stream()
        .filter(n->n%2==0)
        .map(n->n*2)
        .reduce(0, (c,e)->c+e);
        System.out.println(res);

        // Additional

        System.out.println("Additional: ");
        Stream<Integer> sortedValues = list.stream().filter(n->n%2==0).sorted();

        sortedValues.forEach(n->System.out.println(n));

        // For threads

        System.out.println("For Threads: ");
        Stream<Integer> threasStream = list.parallelStream().filter(n->n%2==0);
    }
}
