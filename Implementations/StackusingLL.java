package LinkedListTypes;

import java.util.Scanner;

import LinkedListTypes.LinkedList.Node;
class Stack
{
	class Node
	{
		int data;
		Node next;
		Node(int e)
		{
			data=e;
			next=null;
		}
	}
	Node tos;
	Stack()
	{
		tos=null;
	}
	public void push(int e)
	{
		Node n=new Node(e);
		if(tos==null)
			tos=n;
		else
		{
			n.next=tos;
			tos=n;
		}
	}
	public void pop()
	{
		if(tos==null)
			System.out.println("Empty");
		else
		{
			Node t=tos;
			tos=tos.next;
			System.out.println("Poped: "+t.data);
		}
	}
	public void print()
	{
		System.out.println("Stack has:");
		for(Node t=tos;t!=null;t=t.next)
		{
			System.out.println(t.data);
		}
	}
}

public class StackusingLL {

	public static void main(String[] args) {
		int choice=0,e=0;
		Scanner sc=new Scanner(System.in);
		Stack obj=new Stack();
		do
		{
			System.out.println("1.Push"+"\n"+"2.Pop"+"\n"+"3.Print"+"\n" +"0. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter a element:");
						e=sc.nextInt();
						obj.push(e);
					break;
				case 2:
						obj.pop();
					break;
				case 3:
					System.out.println("Stack has");
					obj.print();
					break;
				case 0:
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Error");
					break;
			}
		}while(choice!=0);
		

	}

}
