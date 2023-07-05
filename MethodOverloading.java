// MethodOverloading Assignment

package CFP;
import java.util.Scanner;
public class MethodOverloading {

	public  int add(int a, int b)
	{
		return a+b;
	}
	
	public double add (double a, double b)
	{
		return a+b;
	}
	
	public int add (int a, int b, int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		
		MethodOverloading m1 = new MethodOverloading();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the first Value:");
		int a = sc.nextInt();
		System.out.println("Enter the second Value:");
		int b = sc.nextInt();
		
		
		int sum1 = m1.add(a,b);
		System.out.println("Ans: " +sum1);

		System.out.println("Enter the first double Value:");
		double P =sc.nextDouble();
		System.out.println("Enter the Second double Value:");
		double Q = sc.nextDouble();
		
		double sum2= m1.add(P,Q);
		System.out.println("Ans: "+sum2);
		
		System.out.println("Enteer the first value");
		int X = sc.nextInt();
		System.out.println("Enter the Second value");
		int Y = sc.nextInt();
		System.out.println("Enter the Thirde value");
		int Z = sc.nextInt();

		int sum3 = m1.add(X,Y,Z);
		System.out.println("Ans :" +sum3);
		
	}

}
