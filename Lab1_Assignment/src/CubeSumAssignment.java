/**
 * Desc : Finding out the sum of cubes of a number.
 * @author ashav
 *
 */
public class CubeSumAssignment {

	public static void main(String[] args) {
		
    	int num=(1234);
    	int result=sumOfCubes(num);
    	System.out.println(result);
    }

	public static int sumOfCubes(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		while(num!=0)
		{
			int last = num%10;
			sum=sum+last*last*last;
			num=num/10;
	}
		return sum;

	}
	}


