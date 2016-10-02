package com.rainmaker.interviewprep.techniques.recursion.davidstaircase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int max = 0;
        int[] intArr = new int[s];
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            if(n > max)
                max = n;
            intArr[a0] = n;
        }

        Map<Integer, Integer> possibilitiesMap = new HashMap<>();
        for(int i=0; i<=max;i++) {
            possibilitiesMap.put(i,recursiveClimb(i));
        }

        for(int number: intArr) {
            System.out.println(possibilitiesMap.get(number));
        }
    }

    private static int recursiveClimb(int staircase) {
        if(staircase < 0) {
            return 0;
        } if(staircase == 0) {
            return 1;
        } else {
            return recursiveClimb(staircase -3)+ recursiveClimb(staircase -2)  + recursiveClimb(staircase -1);
        }
    }
}


