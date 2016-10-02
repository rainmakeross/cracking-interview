package com.rainmaker.interviewprep.cracking.algorithms.sorting.quick;

/**
 * QuickSort Algo implementation
 * Idea: Pick a pivot point (in here center) and arrange values greater to right and lesser to left around it
 * Complexity: Average: O(n log n), very bad selection of pivot ~ Worst case (O(n^2)). Space Complexity ~ O(1)
 */
public class QuickSort {
    public static int[] sortedArray;

    public static void quicksort(int[] arr){
        quicksort(arr, 0, arr.length -1);
    }

    private static void quicksort(int[] arr, int left, int right) {
        if(left>=right) {
            return;
        }

        int pivot=arr[(left+right)/2];
        int index = partition(arr, left, right, pivot);
        quicksort(arr,left, index-1);
        quicksort(arr,index, right);
        sortedArray = arr;
    }

    private static int partition(int[] arr, int left, int right, int pivot) {
        while(left <=right) {
            while(arr[left] < pivot) {
                left++;
            }

            while(arr[right] > pivot) {
                right--;
            }

            if(left<=right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static int[] swap(int[] ints, int indexFirst, int indexSecond) {
        int init = ints[indexFirst];
        ints[indexFirst] = ints[indexSecond];
        ints[indexSecond] = init;
        return ints;
    }
}
