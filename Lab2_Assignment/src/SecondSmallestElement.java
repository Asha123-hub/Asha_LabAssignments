/**
 * Desc   : Returning the second smallest element in the array.
 * Author : Asha Vinod
 * Date   : 23-10-2020
 *
 */
public class SecondSmallestElement {
	
	public static int getSecondSmallest(int[] a,int total) {            //method definition
			int temp;
		for(int i=0;i<total;i++)                                       //array sorting
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];                                                   //returns the second smallest element
		}
	public static void main(String[] args) {
      int a[]={1,3,6,7,5,8};
      System.out.println("Second smallest:"+getSecondSmallest(a,6));   //method is called
	}

}
