import java.util.Scanner;
class Stack
{
	int s[],size,e,tos;

	public Stack(int size) {
		this.size = size;
		tos=-1;
		s=new int[size];
	}
	public void push(int e)
	{
		tos++;
		s[tos]=e;
	}
	public boolean isFull()
	{
		if(tos==size-1)
			return true;
		else 
			return false;
	}
	public int pop()
	{
		int t=s[tos];
		tos--;
		return t;
	}
	public boolean isEmpty()
	{
		if(tos==-1)
			return true;
		else 
			return false;
	}
	public int atPeak()
	{
		return (s[tos]);
	}
	public void print()
	{
		for(int i=tos;i>=0;i--)
		{
			System.out.println(s[i]);
		}
	}
}
public class StackImplementation {
	
	public static void main(String args[])
	{
		int n=0,choice=0,e=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		n=sc.nextInt();
		Stack obj=new Stack(n);
		
		do
		{
			System.out.println("1.Push"+"\n"+"2.Pop"+"\n"+"3.Print"+ "\n" +"4.Peak"+ "\n" +"0. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					if(obj.isFull()==false)
					{
						System.out.println("Enter a element:");
						e=sc.nextInt();
						obj.push(e);
					}
					else
						System.out.println("Full");
					break;
				case 2:
					if(obj.isEmpty()==false)
					{
						System.out.println("Poped: "+obj.pop());
					}
					else
						System.out.println("Empty");
					break;
				case 3:
					System.out.println("Stack has");
					obj.print();
					break;
				case 4:
					if(obj.isEmpty()==false)
						System.out.println("at Peak "+obj.atPeak());
					else
						System.out.println("Empty");
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
