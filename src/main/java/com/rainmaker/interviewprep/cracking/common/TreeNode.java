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

    public boolean contains(int value) {
        if(this.data == value) {
            return true;
        } else if(value < data) {
            if(left == null) {
                return false;
            } else {
                return left.contains(value);
            }

        } else {
            if(right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder() {
        if(left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if(right!= null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.println(data);
        if(left != null) {
            left.printInOrder();
        }
        if(right!= null) {
            right.printInOrder();
        }
    }

    public void printPostOrder() {
        if(left != null) {
            left.printInOrder();
        }
        if(right!= null) {
            right.printInOrder();
        }
        System.out.println(data);
    }
}
