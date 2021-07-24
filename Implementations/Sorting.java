

public class Sorting {
	
	static void merge(int A[], int mid, int low, int high)
	{
	    int i, j, k;
	    int B[]=new int[high+1];
	    i = low;
	    j = mid + 1;
	    k = low;
	    while (i <= mid && j <= high)
	    {
	        if (A[i] < A[j])
	        {
	            B[k] = A[i];
	            i++;
	            k++;
	        }
	        else
	        {
	            B[k] = A[j];
	            j++;
	            k++;
	        }
	    }
	    while (i <= mid)
	    {
	        B[k] = A[i];
	        k++;
	        i++;
	    }
	    while (j <= high)
	    {
	        B[k] = A[j];
	        k++;
	        j++;
	    }
	    for (i = low; i <= high; i++)
	    {
	        A[i] = B[i];
	    }
	    
	}

	static void mergeSort(int A[], int low, int high){
	    int mid; 
	    if(low<high){
	        mid = (low + high) /2;
	        mergeSort(A, low, mid);
	        mergeSort(A, mid+1, high);
	        merge(A, mid, low, high);
	    }
	}

	public static void printArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void swap(int arr[],int i, int j)
	{
		int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	public static void sort(int a[])
	{
//		BUBBLE SORT  
//		for(int i=0;i<a.length-1;i++)
//		{
//			boolean issorted=false;
//			for(int j=0;j<a.length-i-1;j++)
//			{
//				if(a[j]>a[j+1])
//				{
//					issorted=true;
//					swap(a,j,j+1);
//				}
//			}
//			if(!issorted)
//			break;
//		}

//      SELECTION SORT
//		int min_index=0;
//		for(int i=0;i<a.length;i++)
//		{
//			min_index=i;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[j]<a[min_index])
//					min_index=j;
//			}
//			if(i!=min_index)
//				swap(a,i,min_index);
//		}
		
//		INSERTION SORT
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
			int temp=a[i];
			while(j>=0&&a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}

	}
	public static void main(String[] args) {
		
		int array[]= {17,5,4,56,89,32};
		printArr(array);
		sort(array);
		//mergeSort(array, 0, array.length-1);
		printArr(array);

	}

}
