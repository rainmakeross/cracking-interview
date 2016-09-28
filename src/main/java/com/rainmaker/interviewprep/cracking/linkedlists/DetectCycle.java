package com.rainmaker.interviewprep.cracking.linkedlists;

/**
 * Created by dyinanc on 9/27/16.
 */
public class DetectCycle {
    boolean hasCycle(Node head) {
        Node first = head;
        Node second = head;
        while(true) {
            if(first.next == null || second.next == null) {
                return false;
            }
            first = first.next;
            second = second.next;
            if (second == null)
                return false;
            second = second.next;

            if (first.data == second.data)
                return true;
        }
    }
}
