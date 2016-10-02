package com.rainmaker.interviewprep.techniques.bits.integerrepresent;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int element: a){
            if(!integerMap.containsKey(element)){
                integerMap.put(element, 1);
            } else {
                integerMap.put(element, integerMap.get(element) + 1);
            }
        }

        for(Map.Entry<Integer, Integer> k: integerMap.entrySet()){
            if(k.getValue() < 2)
                System.out.println(k.getKey());
        }
    }
}
