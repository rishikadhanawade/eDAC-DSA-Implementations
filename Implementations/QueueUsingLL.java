package LinkedListTypes;

import java.util.Scanner;
class Queue
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
	Node front,rear;
	public Queue() {
		front=rear=null;
	}
	public void Enqueue(int e)
	{
		Node n=new Node(e);
		if(front==null)
		{
			front=rear=n;
		}
		else
		{
			rear.next=n;
			rear=n;
		}
	}
	public void Dequeue()
	{
		if(front==null)
			System.out.println("Empty");
		else
		{
			Node t=front;
			front=front.next;
			System.out.println("Dequeued: "+t.data);
		}
	}
	public void print()
	{
		Node t;
		System.out.println("Queue Has:");
		for(t=front;t!=null;t=t.next)
		{
			System.out.println(t.data);
		}
	}
	
}
public class QueueUsingLL {

	public static void main(String[] args) {
		int choice=0,e=0;
		Scanner sc=new Scanner(System.in);
		Queue obj=new Queue();
		do
		{
			System.out.println("1.Enqueue"+"\n"+"2. Dequeue"+"\n"+"3.Print"+"\n"+"0. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
						System.out.println("Enter a element:");
						e=sc.nextInt();
						obj.Enqueue(e);
					break;
				case 2:
						System.out.println("Dequeue Element");
						obj.Dequeue();
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
