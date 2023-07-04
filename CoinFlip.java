package CFP;

import java.util.Scanner;

public class CoinFlip {

	public static void main (String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number of times coin flip");
		int toss = sc.nextInt();
		
		
		if (toss <= 0)
		{
			System.out.println("Invalid Credintial !, value shoud be positive integer");
		}
		int heads = 0;
		int tails = 0;
		
		for (int i = 0; i < toss; i++)
		{
			double randomValue = Math.random();
			if (randomValue < 0.5)
			{
				tails++;
			}
			else
			{
				heads++;
			}
		}
		
		double headPercentage = (double) heads/toss * 100;
		double tailPercentage = (double) tails/toss * 100;
		
		System.out.println("Number of heads: "+heads);
		System.out.println("Number of tails: "+tails);
		System.out.println("Percentage of heads: "+headPercentage);
		System.out.println("Percentage of tails: "+tailPercentage);
	}
}
