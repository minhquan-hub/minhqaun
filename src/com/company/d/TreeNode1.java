package com.company.d;

import java.util.Random;

public class TreeNode1 {
    public static TreeNode root;

    public static void main(String[] args) {
        int a[] ={12,8,15,21,24,1,6,3,4,7,16,13,23};
        for (int i = 0; i < a.length ; i++) {
            root = insertNode(root,a[i]);
        }

//        printTreeNode(root);
        deleteTreeNode(root,21);
//        lastLeft(root);
//        lastRight(root);


    }

    public static TreeNode insertNode(TreeNode roota, int key){
        if(roota == null){
            TreeNode p = new TreeNode(key);
            return roota = p;
        }else {
            if(key <= roota.key){
                roota.left = insertNode(roota.left,key);

            }else {
                roota.right = insertNode(roota.right,key);
            }
        }
        return roota;
    }

    public static void printTreeNode(TreeNode root){
        if(root != null){
            if(root.key % 2 != 0) {
                System.out.print(root.key + " ");
            }
            printTreeNode(root.left);
            printTreeNode(root.right);
        }
    }

    public static TreeNode deleteTreeNode(TreeNode root, int x) {
        if (root == null)
            return root;
        if (x < root.key)
            root.left = deleteTreeNode(root.left, x);
        else if (x > root .key)
            root.right = deleteTreeNode(root.right,x);
        else
        {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.key = minValue(root.right);
            root.right = deleteTreeNode(root.right, root.key);
        }
        return root;
    }

    public static int minValue(TreeNode root){
        int min = root.key;
        while (root.left != null){
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

    public static TreeNode lastRight(TreeNode root){
        while (root.left != null){
            if(root.left == null && root.right == null){
                return root;
            }
            if(root.left != null) {
                lastRight(root.left);
                lastRight(root.right);
            }else if(root.right != null){
                lastRight(root.right);
            }
        }
        return root;
    }

    public static TreeNode lastLeft(TreeNode root){
        while (root.right != null){
            if(root.left == null && root.right == null){
                return root;
            }
            if(root.right != null) {
                lastLeft(root.right);
                lastLeft(root.left);
            }else if(root.left != null){
                lastLeft(root.left);
            }
        }
        return root;
    }
}
