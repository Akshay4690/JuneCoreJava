//Write a java program take one final,finally ,finalize Example 

package CFP;

public class FinalExample {

	public static void main(String[] args) {
	
		final int num = 20;
		
//		public void divide(int a, int b)
//		{
		try {
			int result = divide(10,0);
			System.out.println("Result: " +result);
			}catch (ArithmeticException e) {
			System.out.println("Caught exception:" + e.getMessage());
			}
			finally
			{
				System.out.println("Finally block Executed");
			}
		
		
		FinalExample e1 = new FinalExample ();
		e1 = null;
		System.gc();
		}
		
		public static int divide ( int divide, int divisor)
		{
			return divide/divisor;
			
		}
		
		protected void finalize() throws Throwable {
			System.out.println("Finslize method called");
		}
		

}
