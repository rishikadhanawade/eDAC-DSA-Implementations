
import java.util.*;

public class LinkedListMerge {
	
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
	public LinkedListMerge() {
		root=null;
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
//	public void NewLL()
//	{
//		LinkedListMerge l1=new LinkedListMerge();
//		for(Node t=root;t!=null;t=t.next)
//		{
//			l1.insertRight(t.data);
//		}
//		l1.print();
//	}
	public void print()
	{
		for(Node t=root;t!=null;t=t.next)
		{
			System.out.print(t.data+" ");
		}
	}
	static Node sortedMerge(Node a, Node b)
	{
		if(a==null)
			return b;
        if(b==null)
        	return a;
        Node head=null,tail=null;
        if(a.data<=b.data){
            head=tail=a;a=a.next;
        }
        else{
            head=tail=b;b=b.next;
        }
        while(a!=null&&b!=null){
            if(a.data<=b.data){
                tail.next=a;tail=a;a=a.next;
            }
            else{
                tail.next=b;tail=b;b=b.next;
            } 
        }
        if(a==null){tail.next=b;}
        else{
            tail.next=a;
        }
        return head;
	}
	
public static void main(String args[])
{
	
	LinkedListMerge list1 = new LinkedListMerge();
	LinkedListMerge list2 = new LinkedListMerge();
	int ch;
	int e;
	Scanner s=new Scanner(System.in);
	do
	{
		System.out.println("\n1.insert in 1st list \n2.insert in 2nd list \n0.Exit");			
		ch=s.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter element from right in list1\n");
				e=s.nextInt();
				list1.insertRight(e);
				break;
			case 2:
				System.out.println("Enter element from right in list2\n");
				e=s.nextInt();
				list2.insertRight(e);
				break;
			
			case 0:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Error");
				break;
		}
	}while(ch!=0);
	LinkedListMerge list3 = new LinkedListMerge();
	
	list3.root = sortedMerge(list1.root,
										list2.root);
	list1.print();
	System.out.println();
	list2.print();
	System.out.println();
	list3.print();	
}
}



