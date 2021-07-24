
import java.util.Scanner;

public class NoOfNodes {
	
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
	public NoOfNodes() {
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
	public int count()
	{
		int len=0;
		for(Node t=root;t!=null;t=t.next)
		{
			len++;
		}
		return len;
	}
	public static void main(String[] args) {
		
		int ch;
		int e,pos;
		NoOfNodes l=new NoOfNodes();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n1.insertLeft \n2.deleteLeft "
					+ " \n3.countnodes \n4.Sort \n0.Exit");			
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
					System.out.print("Number of Elements in List are \n");
					int c=l.count();
					System.out.println(c);
					break;
				case 0:
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Error");
					break;
			}
		} while(ch!=0);
	}
	}

