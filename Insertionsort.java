import java.io.*;
import java.util.*; 
public class Insertionsort
{
	public static void InsertionSort(int []arr) 
	{
		int n=arr.length;
		int i=1;
		/*
		We compare an element with the element to its left. If the element to its left is greater, We should shift the 
		greater element to the right by one position and the smaller one to the left.*/
		while(i<n)
		{
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) 
			{
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
			i++;
		}
	}
	public static void main(String[] args) throws Exception
	{
		 BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Size of the array");
        int n=Integer.parseInt(inp.readLine());
        int[] arr=new int[n];
        System.out.println("Enter the Elements of the array");
        String line=inp.readLine(); // For taking the input array in one line 
        String[] str=line.trim().split("\\s+");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
        }
        InsertionSort(arr);
        System.out.println("After Performing Insertion Sort on the Given Array :");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]+" ");
        }
	}
}
