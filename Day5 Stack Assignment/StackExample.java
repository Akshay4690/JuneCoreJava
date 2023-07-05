//Write one Stack Example
package CFP;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	
		Stack <String> st = new Stack<>();
		
		st.push("Sunday");
		st.push("Monday");
		st.push("Tuesday");
		st.push("Wednesday");
		st.push("Thuesday");
		
		System.out.println("original Element of stack: "+st);
		
		System.out.println("Pop element: " +st.pop() );
		System.out.println("Pop element: " +st.pop() );
		System.out.println("ELement Of Stack after removing : " +st);
		
		System.out.println("Push elements : " + st.push("Friday"));
		System.out.println("Push elements : " + st.push("Saturday"));
		
		System.out.println("Element of stack after adding" +st);
	}

}
