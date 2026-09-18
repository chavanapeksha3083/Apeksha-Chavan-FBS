import java.util.Scanner;
class Insertion
{
  

  public static void main(String args[])
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

       insertionSort(arr);
    System.out.println("Insertion sort are:");
        for(int i=0;i<arr.length;i++)
 	{
	   System.out.println(" "+arr[i]);
        }
   }

   static void insertionSort(int[] arr)
   {
    for(int i=0;i<arr.length;i++)
{
	int x= arr[i];
        int j= i-1;
	  while(j>=0)
	{
	    if(arr[j]>x)
		{

		arr[j+1]=arr[j];
		 j--;
		}
	   else
	    {
		break;
	    }

	}
    arr[j+1]=x;
}
    
   }
}
