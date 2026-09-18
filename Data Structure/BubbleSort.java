import java.util.Scanner;
class Bubble
{
  static int x;  

  public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array elements :");

	int []arr = new int[5];

        x = arr.length - 1;

	for(int i=0;i<=x;i++)   
	{
  	    arr[i] = sc.nextInt();
        }

	for(int i=0;i<=x;i++)
        {
  	    System.out.println(" "+arr[i]);
        }

        bubbleSort(arr);

        for(int i=0;i<=x;i++)
 	{
	   System.out.println(" "+arr[i]);
        }
   }

   static void bubbleSort(int[] arr)
   {
       int swap = 0;
       int flag;

       for(int j=0;j<x;j++)
       {
           flag = 0;

           for(int i=0;i<x-j;i++)
           {
               if(arr[i] > arr[i+1])
               {
                   int temp = arr[i];
                   arr[i] = arr[i+1];
                   arr[i+1] = temp;

                   swap++;
                   flag = 1;
               }
           }

           if(flag == 0)
           {
               break;
           }
       }
       System.out.println("Total Swappings are: " + swap);
   }
}
