package CFP;

import java.util.Scanner;
public class ReplaceString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your name");
		String userName = sc.nextLine();
		
		if (userName.length() >= 3)
		{
			String replacedString = "Hello << UserName >>, How are you?".replace("<< UserName >>", userName);
			
			System.out.println(replacedString);
		}
		else
		{
			System.out.println("Invalid Name, Name must have at least 3 charecter.");
		}
	}

}
