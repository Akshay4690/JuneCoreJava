//print the prime factor of function N

package CFP;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		
		int value = sc.nextInt();
		System.out.println("Prime factor is:" + value);
		primeFactor(value);
	}
	
	private static void primeFactor(int value) {
		
		for (int i=2; i*i <= value; i++)
		{
			while (value % i == 0)
			{
				System.out.println(i + " ");
				value /= i;
			}
		}
		
		if (value > 2)
		{
			System.out.println(value);
		}
	}

}
