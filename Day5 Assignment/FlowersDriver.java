// Double LinkedList Example
// Flower + FlowerDriver

package CFP;

public class FlowersDriver {

	public static void main(String[] args) {
	
		Flowers rose = new Flowers ("Rose");
		Flowers lily = new Flowers ("Lily");
		Flowers tulip = new Flowers ("Tulip");
		
		rose.setNext(lily);
		lily.setPrev(rose);
		lily.setNext(tulip);
		tulip.setPrev(lily);
		
		Flowers current = rose;
		while(current != null)
		{
			System.out.println(current.getName());
			current = current.getNext();
		}

		current = tulip;
		while (current != null)
		{
			System.out.println(current.getName());
			current = current.getPrev();
		}
	
	}

}
