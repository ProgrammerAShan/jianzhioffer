package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

import DataStructureLib.TreeNode;

/**
 * @author weitao
 * 根据前序和中序构建树
 */
public class ReBuildTree
{

        public static void main(String[] args)
        {
                // TODO Auto-generated method stub
                List<Integer> preIntegers=new ArrayList<>();
                preIntegers.add(1);
                preIntegers.add(2);
                preIntegers.add(4);
                preIntegers.add(7);
                preIntegers.add(3);
                preIntegers.add(5);
                preIntegers.add(6);
                preIntegers.add(8);
                
  //              List<Integer> itIntegers=preIntegers.subList(0, 0);
                
                List<Integer> zhongIntegers=new ArrayList<>();
                zhongIntegers.add(4);
                zhongIntegers.add(7);
                zhongIntegers.add(2);
                zhongIntegers.add(1);
                zhongIntegers.add(5);
                zhongIntegers.add(3);
                zhongIntegers.add(8);
                zhongIntegers.add(6);
                List<Integer> teIntegers=preIntegers.subList(0, 0);
                
                
                TreeNode node=ReBuild(preIntegers,zhongIntegers);
  //              TreeInterator teInterator=new TreeInterator();
                TreeInterator.prebianli(node);
                System.out.println();
                TreeInterator.zhongbianli(node);
                System.out.println();
                TreeInterator.houbianli(node);
                System.out.println();
                

        }
        
        public static  TreeNode ReBuild(List<Integer> pre,List<Integer> zho)
        {
                if(pre.size()<2)
                {
                        if(pre.size()==1)
                        {
                                return new TreeNode(pre.get(0));
                        }
                        else {
                                return null;
                        }
                }
                else {
                        int value=pre.get(0);
                        int preleng=pre.size();
                        int zholeng=zho.size();
                       TreeNode rootNode=new TreeNode(value);
                       int index=zho.indexOf(value);
                       TreeNode leftNode=ReBuild(pre.subList(1, index+1),zho.subList(0, index) );
                       TreeNode rightNode=ReBuild(pre.subList(index+1, preleng),zho.subList(index+1, zholeng) );
                       rootNode.left=leftNode;
                       rootNode.right=rightNode;
                       return rootNode;
                       
                       
                }
        }

}
