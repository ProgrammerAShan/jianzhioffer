package jianzhioffer;

import org.omg.CORBA.PUBLIC_MEMBER;

//二维数组，查找一个数，二维数组满足行中数递增，列中数递增

public class FindDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] data={
				{1,2,4,9},
				{3,7,8,10},
				{5,6,10,12}
		};
		
		System.out.println(findfeidigui(data,0,data[0].length-1,10));

	}
	
	public  static boolean find(int[][] data,int rows,int columns,int number)
	{
		if(data!=null && data.length>0 && rows>-1 && columns>-1)
		{
		while(rows<data.length && columns>-1)
		{
			if(data[rows][columns]<number)
			{
				return find(data, rows+1, columns, number);
			}
			else {
				if(data[rows][columns]>number)
				{
					return find(data, rows, columns-1, number);
				}
				else {
					return true;
				}
			}
			
		}
		}
		return false;
	}
	
	public  static boolean findfeidigui(int[][] data,int rows,int columns,int number)
	{
		if(data!=null && data.length>0 && rows>-1 && columns>-1)
		{
		while(rows<data.length && columns>-1)
		{
			if(data[rows][columns]<number)
			{
				rows++;
			}
			else {
				if(data[rows][columns]>number)
				{
					columns--;
				}
				else {
					return true;
				}
			}
			
		}
		}
		return false;
	}

}
