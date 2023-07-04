package CFP;
// Abstract Method Example 
// Fish + Dolphine + Shark = Fishes

public class Shark extends Fish {

	@Override
	public void size() {
		System.out.println(150);
	}

	@Override
	public void color() {
		System.out.println("Grey");
	}

}
