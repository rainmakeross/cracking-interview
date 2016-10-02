package com.rainmaker.interviewprep.cracking.algorithms.sorting.bubble;

/**
 * BubbleSort algorithm is the most elementary algorithm in sorting
 * Idea: Swap elements of the array to be sorted one at a time
 * Complexity: Time ~ O(n^2). Space ~ O(1)
 */
public class BubbleSort {
    public static int sortCount = 0;
    private static int[] swap(int[] ints, int indexFirst, int indexSecond) {
        int init = ints[indexFirst];
        ints[indexFirst] = ints[indexSecond];
        ints[indexSecond] = init;
        return ints;
    }

    public static int[] bubblesort(int[] array) {
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;
            for(int i=0; i< array.length-1; i++){
                if(array[i] > array[i+1]){
                    sortCount++;
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
        }

        return array;
    }
}
