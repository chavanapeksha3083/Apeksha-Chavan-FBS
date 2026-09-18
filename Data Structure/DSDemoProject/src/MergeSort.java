import java.util.Scanner;
class MergeSort
{
	public static void main(String[] args) 
	{
		
	

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter array elements :");

			int []arr = new int[5];

	

			for(int i=0;i<arr.length;i++)   
			{
		  	    arr[i] = sc.nextInt();
		        }

			for(int i=0;i<arr.length;i++)
		        {
		  	    System.out.println(" "+arr[i]);
		        }

			int start=0;
			int end=arr.length;
			 mergeSort(arr,start,end);
			 
			 System.out.println("Sorted Array ");
			 
			 for(int i=0;i<arr.length;i++)
			 {
				 
				 System.out.println(" "+arr[i]);
			 }
			 
		
		
	}

	  static void mergeSort(int[] arr, int start, int end)
	  
	  {
		if(start!=end)
		{
			int mid=(start+end)/2;
			
			mergeSort(arr,start,end);
			merge(arr,mid+1,end);
			
			combine(arr,start,mid,end);
		}
		
	}

        static void combine(int[] arr, int start, int mid, int end)
        {
		 int i=start,j=mid+1,k=0;
		 int n_arr[]= new int [end+1];
		 
		 while()
		
	    }

	static void merge(int[] arr, int i, int end)
	{
		
		
	}

}
