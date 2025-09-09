package org.example;

import java.util.Arrays;

public class SortingArray {

    public int[] sortingArray(int[] array){
        Arrays.sort(array);
        return array;
    }
    public int[] sortingArrayLoop(int[] array){
        for(int i = 0; i < 1000000; i++);
            Arrays.sort(array);
        return array;
    }
}
