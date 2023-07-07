// Double LinkedList Example
//Flower + FlowerDriver
package CFP;

public class Flowers {
	
	private String name;
	private Flowers prev;
	private Flowers next;
	
	public Flowers(String name)
	{
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public Flowers getPrev () {
		return prev;
	}
	
	public void setPrev (Flowers prev) {
		this.prev = prev;
	}
	
	public Flowers getNext() {
		return next ; 
	}
	
	public void setNext(Flowers next) {
		this.next = next ;
	}
	
}
