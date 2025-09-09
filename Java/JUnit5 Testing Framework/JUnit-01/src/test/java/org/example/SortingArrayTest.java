package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class SortingArrayTest {

    @Test
    void testSortingArray_Exception(){
        SortingArray array = new SortingArray();
//        int unsorted[] = {2,5,3};
        int unsorted[] = null;
        assertThrows(NullPointerException.class, ()->array.sortingArray(unsorted));
    }

    @Test
    void performanceTesting(){
        SortingArray array = new SortingArray();
        int unsorted[] = {2,1,4};
        assertTimeout(Duration.ofMillis(1), ()->array.sortingArrayLoop(unsorted));
    }
}