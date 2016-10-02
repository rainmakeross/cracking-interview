package com.rainmaker.interviewprep.cracking.algorithms.sorting.bubble;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        a = BubbleSort.bubblesort(a);
        System.out.println("Array is sorted in "+BubbleSort.sortCount+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
}
