package com.devhouseagency.quicksort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] integers = {10, 6, 1, 3, 8, 9, 4};

        quickSort.sort(integers, 0, integers.length - 1);
        System.out.println(Arrays.toString(integers));
    }
}
