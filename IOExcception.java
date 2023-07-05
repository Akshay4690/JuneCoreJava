// IO Exception Assignment

package CFP;

import java.io.*;

public class IOExcception {

	public static void main(String[] args) {
	
		try {
			File myFile = new File("filename.txt");
			FileInputStream myStream = new FileInputStream(myFile);
			myStream.close();
		}
		catch(IOException e)
		{
			System.out.println("An io Exception occured.");
			e.printStackTrace();
		}
	}

}
