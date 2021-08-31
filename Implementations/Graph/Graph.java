import java.util.Scanner;

public class Graph 
{

	int AdjMat[][],v,vlist[];
	Graph(int nodes)
	{
		Scanner sc=new Scanner(System.in);
		v=nodes;
		AdjMat=new int[v][v];
		for(int scr=0;scr<v;scr++)
		{
			for(int dest=0;dest<v;dest++)
			{
				System.out.println("Enter data for edge"+scr+" "+dest);
				AdjMat[scr][dest]=sc.nextInt();
			}
		}
		
	}
	void DFS(int start)
	{
		vlist[start]=1;
		System.out.println(start);
		for(int i=0;i<v;i++)
		{
			if(AdjMat[start][i]==1&&vlist[i]!=1)
			{
				DFS(i);
			}
		}
	}
	void reset()
	{
		vlist=new int[v];
		for(int i=0;i<v;i++)
			vlist[i]=0;
	}
	void BFS(int start)
	{
		int Q[],front,rear,element;
		vlist[start]=1;
		Q=new int[v];
		front=0;
		rear=-1;
		Q[++rear]=start; //Enqueue
		while(front<=rear)
		{
			element=Q[front++];
			System.out.println(element);
			for(int i=0;i<v;i++)
			{
				if(AdjMat[element][i]==1&&vlist[i]!=1)
				{
					Q[++rear]=i;
					vlist[i]=1;
				}
			}
		
		}
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of nodes");
		int nod=in.nextInt();
		Graph g=new Graph(nod);
		int start=0;
		g.reset();
		g.DFS(start);
		g.reset();
		g.BFS(start);
	}
}
	
	

