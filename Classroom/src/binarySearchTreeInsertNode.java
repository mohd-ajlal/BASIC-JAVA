import Lecture2.BinarySearchTree;

public class binarySearchTreeInsertNode {
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    binarySearchTreeInsertNode() {
        root = null;
    }

    void insert(int key) {
        root = insertNode(root, key);
    }

    Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertNode(root.left, key);
        else if (key > root.key)
            root.right = insertNode(root.right, key);

        return root;
    }
    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (key < root.key)
            return search(root.left, key);

        return search(root.right, key);
    }
    void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(root.key + " ");
            display(root.right);
        }
    }

    public static void main(String[] args) {
        binarySearchTreeInsertNode bst = new binarySearchTreeInsertNode();
        bst.insert(50);
        bst.insert(60);
        bst.insert(40);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(45);
        bst.insert(55);
        bst.insert(75);
        bst.display(bst.root);
        System.out.println();
        Node result = bst.search(bst.root, 99);
        if (result != null) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }

    }
}
