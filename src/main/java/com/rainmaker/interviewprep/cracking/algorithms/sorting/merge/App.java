package com.rainmaker.interviewprep.cracking.algorithms.sorting.merge;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }

            MergeSort.mergeSort(arr);

            System.out.print(MergeSort.arrayswaps);
        }




    }
}
