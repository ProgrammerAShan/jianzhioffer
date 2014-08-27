/**
 *The file QuickSortDemo.java was modified by weitao at 下午1:53:45 
 *
 */
package DataStructureLib;

/**
 * @author weitao
 * @date   2014年8月27日
 * @see    快速排序
 */
public class QuickSortDemo {

	/**
	 * @param args
	 * @see   
	 * @Demo  
	 */
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

		int[] sort=Quicksort(data, 0, data.length-1);
		System.out.print("排序后：\t");
		for(int i=0;i<sort.length;i++)
		{
			System.out.print(Integer.toString(sort[i]));
			System.out.print(" ");
		}

	}
	
	public static int[] Quicksort(int[] data,int left,int right)
	{
		if(right<left)
		{
			return null;
		}
		else {
			if(right-left<2)
			{
				if(right-left==1)
				{
					if(data[left]<data[right])
					{
						int temp=data[left];
						data[left]=data[right];
						data[right]=temp;
					}
					return data;
				}
				else {
					return data;
				}
			}
			else {
				int partionindex=partion(data, left, right);
				Quicksort(data, left, partionindex-1);
				Quicksort(data, partionindex+1, right);
				return data;
			}
			
		}
	}
	
	private static int chosekeyindex(int[] data,int left,int right)
	{
		int media=(left+right)/2;
		if(data[left]<data[media])
		{
			if(data[media]<data[right])
				return media;
			else {
				return data[left]>data[right]?left:right;
			}
		}
		else {
			if(data[media]>data[right])
				return media;
			else {
				return data[left]<data[right]?left:right;
			}
		}
	}
	
	private static int partion(int[] data,int left,int right)
	{
		int keyindex=chosekeyindex(data, left, right);
		while(left<right)
		{
			while(data[left]>data[keyindex])
			{
				left++;
			}
			while(data[right]<data[keyindex])
			{
				right--;
			}
			if(left<right)
			{
				int temp=data[left];
				data[left]=data[right];
				data[right]=temp;
			}
			else {
				return left;
			}
		}
		return left;
	}

}
