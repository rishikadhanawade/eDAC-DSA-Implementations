import java.util.Scanner;
class PriorityQueue
	{
		int front,rear,size,Q[];

		public PriorityQueue(int n) {
			size = n;
			rear=-1;
			front=0;
			Q=new int[size];
		}
		public void Enqueue(int e)
		{
			int t;
			rear++;
			Q[rear]=e;
			for(int i=front;i<=rear-1;i++)
			{
				for(int j=front;j<=rear-1-i;j++)
				{
					if(Q[j]>Q[j+1])
					{

						t=Q[j];
						Q[j]=Q[j+1];
						Q[j+1]=t;
					}
				}
			}
		}
		public int Dequeue()
		{
			int t=Q[front];
			front++;
			return t;
		}
		public boolean isEmpty()
		{
			if(front>rear)
				return true;
			else
				return false;
		}
		public boolean isFull()
		{
			if(rear==size-1)
				return true;
			else
				return false;
		}
		public void print()
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(Q[i]);
			}
		}
	}
	public class PriorityQueueImpl {

		public static void main(String[] args) {
			
			int n,choice,e;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size");
			n=sc.nextInt();
			PriorityQueue obj=new PriorityQueue(n);
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
						System.out.println("Queue has");
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

