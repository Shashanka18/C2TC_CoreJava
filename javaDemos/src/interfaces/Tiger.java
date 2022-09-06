package interfaces;

public class Tiger implements Animal {
	
	public void eat() {
		System.out.println("Tiger eats meat");
	}

	@Override
	public void makesSound() {
		System.out.println("Tiger roars");
	}
	

}
