
import java.util.*;
import java.io.*;
public class BubbleSort
{
    public static int[] BubbleSort(int[] arr) // Function which perform Bubble Sort
    {
    	int n=arr.length;
    	for(int i=0;i<n;i++)
    	{
    		Boolean flag=true;
    		for(int j=1;j<n-i;j++)
    		{
    			if(arr[j]<arr[j-1]) // If first element is lesser than the second element 
    			{
    				swap(j,j-1,arr);
    				flag=false; 
    			}
    		}
    		if(flag==true) // If we don't enter in swap condition condition that means our array is already sorted so we break the outer loop
    		{
    			break;
    		}
    	}
    	return arr; // return the sorted array 
    }
    public static void swap(int a,int b,int[] arr) // Function for Swapping 
    { 
    	int temp=arr[a];
    	arr[a]=arr[b];
    	arr[b]=temp;
    }
	public static void main(String[] args) throws Exception
    {
    	BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the Size of the array");
    	int n=Integer.parseInt(inp.readLine());
    	int[] arr=new int[n];
    	System.out.println("Enter the Elements of the Array");
    	String line=inp.readLine(); // Read the array element in one line 
    	String[] str=line.trim().split("\\s+");
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=Integer.parseInt(str[i]);
    	}
    	BubbleSort(arr);
    	System.out.println("Array after perform Bubble Sort");
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}

    }
}
