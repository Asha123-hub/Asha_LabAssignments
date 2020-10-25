/**
 * Desc   : Removes all the duplicates in the array, return the resulting array in descending order.
 * Author : Asha Vinod
 * Date   : 23-10-2020
 *
 */
import java.util.*;
public class DuplicatesRemoval {
	private static int duplicatesRemoval(int[] arr, int total) {
        int j=0;
		int temp[] = new int[total];
		for(int i=0;i<total-1;i++)                                                //sorting the array in descending order
		{
			if (arr[i]!=arr[j+1])
					{
				      temp[j]=arr[i+1];
				    		  j++;
					}
		}
		
		temp[j]=arr[total-1];
		for(int i=0;i<total;i++)
		{
			arr[i]=temp[i];
		}
		return j;
	}

      public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements in the array : ");
      n=sc.nextInt();
      int arr[]=new int[n];                                                       //initializing the array
      System.out.println("Enter the elements of array : ");
      for(int i=0;i<n;i++)                                                        //displaying the elements in the array
      {
    	  arr[i]=sc.nextInt();
    	  
      }
      Arrays.sort(arr);
      int length = duplicatesRemoval(arr,n);
      System.out.println("The new array is ");
      for(int i=length;i>0;i--)
      {
    	  System.out.println(arr[i]+" ");                                         //elements of the array after removal of duplicates
      }
	}
}
	

	
