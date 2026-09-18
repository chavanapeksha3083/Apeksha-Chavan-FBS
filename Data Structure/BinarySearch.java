import java.util.Scanner;
class Binary
{

 public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter array elements :");

int []arr= new int[10];

for(int i=0;i<arr.length;i++)

{
 arr[i]= sc.nextInt();

}


System.out.println("Enter element you want search:");
int search =sc.nextInt();


for(int i=0;i<arr.length;i++)
{
 System.out.println(" "+arr[i]);
}

int res=binarySearch(arr,search);

if(res!=-1)
System.out.println("Found Element");
else
System.out.println("Not Found Element");


}



static int binarySearch(int[] arr,int search)
{
int start=0;
int end=arr.length-1;

while(start<=end)
{

 int mid=(start+end)/2;

if(arr[mid]==search)

    return mid;

else if(arr[mid]>search)

    end =mid-1;


else

    start= mid+1;

}
return -1;

}


}


