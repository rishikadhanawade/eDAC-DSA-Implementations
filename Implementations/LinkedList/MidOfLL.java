

import java.util.Scanner;

public class MidOfLL {
	
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
	public MidOfLL() {
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


	public void print()
	{
		System.out.println("LinkedList has:");
		for(Node t=root;t!=null;t=t.next)
		{
			System.out.println(t.data);
		}
	}

	public void ObtainMid(){
        if(root==null)
        {
        	System.out.println("Empty");
        	return;
        }
        Node t=root,t2=root;
        while(t2!=null&&t2.next!=null){
            t=t.next;
            t2=t2.next.next;
        }
        System.out.println(t.data);
    }
	public static void main(String[] args) {
		
		int ch;
		int e,pos;
		MidOfLL l=new MidOfLL();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n1.insertLeft \n2.insertRight \n3.FindMid \n0.Exit");			
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
					System.out.println("Find mid");
					l.ObtainMid();
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
