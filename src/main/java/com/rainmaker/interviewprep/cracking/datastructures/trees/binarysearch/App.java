package com.rainmaker.interviewprep.cracking.datastructures.trees.binarysearch;


import com.rainmaker.interviewprep.cracking.common.TreeNode;

public class App {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.insert(1);
        treeNode.insert(3);
        treeNode.insert(5);
        treeNode.insert(4);
        treeNode.printInOrder();
    }
}
