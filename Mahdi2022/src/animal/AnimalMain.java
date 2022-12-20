package animal;

import java.util.Scanner;

public class AnimalMain {
	public static void main(String[] args) {
		
		  Dog d1 = new Dog();

		  Dog d2 = new Dog();

		  Dog d3 = new Dog();

		  Fish f1 = new Fish();
					
		  Fish f2 = new Fish();
					
		  
		  Car car = new Car();
		  car.go();
		  
		  Bike bike = new Bike();
		  //bike.stop();
		  
		  System.out.println(car.speed);
		  
		  System.out.println("car has " + car.doors + " doors");
		  
		  System.out.println("bike has " + bike.pedals + " pedals");
		  
		  d1.move();
		  
		 
		
		  }

}
