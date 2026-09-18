import java.util.Scanner;
class PairSum
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

	
       pairOfSum(arr);

    System.out.println("Pair which sum is 6 ");
        
   }

   static void pairOfSum(int[] arr)
   {
      for(int i=0;i<arr.length;i++)
	{
	    for(int j=i+1;j<arr.length;j++)
		{
		  if(arr[i]+arr[j]==6)
		   {
			System.out.println(arr[i]+" and "+arr[j]);
		   }
		}
	
	}
    
   }
}
