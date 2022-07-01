package com.devhouseagency.quicksort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {
    @Test
    void canPartitionAnArray() {
        QuickSort quickSort = new QuickSort();
        int[] integers = {10, 6, 1, 3, 8, 9, 4};

        // Partition an array
        quickSort.partition(integers, 0, integers.length - 1);

        // Check if an array was partitioned
        assertEquals("[1, 3, 4, 6, 8, 9, 10]", Arrays.toString(integers));
    }

    @Test
    void getPartitionIndex() {
        QuickSort quickSort = new QuickSort();
        int[] integers = {10, 6, 1, 3};

        // Partition an array
        int p = quickSort.partition(integers, 0, integers.length - 1);

        // Check if partition index is 1
        assertEquals(1, p);
    }

    @Test
    void shouldSortAnUnorderedArray() {
        QuickSort quickSort = new QuickSort();
        int[] integers = {3, 1, 7, 4, 8, 2};

        // QuickSort an array
        quickSort.sort(integers, 0, integers.length - 1);

        // Check if an array was partitioned
        assertEquals("[1, 2, 3, 4, 7, 8]", Arrays.toString(integers));
    }
}
