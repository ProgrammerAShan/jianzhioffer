package jianzhioffer;

import java.util.Stack;

import jianzhioffer.PrintLinkListReverse.node;

//列表倒着输出
public class PrintReverseLinklist {

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
			Stack<node> nodeStack=new Stack<>();
			while(data!=null)
			{
				nodeStack.push(data);
				data=data.next;
			}
			while (!nodeStack.isEmpty()) {
				System.out.println(nodeStack.pop().value);
				
				
			}
		}
		
	}

}
