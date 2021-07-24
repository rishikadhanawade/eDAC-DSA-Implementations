package LinkedListTypes;

import java.util.Scanner;

import LinkedListTypes.LinkedList.Node;

public class CircularLL {
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
	Node root,last;
	public CircularLL() {
		
		root=last=null;

	}
	public void insertLeft(int e)
	{
		Node n=new Node(e);
		if(root==null)
		{
			root=last=n;
			last.next=root;
		}
		else
		{
			n.next=root;
			root=n;
			last.next=root;
		}
	}
	public void deleteLeft()
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t=root;
			root=root.next;
			last.next=root;
			if(t==root)
				root=null;
			System.out.println("Deleted: "+t.data);
		}
	}
	public void insertRight(int e) //Insert at  end
	{
		Node n=new Node(e);
		if(root==null)
		{
			root=last=n;
			last.next=root;
		}
		else
		{
			last.next=n;
			last=n;
			last.next=root;
		}
	}
	public void deleteRight()
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t=root;
			Node t2=root;
			while(t!=last)
			{
				t2=t;
				t=t.next;
			}
			if(t==root)
				root=null;
			last=t2;
			last.next=root;
			System.out.println("Deleted: "+t.data);
		}
	}
	public void print()
	{
		Node t=root;
		if(root==null)
			System.out.println("empty");
		else
		{
			do
			{
				System.out.println(t.data);
				t=t.next;
			}while(t!=root);
		}
	}
	public static void main(String[] args) {
		
		
		int ch;
		int e;
		CircularLL l=new CircularLL();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n1.insertLeft \n2.insertRight \n3.deleteLeft \n4.deleteRight \n5.print \n0.Exit");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter element from left\n");
					e=s.nextInt();
					l.insertLeft(e);
					break;
				case 2:
					System.out.println("Enter element from right\n");
					e=s.nextInt();
					l.insertRight(e);
					break;
				case 3:
					System.out.println("Delete element from left\n");
					l.deleteLeft();
					break;
				case 4:
					System.out.println("Delete element from right\n");
					l.deleteRight();
					break;
				case 5:
					System.out.println("Elements in List are \n");
					l.print();
					break;
				case 0:
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Error");
					break;
			}
		}while(ch!=0);

	}

}
