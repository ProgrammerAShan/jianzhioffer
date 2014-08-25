package jianzhioffer;

import java.awt.HeadlessException;

//翻转列表

public class PrintLinkListReverse {
	
	static class node
	{
		String value;
		node next;
		public node(String valuestring)
		{
			value=valuestring;
			next=null;
		}
		public node(){}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		node a=new node("1");
		node b=new node("2");
		node c=new node("3");
		node d=new node("4");
		node e=new node("5");
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		PrintReverseNode(a);

	}
	
	public static void PrintReverseNode(node data)
	{
		if(data==null)
		{
			return;
		}
		else
		{
			node head=null;
			head=data;
			while(data.next!=null)
			{
				node currenthead=head;
				node next=data.next;
				node nextnext=next.next;
				data.next=nextnext;
				head=next;
				next.next=currenthead;
				

//				data.next=next.next;
//				head=next;
//				next.next=data;
				
			}
			while(head.next!=null)
			{
				System.out.println(head.value);
				head=head.next;
			}
			System.out.println(head.value);
//			data.next=head.next;
//			head=data;
		}
		
	}

}
