package com.rainmaker.interviewprep.cracking.datastructures.linkedlists;

import com.rainmaker.interviewprep.cracking.common.BasicNode;

/**
 * Created by dyinanc on 9/27/16.
 */
public class DetectCycle {
    boolean hasCycle(BasicNode head) {
        BasicNode first = head;
        BasicNode second = head;
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
