import java.util.Scanner;

public class Tree {

	class Node
	{
		int data;
		Node left,right;
		Node(int e)
		{
			data=e;
		}
	}
	Node root;
	Tree()
	{
		root=null;
	}
	void insert(Node r,Node n)
	{
		if(root==null)
			root=n;
		else
		{
			if(n.data<r.data)
			{
				if(r.left==null)
					r.left=n;
				else
					insert(r.left,n);
			}
			else
			{
				if(r.right==null)
					r.right=n;
				else
					insert(r.right,n);
			}
		}
	}
	public void inorder(Node root)
	{
		if(root==null)
				return;
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		
	}
	public void postorder(Node root)
	{
		if(root==null)
				return;
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);	
		
	}
	public void preorder(Node root)
	{
		if(root==null)
				return;
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		
	}
	public int count(Node r,int c)
	{
		if(r!=null)
		{
			c=count(r.left,c);
			c++;
			c=count(r.right,c);
			return c;
		}
		else
		return c;
	}

	public static void main(String[] args) {
		
		Tree obj=new Tree();
		Scanner s=new Scanner(System.in);
		int e,ch;
		do
		{
			System.out.println("\n1.insert \n2.Print Order \n3.Nodes \n0.Exit");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter element\n");
					e=s.nextInt();
					obj.insert(obj.root,obj.new Node(e));
					break;
				case 2:
					System.out.println("Print Preorder");
					obj.preorder(obj.root);
					System.out.println("Print Inorder");
					obj.inorder(obj.root);
					System.out.println("Print Postorder");
					obj.postorder(obj.root);
					break;
				case 3:
					System.out.println("Number of nodes");
					int r=obj.count(obj.root, 0);
					System.out.println(r);
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
