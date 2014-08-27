/**
 *The file MergeSortDemo.java was modified by weitao at 下午1:08:39 
 *
 */
package DataStructureLib;

/**
 * @author weitao
 * @date   2014年8月27日
 * @see    归并排序
 */
public class MergeSortDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 2, 5, 7, 10, 1, 3, 8 };
		System.out.print("排序前：\t");
		for(int i=0;i<data.length;i++)
		{
			System.out.print(Integer.toString(data[i]));
			System.out.print(" ");
		}
		System.out.println();

		int[] sort=MergeSort(data, 0, data.length);
		System.out.print("排序后：\t");
		for(int i=0;i<sort.length;i++)
		{
			System.out.print(Integer.toString(sort[i]));
			System.out.print(" ");
		}

	}
	
	public static int[] MergeSort(int[] data,int left,int right)
	{
		if(right-left>1)
		{
			int media=(left+right)/2;
			int[] lef=MergeSort(data,left,media);
			int[] rig=MergeSort(data,media,right);
			int[] me=Merge(lef,rig);
			return me;
		}
		else {
			if(right-left==1)
			{
				int[] result=new int[1];
				result[0]=data[left];
				return result;
			}
			else {
				return null;
			}
		}

		
	}
	
	public static int[] Merge(int[] left,int[] right)
	{
		int leftnnumber=left.length;
		int rightnumber=right.length;
		int newnumber=leftnnumber+rightnumber;
		int[] result=new int[newnumber];
		int i=0;
		int j=0;
		int k=0;
		while(i<leftnnumber && j<rightnumber)
		{
			if(left[i]>right[j])
				result[k++]=left[i++];
			else {
				result[k++]=right[j++];
			}
		}
		if(i==leftnnumber)
		{
			while(j<rightnumber)
				result[k++]=right[j++];
		}
		else
		{
			while(i<leftnnumber)
				result[k++]=left[i++];
			
		}
		return result;
	}
	


}
