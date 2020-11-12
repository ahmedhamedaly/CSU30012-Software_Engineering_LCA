// Code adapted from geeksforgeeks.org

class Node 
{ 
	int data; 
	Node left, right; 

	Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

class BinaryTree 
{ 
	Node root; 
	
	Node lca(Node node, int n1, int n2) 
	{ 
		if (node == null) 
			return null; 

		if (node.data > n1 && node.data > n2) 
			return lca(node.left, n1, n2); 

		if (node.data < n1 && node.data < n2) 
			return lca(node.right, n1, n2); 

		return node; 
	} 
} 
