package com.rainmaker.interviewprep.cracking.algorithms.sorting.quick;


public class App {
    public static void main(String[] args) {
        int[] arr = {9,2,6,4,3,5,1};
        QuickSort.quicksort(arr);

        for(int element: QuickSort.sortedArray){
            System.out.print(element);
        }
    }
}
