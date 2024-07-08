package Lecture2;

import java.util.Stack;

public class BinarySearchTree {

    class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    // recurssive
    public Node insert(Node root , int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // iterative
    public void insertIterative(Node root , int data){
        Node temp = new Node(data);
        Node parent = null;
        Node current = root;
        while(current!=null){
            parent = current;
            if(data < current.data){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }
        if(parent == null){
            root = temp;
        }
        else if(data < parent.data){
            parent.left = temp;
        }
        else{
            parent.right = temp;
        }
    }

    public static void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void preorder(Node root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public boolean search(Node root, int data){
        if(root == null)
            return false;
        if(root.data == data)
            return true;
        return search(root.left,data) || search(root.right,data);
    }
    public boolean searchIterative(Node root , int data){
        Node current = root;
        while(current!=null){
            if(current.data == data)
                return true;
            else if(data < current.data)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }

    public void inOrder(Node root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();


    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.new Node(25);
        bst.insert(root,10);
        bst.insert(root,15);
        bst.insert(root,30);
        bst.insert(root,35);
        System.out.println(bst.search(root,15));
        inorder(root);


    }
}
