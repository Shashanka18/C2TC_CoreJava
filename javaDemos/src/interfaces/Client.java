package interfaces;
public class Client {
	public static void main(String args[])
	{   
		Animal tiger = new Tiger();
		tiger.eat();
		tiger.makesSound();
		
		Animal animal2=new Cow();
		animal2.eat();
		animal2.makesSound();
	}   

}















