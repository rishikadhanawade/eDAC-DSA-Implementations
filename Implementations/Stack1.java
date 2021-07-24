package LinkedListTypes;


//Cache Friendliness,Locality Of Reference
import java.util.Scanner;

public class Stack1 {
	int s[], size, e, tos0, tos1;
	Stack1(int size) {
		this.size = size;
		tos0 = -1;
		tos1 = size;
		s = new int[size];
	}
	public void push0(int e) {
		s[++tos0] = e;
	}
	public void push1(int e) {
		s[--tos1] = e;
	}
	public boolean isFull() {
		return (tos1 == tos0 + 1);

	}
	public int pop0() {
		int t = s[tos0--];
		return t;
	}
	public int pop1() {
		int t = s[tos1++];
		return t;
	}
	public boolean isEmpty1() {
		return (tos0 == -1);
	}
	public boolean isEmpty2() {
		return (tos1 == size);
	}

	public int atPeak0() {
		return s[tos0];
	}
	public int atPeak1() {
		return s[tos1];
	}
	public void print0() {
		for (int i = tos0; i >-1; i--)
			System.out.println(s[i]);
	}
	public void print1() {
		for (int i = tos1; i < size; i++)
			System.out.println(s[i]);
	}
	public static void main(String[] args) {
		int n, ch, e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		n = sc.nextInt();
		Stack1 s = new Stack1(n);
		do {
			System.out.println("\n1.Push0\n2.Push1\n3.Pop0\n4.Pop1\n5.Print0\n6.Print1\n7.Peak0\n8.Peak1\n0.Exit\n");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (s.isFull() == false) {
					System.out.println("Enter:");
					e = sc.nextInt();
					s.push0(e);
				} else
					System.out.println("Full");
				break;
			case 2:
				if (s.isFull() == false) {
					System.out.println("Enter:");
					e = sc.nextInt();
					s.push1(e);
				} else
					System.out.println("Full");
				break;
			case 3:
				if (s.isEmpty1() == false) {
					System.out.println("Popped:" + s.pop0());
				} else
					System.out.println("Empty");
				break;
			case 4:
				if (s.isEmpty2() == false) {
					System.out.println("Popped:" + s.pop1());
				} else
					System.out.println("Empty");
				break;
			case 5:
				System.out.println("Stack0 has");
				s.print0();
				break;
			case 6:
				System.out.println("Stack1 has");
				s.print1();
				break;
			case 7:
				if (s.isEmpty1() == false) {
					System.out.println("at Peak:" + s.atPeak0());
				} else
					System.out.println("Empty");
				break;
			case 8:
				if (s.isEmpty2() == false) {
					System.out.println("at Peak:" + s.atPeak1());
				} else
					System.out.println("Empty");
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Error");
				break;
			}
		} while (ch != 0);
	}
}