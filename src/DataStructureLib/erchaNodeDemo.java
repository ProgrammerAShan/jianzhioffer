package DataStructureLib;

public class erchaNodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode node1 = new TreeNode(16);
		TreeNode node2 = new TreeNode(10);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(8);
		TreeNode node5 = new TreeNode(13);
		TreeNode node6 = new TreeNode(18);
		TreeNode node7 = new TreeNode(23);
		TreeNode node8 = new TreeNode(6);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(11);
		TreeNode node11 = new TreeNode(14);
		TreeNode node12 = new TreeNode(12);
		erchaTree erchaTree = new erchaTree(node1);
		erchaTree.insert(node2);
		erchaTree.insert(node3);
		erchaTree.insert(node4);
		erchaTree.insert(node5);
		erchaTree.insert(node6);
		erchaTree.insert(node7);
		erchaTree.insert(node8);
		erchaTree.insert(node9);
		erchaTree.insert(node10);
		erchaTree.insert(node11);
		erchaTree.insert(node12);
		prebianli(erchaTree.root);
		System.out.println();
		erchaTree.delete(erchaTree.root, node2);
		prebianli(erchaTree.root);

	}

	public static void prebianli(TreeNode root) {
		if (root != null) {
			System.out.print(Integer.toString(root.value));
			System.out.print(" ");
			TreeNode leftNode = root.left;
			TreeNode righNode = root.right;
			prebianli(leftNode);
			prebianli(righNode);
		}
		return;

	}

}
