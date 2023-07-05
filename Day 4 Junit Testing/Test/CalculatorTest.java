import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	
	@After
	public void testDown()
	{
		System.out.println("Succesfully Done");
	}
	@Test 
	public void testAdd()
	{
		int result = Calculator.add(6, 2);
		assertEquals(8,result);
	}
	
	@AfterClass
	public static void testDownClass()
	{
		System.out.println("Done");
	}
	
	@Before
	public void Message()
	{
		System.out.println("Welcome");
	}
	
	@BeforeClass
	public static void start()
	{
		System.out.println("Programm is started");
	}
	
}
