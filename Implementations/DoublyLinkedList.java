package LinkedListTypes;

import java.util.Scanner;

import LinkedListTypes.CircularLL.Node;

public class DoublyLinkedList {

	class Node
	{
		int data;
		Node left,right;
		Node(int e)
		{
			data=e;
			left=right=null;
		}
	}
	Node root;
	DoublyLinkedList()
	{
		root=null;
	}
	public void insertLeft(int e)
	{
		Node n=new Node(e);
		if(root==null)
			root=n;
		else
		{
			n.right=root;
			root.left=n;
			root=n;
		}
	}
	public void deleteLeft()
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t=root;
			root=root.right;
			if(root!=null)
			root.left=null;
			System.out.println("Deleted: "+t.data);
		}
	}
	public void insertRight(int e)
	{
		Node n=new Node(e);
		if(root==null)
			root=n;
		else
		{
			Node t=root;
			while(t.right!=null)
				t=t.right;
			t.right=n;
			n.left=t;
		}
	}
	public void deleteRight()
	{
		if(root==null)
			System.out.println("Empty...!");
		else {
			Node t=root;
			Node t2=root;
			while(t.right!=null) {
				t2=t;
				t=t.right;
			}
			if(t==root) {
				System.out.println(root.data);
			root=null;
			}
			else {
			t2=t.left;
			t2.right=null;
			System.out.println("Deleted: "+t.data);
			}
		}
	}
	
	public void print()
	{
		System.out.println("LinkedList has:");
		for(Node t=root;t!=null;t=t.right)
		{
			System.out.println(t.data);
		}
	}
	public static void main(String[] args) {
		int ch;
		int e;
		DoublyLinkedList l=new DoublyLinkedList();
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
