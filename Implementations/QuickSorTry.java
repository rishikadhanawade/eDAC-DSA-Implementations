public class QuickSorTry
{
	public static void printArray(int arr[])
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	static int partition(int A[], int low, int high)
	{
//		LOMUTO PARTITION
//		int pivot=arr[high];
//		int i=low-1;
//		for(int j=low;j<high;j++)
//		{
//			if(arr[j]<pivot)
//			{
//				i++;
//				swap(arr,i,j);
//			}
//		}
//		swap(arr,i+1,high);
//		return (i+1);
		
//		HOARE'S PARTITION
		int pivot=A[low];
		int i=low-1;
		int j=high+1;
		while(true)
		{
			do
			{
				i++;
			}
			while(A[i]<pivot);
			do
			{
				j--;
			}
			while(A[j]>pivot);
			if(i>=j)
				return j;
			swap(A,i,j);		
		}
	}
	static void quickSort(int A[], int low, int high)
	{
	    int partitionIndex=0; // Index of pivot after partition
	
	    if (low < high)
	    {
	        partitionIndex = partition(A, low, high); 
	        quickSort(A, low, partitionIndex - 1);  // sort left subarray 
	        quickSort(A, partitionIndex + 1, high); // sort right subarray
	    }
	}
	public static void main(String args[])
	{
	    
	    int A[] = {889,7,2,6,4,3,8,45,1,96};
	    printArray(A);
	    quickSort(A, 0, A.length - 1);
	    printArray(A);
	}

}
