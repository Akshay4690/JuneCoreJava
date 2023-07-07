package CFP;
// Review - Count and Sum of the Number 
public class Even {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0 ;
		
		for (int i = 1; i<=50; i++)
		{
			if (i % 2 == 0)
			{
				count ++;
				sum += i ;
			}
		}
		System.out.println("count of even number: " +count);
		System.out.println("Sum of even numbers : " +sum);
	}

}
