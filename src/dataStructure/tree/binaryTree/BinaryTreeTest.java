package dataStructure.tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);

        root.leftNode = n1;
        root.rightNode = n2;

        root.leftNode.leftNode = new  TreeNode(4);
        root.leftNode.rightNode = new  TreeNode(5);

        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
    }

    static class TreeNode{
        int val;
        TreeNode leftNode;
        TreeNode rightNode;

        TreeNode(int val){
            this.val = val;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    public void preOrder(TreeNode root){
        if (root == null)
            return;

        System.out.print(root.val);
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

    public void inOrder(TreeNode root){
        if (root == null)
            return;

        inOrder(root.leftNode);
        System.out.print(root.val);
        inOrder(root.rightNode);
    }

    public void postOrder(TreeNode root){
        if (root == null)
            return;
        postOrder(root.leftNode);
        postOrder(root.rightNode);
        System.out.print(root.val);
    }

    public void levelOrder(TreeNode root){
        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.val);
            if (node.leftNode != null)
                queue.add(node.leftNode);
            if (node.rightNode != null)
                queue.add(node.rightNode);
        }
    }

}
