//package Lecture2;
//
//import com.sun.source.tree.Tree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class BinaryTree {
//
//	TreeNode root;
//
//	public void levelOrderInsertion(int data) {
//		TreeNode newNode = new TreeNode(data);
//		if (root == null) {
//			root = newNode;
//			return;
//		}
//
//		Queue<TreeNode> queue = new LinkedList<TreeNode>();
//
//		queue.offer(root);
//		while (true) {
//			TreeNode temp = queue.poll();
//			if (temp.left != null) {
//				queue.offer(temp.left);
//			} else {
//				temp.left = newNode;
//				break;
//			}
//
//			if (temp.right != null) {
//				queue.offer(temp.right);
//			} else {
//				temp.right = newNode;
//				break;
//			}
//
//		}
//
//	}
//
//	public void levelOrderTv() {
//		if (root == null) {
//			return;
//		}
//
//		Queue<TreeNode> queue = new LinkedList<TreeNode>();
//
//		queue.offer(root);
//		while (!queue.isEmpty()) {
//			TreeNode temp = queue.poll();
//			System.out.print(temp.data + " ");
//
//			if (temp.left != null) {
//				queue.offer(temp.left);
//			}
//
//			if (temp.right != null) {
//				queue.offer(temp.right);
//			}
//		}
//
//	}
//
//	public static void preOrderTV(TreeNode node) {
//
//		if (node != null) {
//			System.out.print(node.data + " ");
//			preOrderTV(node.left);
//			preOrderTV(node.right);
//		}
//
//	}
//
//	public static void inOrderTV(TreeNode node) {
//
//		if (node != null) {
//
//			inOrderTV(node.left);
//			System.out.print(node.data + " ");
//			inOrderTV(node.right);
//		}
//
//	}
//
//	public static void postOrderTV(TreeNode node) {
//
//		if (node != null) {
//
//			postOrderTV(node.left);
//
//			postOrderTV(node.right);
//			System.out.print(node.data + " ");
//		}
//
//	}
//
//
//	public static int height(TreeNode node) {
//		if (node == null) {
//			return 0;
//		}
//
//		return Math.max(height(node.left), height(node.right))  + 1;
//	}
//
//
//	public static boolean isBalance(TreeNode node){
//		if(node == null){
//			return true;
//		}
//
//		int lh = height(node.left);
//		int rh = height(node.right);
//
//		if(Math.abs(lh - rh)>1){
//			return false;
//		}
//
//		return isBalance(node.left) && isBalance(node.right);
//	}
//
//	public static boolean search(TreeNode node, int val){
//		if(node == null){
//			return false;
//		}
//
//	}
//
//}
