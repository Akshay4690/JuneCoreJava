//Print the Nth Harmonic Number

package CFP;
import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of N ");
	
		int N = sc.nextInt();
		
		if (N <= 0)
		{
			System.out.println("Invalid Input, N Shoud be positive value");
			return ;
		}
		
		double harmonicNumber = 0;
		
		for(int i = 1; i <= N; i++)
		{
			harmonicNumber += 1.0 /i;
		}
		
		System.out.println(N+ "harmonic number is : " +harmonicNumber);

	}

}
