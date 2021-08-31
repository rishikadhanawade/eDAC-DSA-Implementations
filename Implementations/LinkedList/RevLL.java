//Using Stack and LinkedList

import java.util.Scanner;

class Stack {
	int s[], size, e, tos;

	Stack(int size) {
		this.size = size;
		tos = -1;
		s = new int[size];
	}

	public void push(int e) {
		s[++tos] = e;
	}

	public boolean isFull() {
		if (tos == size - 1)
			return true;
		else
			return false;
	}

	public int pop() {
		int t = s[tos--];
		return t;
	}

	public boolean isEmpty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	public void print() {
		for (int i = tos; i >= 0; i--)
			System.out.println(s[i]);
	}
}

public class RevLL {
	class Node {
		int data;
		Node next;

		Node(int e) {
			data = e;
			next = null;
		}
	}
	
	Node root;

	RevLL() {
		root = null;
	}

	public void insertLeft(int e) {
		Node n = new Node(e);
		if (root == null)
			root = n;
		else {
			n.next = root;
			root = n;
		}
	}

	public void insertRight(int e) {
		Node n = new Node(e);
		if (root == null)
			root = n;
		else {
			Node t = root;
			while (t.next != null)
				t = t.next;
			t.next = n;
		}
	}

	public void reverse() {
		Stack s= new Stack(count());
		Node t= root;
		while(t!=null) {
			s.push(t.data);
			t=t.next;
		}
		t=root;
		while(t!=null) {
			t.data= s.pop();
			t=t.next;
		}
	}
	
	public void print() {
		if (root == null)
			System.out.println("Empty");
		else {
			Node t = root;
			while (t != null) {
				System.out.print(t.data+" ");
				t = t.next;
			}
			System.out.println();
		}
	}

	public int count() {
		int c=0;
		if (root == null)
			return 0;
		else {
			Node t = root;
			while (t != null) {
				c++;
				t = t.next;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int ch;
		int e;
		RevLL l=new RevLL();
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n1.insertLeft \n2.insertRight \n3.reverse \n4.print \n0.Exit");			
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
					System.out.println("Reversing the Linkedlist...\n");
					l.reverse();
					System.out.print("Reversing done !\n");
					l.print();
					break;
				case 4:
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
