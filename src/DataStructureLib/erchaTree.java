package DataStructureLib;

import java.util.Currency;



public class erchaTree {
	
	public TreeNode root;
	
	public erchaTree(TreeNode data)
	{
		this.root=data;
	}
	
	public void insert(TreeNode node)
	{
		
			TreeNode currentNode=root;
			while(currentNode!=null)
			{
				if(node.value>currentNode.value)
					currentNode=currentNode.right;
				else {
					if(node.value<currentNode.value)
						currentNode=currentNode.left;
					else {
						System.out.println("已经存在"+Integer.toString(node.value));
					}
				}
					
			}
			
		
	}

}
