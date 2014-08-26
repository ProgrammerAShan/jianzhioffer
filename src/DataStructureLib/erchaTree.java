package DataStructureLib;

public class erchaTree
{

        public TreeNode root;

        public erchaTree(TreeNode data)
        {
                this.root = data;
        }

        public void insert(TreeNode node)
        {

                TreeNode currentNode = root;
                while (currentNode != null)
                {
                        if (node.value > currentNode.value)
                        {
                                if (currentNode.right == null)
                                {
                                        currentNode.right = node;
                                        break;
                                }
                                else
                                {
                                        currentNode = currentNode.right;
                                }
                        }
                        else
                        {
                                if (node.value < currentNode.value)
                                {
                                        if (currentNode.left == null)
                                        {
                                                currentNode.left = node;
                                                break;
                                        }
                                        else
                                        {
                                                currentNode = currentNode.left;
                                        }
                                }
                                else
                                {
                                        System.out.println("已经存在"
                                                                        + Integer.toString(node.value));
                                }
                        }

                }
                // currentNode=node;

        }

        public boolean find(TreeNode root, TreeNode node)
        {
                if (root == null)
                {
                        return false;
                }
                else
                {
                        if (root.value == node.value)
                        {
                                return true;
                        }
                        else
                        {
                                if (root.value < node.value)
                                {
                                        return find(root.right, node);
                                }
                                else
                                {
                                        return find(root.left, node);
                                }
                        }
                }

        }

        public TreeNode delete(TreeNode root, TreeNode node)
        {
                boolean flag = false;
                TreeNode parentNode = root;
                TreeNode currentNode = root;
                boolean isleftchild = true;       //标记要删除的节点是父节点的左节点或者右节点
                if (node == null || root == null)
                {
                        return null;
                }
                else
                {

                        
                        parentNode = root;
                        while (currentNode.value != node.value)
                        {
                                if (node.value > node.value)
                                {
                                        isleftchild = false;
                                        parentNode = currentNode;
                                        currentNode = currentNode.right;
                                }                                                                                       
                                else
                                {
                                        isleftchild = true;
                                        parentNode = currentNode;
                                        currentNode = currentNode.left;
                                }
                        }                                                                                              //找到了要删除的节点
                        if (currentNode == null)                                            //不存在，返回null
                        {
                                return null;
                        }
                        else
                        {
                                if (currentNode.left == null
                                                                && currentNode.right == null)    //叶子节点
                                {
                                        if (currentNode == root)                                      //是根，清空
                                        {
                                                root = null;
                                                return root;
                                        }

                                        if (isleftchild)                                                        //是左节点的话，父节点的左节点为null
                                        {
                                                parentNode.left = null;
                                        }
                                        else
                                        {
                                                parentNode.right = null;                        //是右节点的话，父节点的左节点为null
                                        }
                                }
                                else
                                {
                                        if (currentNode.left == null
                                                                        || currentNode.right == null)   //要删除的节点有一个子节点
                                        {
                                                if (currentNode.left == null)                              //子节点替换删除的节点即可
                                                {
                                                        if (currentNode == root)
                                                        {
                                                                // currentNode=currentNode.right;
                                                                root = currentNode.right;
                                                                return currentNode;
                                                        }
                                                        else
                                                        {
                                                                if (isleftchild)
                                                                {
                                                                        parentNode.left = currentNode.right;
                                                                }
                                                                else
                                                                {
                                                                        parentNode.right = currentNode.right;
                                                                }
                                                        }

                                                }
                                                else                                                                       
                                                {
                                                        if (currentNode == root)
                                                        {
                                                                // currentNode=currentNode.right;
                                                                root = currentNode.left;
                                                                return currentNode;
                                                        }
                                                        else
                                                        {
                                                                if (isleftchild)
                                                                {
                                                                        parentNode.left = currentNode.right;
                                                                }
                                                                else
                                                                {
                                                                        parentNode.right = currentNode.right;
                                                                }
                                                        }
                                                }
                                        }
                                        else                                                                                            //要删除的节点有两个子节点
                                        {
                                                TreeNode sucessorNode = getsucessor(currentNode);  //寻找要删除节点的后继节点（要删除节点为根的树的最小值），并把后继节点的右子节点赋值给后继结点父节点的左子节点，把后继节点放在要删除节点的位置。
                                                if (currentNode == root)
                                                {
                                                        root = sucessorNode;
                                                }
                                                else
                                                {
                                                        if (isleftchild)
                                                        {
                                                                parentNode.left = sucessorNode;
                                                        }
                                                        else
                                                        {
                                                                parentNode.right = sucessorNode;
                                                        }

                                                }
                                                sucessorNode.left = currentNode.left;
                                        }
                                }
                        }

                }
                return currentNode;

        }

        public TreeNode getsucessor(TreeNode delNode)
        {
                TreeNode replaceNode = delNode.right;
                TreeNode parentnNode = delNode;
                while (replaceNode.left != null)
                {
                        parentnNode = replaceNode;
                        replaceNode = replaceNode.left;
                }
                if (replaceNode != delNode.right)
                {
                        parentnNode.left = replaceNode.right;
                        replaceNode.right = delNode.right;
                }
                return replaceNode;
        }

}
