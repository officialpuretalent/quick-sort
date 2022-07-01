package com.devhouseagency.quicksort;

public class QuickSort {

    public int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int index = (start - 1);

        for (int j = start; j < array.length; j++) {
            if (array[j] < pivot) {
                ++index;
                swap(array, index, j);
            }
        }

        swap(array, (index + 1), end);
        return (index + 1);
    }

    public void sort(int[] array, int start, int end) {
        if (start < end ) {
            int pointer = partition(array, start, end);
            sort(array, start, pointer - 1);
            sort(array, pointer + 1, end);
        }
    }

    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
