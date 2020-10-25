/**
 * Desc   : To result names with salutations
 * Author : Asha Vinod
 * Date   : 24-10-2020
 * 
 *
 */
public class SalutationCheck {
	public static void main(String[] args) {
		String arr[][]=new String[2][];
		arr[0]=new String[3];
		arr[1]=new String[5];                                                      
		arr[0][0]="Mr";                                               //Salutations
		arr[0][1]="Mrs";
		arr[0][2]="Miss";
		
		arr[1][0]="Pratik";                                          //Names
		arr[1][1]="Aishwarya";
		arr[1][2]="Surya";
		arr[1][3]="Rohan";
		arr[1][4]="Rakesh";
		
		System.out.println(arr[0][0]+" "+arr[1][0]);                 //Displaying names with salutations
		System.out.println(arr[0][2]+" "+arr[1][1]);
		System.out.println(arr[0][1]+" "+arr[1][2]);
		System.out.println(arr[0][0]+" "+arr[1][3]);
		System.out.println(arr[0][0]+" "+arr[1][4]);

		
		
		
	}

}

