package com.rainmaker.interviewprep.cracking.algorithms.sorting.merge;


/**
 * Merge sort
 * idea: Divide array into two, sort individually and then copy elements from them to one single array
 * why: always O(nlogn). Issue... requires a lot of memory to do its work.
 * Complexity: time~ O(nlogn), space ~ O(n)
 */
public class MergeSort {
    public static int[] sortedArray;
    public static int arrayswaps;

    public static void mergeSort(int[] array){
        arrayswaps=0;
        mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if(leftStart>= rightEnd){
            return;
        }

        int middle = (leftStart + rightEnd) / 2;
        mergeSort(array, temp, leftStart, middle);
        mergeSort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);

        sortedArray = array;
    }


    private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart ) /2 ;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart +1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd) {
            if(array[left] <=array[right]){
                temp[index] = array[left];
                left++;
                arrayswaps++;
            } else {
                temp[index] = array[right];
                right++;
                arrayswaps++;
            }
            index++;
        }


        // Copy remainder of the array
        System.arraycopy(array, left, temp, index,leftEnd - left + 1);
        System.arraycopy(array, right, temp, index,rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart,size);
    }
}
