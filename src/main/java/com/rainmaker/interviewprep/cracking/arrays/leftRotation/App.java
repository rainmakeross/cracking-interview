package com.rainmaker.interviewprep.cracking.arrays.leftRotation;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        int[] b = new int[n];
        System.arraycopy(a,d,b,0,n-d);
        System.arraycopy(a,0,b,n-d,d);
        for(int i:b){
            System.out.print(i + " ");
        }
    }
}
