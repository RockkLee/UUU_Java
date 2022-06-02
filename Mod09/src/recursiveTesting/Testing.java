package recursiveTesting;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Node root = new Node(0);
		Btree btree = new Btree(root);
		
		
		btree.add(new Node(1));
		btree.add(new Node(-1));
		btree.add(new Node(5));
		btree.add(new Node(-3));
		btree.add(new Node(4));
		btree.inorder_traversal(btree.root);
		
		
		
		
	}
	
	
	
	
	
	
	
	
}

class Node {
	Node Lnode = null;
	Node Rnode = null;
	
	int id = 1;
	int node_height = 1; 
	
	int value;
	public Node(int value) {
		this.value = value;
	}
	
}

class Btree {
	public int tree_height;
	public int count = 1;
	public Node root;
	
	
	Btree(Node root) {
		this.root = root;
	}
	
	public void inorder_traversal( Node node) {
		if (node == null) {
			return;
		}
		
		//go to Lnode
		inorder_traversal(node.Lnode);
		
		//visit value
		this.count++;
		node.node_height = tree_height;
		System.out.println(node.value);
		
		//go to Rnode
		inorder_traversal(node.Rnode);
		
		int stop = 0;
	}
	
	public void add( Node newNode ) {
		Node node = root;
		
		in:
		while ( true ) {
			if ( newNode.value <= node.value & node.Lnode == null ) {
			    node.Lnode = newNode;
			    break;
			}
			if ( newNode.value > node.value & node.Rnode == null ) {
			    node.Rnode = newNode;
			    break;
			}
			if ( newNode.value <= node.value ) {
			    node = node.Lnode;
			    continue in;
			}
			if ( newNode.value > node.value ) {
			    node = node.Rnode;
			    continue in;
			}

		}
		
		
	}
	
	
	public int get_layer_num( int height ) {
		if ( height <= 0 ) {
			return 0;
		}
		return get_layer_num(height-1) + (int) Math.pow(2, height-1);
	}
	
}



