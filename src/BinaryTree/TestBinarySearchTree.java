package BinaryTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		int a = 14;
		BinarySearchTree bst = new BinarySearchTree(a);
		bst.insert(12);
		bst.insert(13);
		bst.insert(16);
		bst.insert(25);
		bst.insert(11);
		System.out.println(bst.toString());
	}

}
