// PriorityQueue Example
package CFP;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
	
		PriorityQueue <String> p1 = new PriorityQueue<>();
		{
			p1.add("England");
			p1.add("Russia");
			p1.add("Australia");
			p1.add("Germany");
			p1.add("India");
			
			System.out.println("Elements in Queue : " +p1);
			
			while(p1.peek() != null)
			{
				System.out.println("Head Element :" +p1.peek());
				System.out.println("Remove Element : " +p1.poll());
				System.out.println("Priority of Queue :" +p1);
			}
		}
	}
}