package animal;

public abstract class Animal {
	boolean isAlive;
	String animalType;
	public abstract void move();
	public void eat() {
		System.out.println("Animal eats."); 
	}
}
