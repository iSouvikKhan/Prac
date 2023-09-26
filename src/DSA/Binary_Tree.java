package DSA;

public class Binary_Tree {
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		bt.Main();
		

	}
	
	public static int maxDepth(Node root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

}


class Node {  
    public int value;  
    public Node left, right;  
    public Node(int element)  
    {  
        value = element;  
        left = right = null;  
    }  
}  
class BinaryTree {  
    Node root;  
    BinaryTree()
    {
    	root = null;
    }  
    public void traverseInorder(Node node)  
    {  
        if (node == null)  
            return;  
        traverseInorder(node.left);  
        System.out.print(node.value + " ");  
        traverseInorder(node.right);  
    }  
    public void traverseInorder()
    {
    	traverseInorder(root);
    }
    public int getHeight(Node root) {
    	if(root == null) return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left, right) + 1;
    }
    
    public void Main()  
    {  
        BinaryTree bt = new BinaryTree();  
        bt.root = new Node(3);  
        bt.root.left = new Node(9);  
        bt.root.right = new Node(20);  
        bt.root.left.left = null;  
        bt.root.left.right = null;  
        bt.root.right.left = new Node(15);  
        bt.root.right.right = new Node(7);   
        System.out.println("The Inorder traversal of given binary tree is - ");  
        bt.traverseInorder();
        System.out.println();
        System.out.println("Height: "+bt.getHeight(bt.root));
    }  
}  