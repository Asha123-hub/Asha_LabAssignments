/**
 * Desc : Create a method to check if a number is an increasing number.
 * @author ashav
 *
 */
import java.util.*;
public class IncreasingNumber {

	public static boolean checkNumber(int num) {
		int current=num%10;
		num=num/10;
		while(num>0) {
		    if(current<num%10) {
		    	return false;
		    }
		    current=num%10;
			num=num/10;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(checkNumber(number)) { 
		
			System.out.println(number+" is a increasing number");
		}
		else
			System.out.println(number+" is not a increasing number");
	}
        

}
