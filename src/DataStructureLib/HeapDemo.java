package DataStructureLib;

public class HeapDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] data={2,5,7,10,1,3,8};
		
		
		HeapClass heapClass=new HeapClass(data);
		
		heapClass.format();
		System.out.println();
		heapClass.makeheap();
		heapClass.insert(13);
		heapClass.insert(15);
		heapClass.format();

	}

}
