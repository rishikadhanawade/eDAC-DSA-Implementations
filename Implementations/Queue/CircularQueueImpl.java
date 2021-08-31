import java.util.Scanner;

class CircularQueue
{
	int front=0,rear=0,size=0,count=0,Q[];

	public CircularQueue(int n) {
		size = n;
		rear=-1;
		front=0;
		count=0;
		Q=new int[n];
	}
	public void Enqueue(int e)
	{
		count++;
		rear=(rear+1)%size;
		Q[rear]=e;
	}
	public int Dequeue()
	{
		count--;
		int t=Q[front];
		front=(front+1)%size;
		return t;
	}
	public boolean isEmpty()
	{
		if(count==0)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if(count==size)
			return true;
		else
			return false;
	}
	public void print()
	{
		int c=0,i=front;
		while(c<count)
		{
			System.out.println(Q[i]);
			i=(i+1)%size;
			c++;
		}
	}
}
public class CircularQueueImpl {

	public static void main(String[] args) {
		
		int n=0,choice=0,e=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		n=sc.nextInt();
		CircularQueue obj=new CircularQueue(n);
		do
		{
			System.out.println("1.Enqueue"+"\n"+"2. Dequeue"+"\n"+"3.Print"+"\n"+"0. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					if(obj.isFull()==false)
					{
						System.out.println("Enter a element:");
						e=sc.nextInt();
						obj.Enqueue(e);
					}
					else
						System.out.println("Full");
					break;
				case 2:
					if(obj.isEmpty()==false)
					{
						System.out.println("Removed element: "+obj.Dequeue());
					}
					else
						System.out.println("Empty");
					break;
				case 3:
					System.out.println("CircularQueue has");
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
