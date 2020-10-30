/**
 * Desc   : Returning The elements in the left half in uppercase and the elements in the right half in lower case.
 * Author : Asha Vinod
 * Date   : 23-10-2020
 *
 */
    import java.util.*;
	public class UppercaseLowercaseSorting {
		

		  public static void main(String[] args) {

			Scanner scan=new Scanner(System.in);
	        System.out.println("Enter the number of strings");                     
	        int size =scan.nextInt();
	        String stringArr[]=new String[size];
	        System.out.println("Enter the string");                       //entering the elements of the string and converting into lowercase
	        for(int itr=0;itr<size;itr++) {
	        	stringArr[itr]=scan.next();
	        }
	        String[] sortedArray=sortStrings(stringArr);                  //method is called
	        System.out.println("The sorted string array is");
	        for(int itr=0;itr<size;itr++) {
	        	System.out.println(sortedArray[itr]);
	        }
	        scan.close();
		}

	
	public static String[] sortStrings(String[] str) {                   //defining the method
		int len=str.length;
	    Arrays.sort(str);                                                //sorting the array
	    if(len%2==0) {                                                  
	        for(int i=0;i<len/2;i++) {
	    		str[i]=str[i].toUpperCase();
	    	}
	    	for(int j=len/2;j<len;j++) {
	    		str[j]=str[j].toLowerCase();
	    	}
	    else {
	    	for(int i=0;i<len/2+1;i++) {                                //sorting of the array if odd
	    		str[i]=str[i].toUpperCase();
	    	}
	    	for(int j=len/2+1;j<len;j++) {
	    		str[j]=str[j].toLowerCase();
	    	}
	    }
	    return str;                                                     //returning of the string array using method
	}
	}
