// Created By Deepanshu Tyagi 
// Linear Search Algorithm 
import java.io.*;
public class LinearSearch
{
	public static void main(String[] args) throws Exception
	{
     BufferedReader inp=new BufferedReader(new InputStreamReader(System.in)); // For read the input from the console
     System.out.println("Enter the Size of Array");
     int n=Integer.parseInt(inp.readLine());
     int[] arr=new int[n]; // defining the array 
     System.out.println("Enter the Elements of Array");
     
     /*
     for(int i=0;i<n;i++)
     {
     	arr[i]=Integer.parseInt(inp.readLine());
     }*/

     String line=inp.readLine(); // To read the integer in one line 
     String[] str=line.trim().split("\\s+"); // split the string into array 
       for(int i=0;i<n;i++)
     {
     	arr[i]=Integer.parseInt(str[i]);
     }
    int index=-1;
     System.out.println("Enter the Value you Want to search");
     int val=Integer.parseInt(inp.readLine());
     // Iterating over the array and find the value in the array entered by user 
     for(int i=0;i<n;i++)
     {
     	if(arr[i]==val) // If value match then store the index in the variable and break the loop
     	{
     		index=i;
     		break;
     	}
     }
if(index==-1)
{
	System.out.println("Sorry Entered Value does not exist in the array");
}
else 
{
	System.out.println("Value find at "+index+" index");
}
    
	}
}
