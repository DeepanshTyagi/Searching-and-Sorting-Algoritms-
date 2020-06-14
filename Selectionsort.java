
import java.io.*;
import java.util.*;
public class Selectionsort
{
	public static void SelectionSort(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
                if(arr[j]<arr[min])
                {
                	min=j; // Find the minimum index in each iteration  
                }
			}
			// Swap the minimum element and the leftmost element of unsorted array
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
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
        System.out.println("Array after performing Selection sort");
        SelectionSort(arr);
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]+" ");
        }
	}
}
