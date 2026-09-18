import java.util.Scanner;

class TestSearchElementArray
{
public static void main(String args[])

{
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter First array elements :");

   int[] arr1 = new int[4];
    int[] arr2 = new int[6];
    int[] arr3 = new int[12];
  


for(int i =0;i<arr1.length;i++)

{
 arr1[i]=sc.nextInt();

}
System.out.println("Enter Second array elements :");
for(int i =0;i<arr2.length;i++)

{
 arr2[i]=sc.nextInt();

}


	for(int i=0;i<arr1.length;i++)
	{
		arr3[i]=arr1[i];
	}
	for(int i=0,j=arr1.length;i<arr2.length;i++,j++)
	{
		arr3[j]=arr2[i];
	}



   System.out.println("Merged Array:")	;
	System.out.println("[");
	for(int i=0;i<arr3.length;i++)
  {


for(int i=0;i<arr1.length;i++)
{
 
for(int j=i+1;j<arr2.length;j++)
{
			
     if(arr1[i]>arr2[j])
     {
		
      int temp=arr1[i];
      arr2[i]=arr1[i];
      arr1[i]=temp;

      }
		
     
 }

 System.out.print(" "+arr1[i]);

}

	
	  System.out.println(+arr3[i]);
	}
	System.out.println("]");



System.out.println("Sorted Elements are :");



}
}
	