import java.io.*;
public class BinarySearch
{
	public static int BinarySearch(int[] arr,int n,int target)
	{
		int start=0;
		int end=n-1;
		while(start<=end)
		{
            int mid=(start+end)/2;
            if(arr[mid]==target) // If our target id found then return the index 
            {
            	return mid;
            }
            else if(arr[mid]<target) // If our target is greater than the mid value then we move towards Right 
            {
            	start=mid+1;
            }
            else if(arr[mid]>target) // If our target is Lesser than the mid value then we move toward Left
            {
            	end=mid-1;
            }
		}
		return -1; // If we can't find the target in the array 
	}
	public static void main(String []args) throws Exception
	{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array");
		int n=Integer.parseInt(inp.readLine());
		int[] arr=new int[n];
		System.out.println("Enter the Elements of the array");
		String line=inp.readLine(); // To take the array in one line 
		String[] str=line.trim().split("\\s+");

		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(str[i]);
		}

		System.out.println("Enter the value you want to find");
		int val=Integer.parseInt(inp.readLine());
        int index=BinarySearch(arr,n,val);
        if(index<0)
        {
            System.out.println("Sorry we can't find entered value in the present array");
        }
        else
        {
        	System.out.println("Value "+val+" find at "+index+" Index");
        }
	}
}
