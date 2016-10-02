package com.rainmaker.interviewprep.cracking.datastructures.tries;

import com.rainmaker.interviewprep.cracking.common.Trie;

import java.util.Scanner;


public class AppSoln {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String op, contact;

        int arrCounter = 0;
        int n = in.nextInt();
       Trie trie = new Trie();
        for(int a0 = 0; a0 < n; a0++){
            op = in.next();
            contact = in.next();
            if(op.equals("add")) {
                trie.insert(contact);
            } else {
                System.out.println(trie.findEntries(contact));
            }
        }
    }


}
