package com.rainmaker.interviewprep.cracking.common;


public class TreeNode {
    TreeNode left, right;
    int data;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if(value <= data) {
            if(left == null) {
                this.left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if(right == null) {
                this.right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        }
    }
}
