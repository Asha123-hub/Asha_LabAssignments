/**
 * Desc : Input an integer and then prints out all the prime numbers up to that Integer.
 * @author ashav
 *
 */

import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int index,index1, count=0;
        
        for(index = 1; index <=number; index++)
        {
        	count=0;
        	for(index1 = 2;index1 <= index/2; index++)
        	{
        		if(index % index1 == 0)
        		{
        			count++;
        			break;
        		}
        	}
        	if(count ==0 && number != 1)
        		System.out.println(index+" ");
        	
        }
	}

}
