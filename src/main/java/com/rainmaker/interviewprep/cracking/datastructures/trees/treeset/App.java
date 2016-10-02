package com.rainmaker.interviewprep.cracking.datastructures.trees.treeset;


import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        TreeSet<Day> days = new TreeSet<Day>();
        days.add(Day.WEDNESDAY);
        days.add(Day.FRIDAY);
        days.add(Day.THURSDAY);
        days.add(Day.WEDNESDAY);

        for(Day d: days) {
            System.out.println(d);
        }
    }
}

     enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
        }