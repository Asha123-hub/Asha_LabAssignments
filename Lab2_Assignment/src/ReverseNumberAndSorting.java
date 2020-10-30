/**
 * Desc   : Reverse the number and sort the array.
 * Author : Asha Vinod
 * Date   : 23-10-2020
 *
 */
import java.util.*;
public class ReverseNumberAndSorting {                                        //reversing the elements
	public static int[] getSorted(int[] arr) {                               //method definition
		for(int itr=0;itr<arr.length;itr++) {
			int reverse=0;
			while(arr[itr]>0) {          
				int temp=arr[itr]%10;
				reverse=reverse*10+temp;
				arr[itr]=arr[itr]/10;
			}
			arr[itr]=reverse;
		}
		Arrays.sort(arr);                                                    //sorting the array
		return arr;
	}

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size=scan.nextInt();
        int array[]=new int[size];                                           //initializing the array
        System.out.println("Enter the elements in the array");              //elements of the array entered by the user
        for(int itr=0;itr<size;itr++) {
       	 array[itr]=scan.nextInt();
        }
        int sortedArray[]=getSorted(array);
        System.out.println("The sorted array is");                         //elements of the array after sorting
        for(int itr=0;itr<size;itr++) {
        	System.out.println(sortedArray[itr]);                                         
        }
        scan.close();
	}

}
