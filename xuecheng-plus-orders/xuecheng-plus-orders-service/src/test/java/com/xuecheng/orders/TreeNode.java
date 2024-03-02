package com.xuecheng.orders;

/**
 * @Description TODO
 * @Classname TreeNode
 * @Date 2024/3/1 21:24
 * @Created by wangjuntao
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){};
    TreeNode(int val){this.val = val;};
    TreeNode(int val,TreeNode left,TreeNode right){this.val =val;
    this.left =left;
    this.right=right;}
}
