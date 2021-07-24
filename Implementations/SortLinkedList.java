
import java.util.Scanner;

public class SortLinkedList {
	
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
	Node root;
	public SortLinkedList() {
		root=null;
	}
	public void insertLeft(int e)
	{
		Node n=new Node(e);
		if(root==null)
		{
			root=n;
		}
		else
		{
			n.next=root;
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
			root=root.next;
			if(t==root)
				root=null;
			System.out.println("Deleted"+t.data);
		}
	}
	public void sort()
	{
		Node t,t2;
		Node r=root;
		int temp;
		while(r.next!=null)
		{
			r=r.next;
			t=root;
			while(t.next!=null)
			{
				t2=t;
				t=t.next;
				if(t.data<t2.data)
				{
					temp=t.data;
					t.data=t2.data;
					t2.data=temp;
				}
			}
		}
	}
	public void print()
	{
		System.out.println("LinkedList has:");
		for(Node t=root;t!=null;t=t.next)
		{
			System.out.println(t.data);
		}
	}
	
	
	public static void main(String[] args) {
		
		int ch;
		int e,pos;
		SortLinkedList l=new SortLinkedList();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n1.insertLeft \n2.deleteLeft "
					+ " \n3.print \n4.Sort \n0.Exit");			
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter element from left\n");
					e=s.nextInt();
					l.insertLeft(e);
					break;
				case 2:
					System.out.println("Delete element from left\n");
					l.deleteLeft();
					break;
				case 3:
					System.out.println("Elements in List are \n");
					l.print();
					break;
				case 4:
					System.out.println("Sort");
					l.sort();
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

