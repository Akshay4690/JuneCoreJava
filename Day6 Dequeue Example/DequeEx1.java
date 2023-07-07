//Dequeue Example
package CFP;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx1 {

	public static void main(String[] args) {
	
		Deque <String> d1 = new ArrayDeque <>();
		
		d1.add("Apple");
		d1.add("Banana");
		d1.add("PineApple");
		d1.add("CusterdApple");
		
		d1.addFirst("Cherry");
		d1.addLast("Greps");
		
		d1.offer("Pery");
		
		d1.offerFirst("Apple");
		
		d1.offerLast("Greps");
		
		d1.push("Watermelon");
		
		System.out.println("Element in Que : " +d1);
		
		String removedElement1 = d1.remove();
		System.out.println("Removed Element : " + removedElement1);
		
		String removedElement2 = d1.removeFirst();
		System.out.println("Removed First Element : " + removedElement2);
		
//		String removedElement3 = d1.removeLast();
//		System.out.println("Removed First Element : " + removedElement3);
		
		String poll = d1.poll();
		System.out.println("Polled element : " + poll);
		
		String pop = d1.pop();
		System.out.println("pop element : " + pop);
		
		String firstelement = d1.element();
		System.out.println("First Element :" +firstelement);
		
		String peek = d1.peek();
		System.out.println("peeked element:" +peek);
		
		int size = d1.size();
		System.out.println("Size of the Deque : " +size );
		
		System.out.println("Element in Que : " +d1);
		
		
		
		
		

	}

}
