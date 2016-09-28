package com.rainmaker.interviewprep.cracking.hashtables;

import java.util.*;


public class RansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        Hashtable<String, Integer> magazineHashTable = new Hashtable<String, Integer>();
        Hashtable<String, Integer> ransomHashTable = new Hashtable<String, Integer>();

        for(String magazineWords: magazine) {
            if(magazineHashTable.contains(magazineWords)) {
                magazineHashTable.put(magazineWords, magazineHashTable.get(magazineWords) +1);
            } else {
                magazineHashTable.put(magazineWords, 1);
            }

        }
        for(String ransomWords: ransom) {
            if(ransomHashTable.contains(ransomWords)) {
                ransomHashTable.put(ransomWords, ransomHashTable.get(ransomWords) +1);
            } else {
                ransomHashTable.put(ransomWords, 1);
            }

        }
        boolean magazineContainsRansom = true;

        for (Map.Entry<String, Integer> entry : ransomHashTable.entrySet()) {
            if(magazineHashTable.get(entry.getKey()) == null || !magazineHashTable.get(entry.getKey()).equals(entry.getValue())) {
                magazineContainsRansom = false;
            }
        }
        if(magazineContainsRansom) {
            System.out.println("Yes ");
        } else {
            System.out.println("No ");
        }

    }
}