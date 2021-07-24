package LinkedListTypes;

import java.util.Scanner;

public class LinkedList {
	
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
	public LinkedList() {
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
	public void insertRight(int e)
	{
		Node n=new Node(e);
		if(root==null)
			root=n;
		else
		{
			Node t=root;
			while(t.next!=null)
				t=t.next;
			t.next=n;
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
			while(t.next!=null)
			{
				t2=t;
				t=t.next;
			}
			t2.next=null;
			if(t==root)
				root=null;
			System.out.println("Deleted:"+t.data);
		}
	}
	public void insertAtMid(int x)
    {
        if (root == null)
            this.insertLeft(x);
        else {
            Node newNode = new Node(x);
            Node ptr = root;
            int len = 0;
            while (ptr != null) {
                len++;
                ptr = ptr.next;
            }
            int count = ((len % 2) == 0) ? (len / 2) :
                                        (len + 1) / 2;
            ptr = root;
            while (count-- > 1)
                ptr = ptr.next;
            newNode.next = ptr.next;
            ptr.next = newNode;
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
	public void search(int key)
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t;
			for(t=root;t!=null;t=t.next)
			{
				if(t.data==key)
					{
						System.out.println("Found");
						break;
					}
			}
			if(t==null)
			System.out.println("Not Found");
		}
	}
	public void deleteKey(int key)
	{
		if(root==null)
			System.out.println("Empty");
		else
		{
			Node t,t2;
			t=t2=root;
			while(t!=null&&t.data!=key)
			{
				t2=t;
				t=t.next;
			}
			if(t==null)
				System.out.println("Not found");
			else
			{
				//case 1
				if(t==root)
					root=root.next;
				else if(t.next==null)
					t2.next=null;
				else
				{
					t2.next=t.next;
				}
				System.out.println("Deleted:"+t.data);
			}
		}
	}
	public void insertInBetween(int pos,int data)
	{
		Node t=new Node(data);
		if(pos==1)
			this.insertLeft(data);
		else
		{
			Node curr=root;
			for(int i=1;i<=pos-2&&curr!=null;i++)
				curr=curr.next;
			if(curr==null)
				System.out.println("Invalid position");
			t.next=curr.next;
			curr.next=t;
		}
		
	}
	public void reverse()
	{
		Node curr=root;
		Node prev=null;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		root=prev;
	}
	public static void main(String[] args) {
		
		int ch;
		int e,pos;
		LinkedList l=new LinkedList();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n1.insertLeft \n2.insertRight \n3.deleteLeft "
					+ "\n4.deleteRight \n5.print  \n6.Search \n7.delete element \n8.insert at given \n9.insert at mid \n10.Sort \n0.Exit");			
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
				case 6:
					System.out.println("Search element\n");
					e=s.nextInt();
					l.search(e);
					break;
				case 7:
					System.out.println("Delete element\n");
					e=s.nextInt();
					l.deleteKey(e);
					break;
				case 8:
					System.out.println("insert at given position");
					e=s.nextInt();
					pos=s.nextInt();
					l.insertInBetween(pos, e);
					break;
				case 9:
					System.out.println("Insert at mid");
					e=s.nextInt();
					l.insertAtMid(e);
					break;
				case 10:
					System.out.println("Sort");
					l.sort();
					break;
				case 10:
					System.out.println("Reverse");
					l.reverse();
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

