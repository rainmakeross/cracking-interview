package com.rainmaker.interviewprep.cracking.algorithms.sorting.quick;


import java.util.Comparator;

public class Checker implements Comparator<Player>{
    public int compare(Player o1, Player o2) {
        if(o1.score < o2.score) {
            return 1;
        }

        if(o1.score > o2.score) {
            return -1;
        }

        if(o1.score == o2.score) {
            return compareNames(o1.name, o2.name);
        }

        return 0;
    }

    private int compareNames(String name1, String name2){
        return name1.compareTo(name2);
    }
}
