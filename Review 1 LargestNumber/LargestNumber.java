package CFP;
//Review - Find second and Third Largest Number in the Array
public class LargestNumber {

	public static void main(String[] args) {
		
		int [] a = {2,5,6,7,3,4,8,9};

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i = 0; i<a.length; i++)
		{
			if (a[i] > first)
			{
				third = second ;
				second = first ;
				first = a[i];
			}
			else if (a[i] > second)
			{
				third = second;
				second = a[i];
			}
			else if (a[i] > third)
			{
				third = a[i];
			}
		}
		
		System.out.println("Second Largest Number: " +second);
		System.out.println("Third Largest Number: " +third);
	}

}
