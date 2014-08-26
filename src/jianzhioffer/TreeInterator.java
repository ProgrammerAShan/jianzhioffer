package jianzhioffer;

import java.util.Stack;

import DataStructureLib.TreeNode;
import DataStructureLib.erchaTree;

public class TreeInterator
{

	private static Stack<TreeNode> treeStatckNodesset;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(6);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(4);
		TreeNode node6 = new TreeNode(20);
		TreeNode node7 = new TreeNode(15);
		TreeNode node8 = new TreeNode(22);
		erchaTree erchaTree = new erchaTree(node);
		erchaTree.insert(node2);
		erchaTree.insert(node3);
		erchaTree.insert(node4);
		erchaTree.insert(node5);
		erchaTree.insert(node6);
		erchaTree.insert(node7);
		erchaTree.insert(node8);
		System.out.print("前序,递归:\t");
		prebianli(erchaTree.root);
		System.out.println();
		System.out.print("前序,非递归:\t");
		prebianlistacknew(erchaTree.root);
		System.out.println();
		System.out.print("中序,递归:\t");
		zhongbianli(erchaTree.root);
		System.out.println();
		System.out.print("中序,非递归:\t");
		zhongbianlistack(erchaTree.root);
		System.out.println();
		System.out.print("后序,递归:\t");
		houbianli(erchaTree.root);
		System.out.println();
		System.out.print("后序,非递归:\t");
		houbianlistack(erchaTree.root);
		System.out.println();

	}

	public static void prebianli(TreeNode root)
	{
		if (root != null)
		{
			System.out.print(Integer.toString(root.value));
			System.out.print(" ");
			TreeNode leftNode = root.left;
			TreeNode righNode = root.right;
			prebianli(leftNode);
			prebianli(righNode);
		}
		return;

	}

	/**
	 * TODO
	 */
	public static void prebianlistacknew(TreeNode root)
	{

		TreeNode pNode = root;
		treeStatckNodesset = new Stack<>();
		while (pNode != null || !treeStatckNodesset.isEmpty())
		{
			while (pNode != null)
			{
				System.out.print(Integer.toString(pNode.value));
				System.out.print(" ");
				treeStatckNodesset.push(pNode);
				pNode = pNode.left;

			}
			if (!treeStatckNodesset.isEmpty())
			{
				TreeNode node = treeStatckNodesset.pop();

				pNode = node.right;
			}
		}

	}

	public static void prebianlistack()
	{
		while (!treeStatckNodesset.isEmpty())
		{
			TreeNode node = treeStatckNodesset.pop();
			System.out.print(Integer.toString(node.value));
			System.out.print(" ");
			if (node.right != null)
			{
				treeStatckNodesset.push(node.right);
			}

			if (node.left != null)
			{
				treeStatckNodesset.push(node.left);
			}

		}

	}

	public static void zhongbianli(TreeNode root)
	{
		if (root == null)
		{
			return;
		} else
		{
			zhongbianli(root.left);
			System.out.print(Integer.toString(root.value));
			System.out.print(" ");
			zhongbianli(root.right);
		}
	}

	public static void zhongbianlistack(TreeNode root)
	{
		treeStatckNodesset = new Stack<>();
		TreeNode pNode = root;
		while (!treeStatckNodesset.isEmpty() || pNode != null)
		{
			while (pNode != null)
			{
				treeStatckNodesset.push(pNode);
				pNode = pNode.left;
			}
			if (!treeStatckNodesset.isEmpty())
			{
				TreeNode node = treeStatckNodesset.pop();
				System.out.print(Integer.toString(node.value));
				System.out.print(" ");
				pNode = node.right;

			}

		}
	}

	public static void houbianli(TreeNode root)
	{
		if (root != null)
		{
			houbianli(root.left);
			houbianli(root.right);
			System.out.print(Integer.toString(root.value));
			System.out.print(" ");

		}
	}

	public static void houbianlistack(TreeNode root)
	{
		treeStatckNodesset = new Stack<>();
		TreeNode pNode = root;
		TreeNode preNode = null;
		treeStatckNodesset.push(root);
		while (!treeStatckNodesset.isEmpty())
		{
			pNode=treeStatckNodesset.peek();
			if ((pNode.left == null && pNode.right == null)
					|| (preNode != null && (preNode == pNode.left || preNode == pNode.right)))
			{
				System.out.print(Integer.toString(pNode.value));
				System.out.print(" ");
				pNode = treeStatckNodesset.pop();
				preNode = pNode;
			}
			else {
				if (pNode.right != null)
				{
					treeStatckNodesset.push(pNode.right);
				}
				if (pNode.left != null)
				{
					treeStatckNodesset.push(pNode.left);
				}
			}
		

		}

	}

}
