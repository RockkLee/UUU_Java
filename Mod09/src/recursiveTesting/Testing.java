package recursiveTesting;

public class Testing {
	public static void main(String[] args) {
		Node root = new Node(0);
		Btree btree = new Btree();
		System.out.println( btree.get_layer_num(3) );
		
		
		
	}
	
	
	
	
	
	
	
	
}

class Node {
	Node Lnode = null;
	Node Rnode = null;
	
	int id;
	int node_height = 0; 
	
	int value;
	public Node(int value) {
		this.value = value;
	}
	
}

class Btree {
	public int tree_height;
	public int count = 1;
	
	public Node inorder_traversal( Node root ) {
		if ( root.Lnode != null) {
			this.tree_height++;
			return root.Lnode;
		}
		
		root.id = this.count;
		this.count++;
		root.node_height = tree_height;
		System.out.println(root.value);
		
		if ( root.Rnode != null) {
			return root.Rnode;
		}
		
		return root;
	}
	
	public void inorder_add( Node root, Node newNode ) {
		Node last_node = inorder_traversal(root);
		
		if ( last_node.id == get_layer_num(tree_height) ) {
			while ( root.Lnode != null ) {
				root = root.Lnode;
			}
			root.Lnode = newNode; 
			return;
		}
		
		if ( last_node. ) {
			
		}
		
	}
	
	
	public int get_layer_num( int height ) {
		if ( height <= 0 ) {
			return 0;
		}
		return get_layer_num(height-1) + (int) Math.pow(2, height-1);
	}
	
}



