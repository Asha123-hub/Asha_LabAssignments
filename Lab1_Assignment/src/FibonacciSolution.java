import java.util.Scanner;
public class FibonacciSolution {

	public static int nonRecursiveFibonacci(int number)
	{
		int first=1,second=1;
		System.out.println(first+" "+second+" ");
		for(int i=2;i<number;i++)
		{
			int sum=first+second;
			System.out.println(sum+" ");
			first=second;
			second=sum;
		}
		return 0;
	}
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int number=sc.nextInt();
    nonRecursiveFibonacci(number);
    
	}

}
