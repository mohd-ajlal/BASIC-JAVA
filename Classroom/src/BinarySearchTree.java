//import java.util.ArrayList;
//import java.util.Arrays;
import Lecture2.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
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


    public Node insert(Node node , int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public boolean search(Node node , int data){
        if(node == null)
            return false;
        if(node.data == data)
            return true;
        if(data < node.data)
            return search(node.left,data);
        else
            return search(node.right,data);
    }

    public static ArrayList<Integer> inOrder(Node node, ArrayList<Integer> al){
        if(node != null){
            inOrder(node.left, al);
            al.add(node.data);
            inOrder(node.right, al);
            return al;
        }
        return al;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node root = bst.new Node(25);
        bst.insertIterative(root,10);
        bst.insertIterative(root,15);
        bst.insertIterative(root,32);
        bst.insertIterative(root,35);
        bst.PreOrderIterative(root);
        System.out.println();
        System.out.println(bst.search(root,20));

        System.out.println();



        ArrayList<Integer> arrayList = new ArrayList<>();
        bst.inOrder()


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



    public void PreOrderIterative(Node root){
        if(root == null)
            return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null)
                stack.push(temp.right);
            if(temp.left!=null)
                stack.push(temp.left);
        }
    }

    public void InOrderIterative(Node root){
        if(root == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while(true){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else{
                if(stack.isEmpty())
                    break;
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }

    public void PostOrderIterative(Node root) {
        if (root == null)
            return;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null) stack1.push(temp.left);
            if (temp.right != null) stack2.push(temp.right);
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }

    public static Node successor(Node node){
        if(node!= null && node.right!=null){
            node = node.right;
            while(node !=null){
                node = node.left;
            }
        }
        return node;
    }
    public static Node delete(Node node,int val){
        if(node ==null){
            return null;
        }
        if(val < node.data){
            node.left = delete(node.left,val);
        }
        else if(val > node.data){
            node.right = delete(node.right,val);
        }
        else{
            if(node.left == null && node.right ==null){
                node = null;
            }
            else if(node.left == null){
                node = node.right;
            }
            else if(node.right == null){
                node = node.right;
            }
            else{
                Node successor = successor(node);
                node.data = successor.data;
                node.right = delete(node.right,successor.data);
            }
        }
        return node;
    }


}
