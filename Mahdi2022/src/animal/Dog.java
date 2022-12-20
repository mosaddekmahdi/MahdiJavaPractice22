package animal;

public class Dog extends Animal{
	 int leg;
	  String color;
	  boolean isPet;
		static int dogCount = 0;

		public Dog() {
			
			dogCount++;
			System.out.println("hello dog" + dogCount);

		
		}

		public int getLeg() {
			return leg;
		}

		public void setLeg(int leg) {
			this.leg = leg;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public boolean isPet() {
			return isPet;
		}

		public void setPet(boolean isPet) {
			this.isPet = isPet;
		}

		public static int getDogCount() {
			return dogCount;
		}

		public static void setDogCount(int dogCount) {
			Dog.dogCount = dogCount;
		}

		public Dog(int leg, String color, boolean isPet) {
			super();
			this.leg = leg;
			this.color = color;
			this.isPet = isPet;
		}

		@Override
		public String toString() {
			return "Dog [leg=" + leg + ", color=" + color + ", isPet=" + isPet + ", getLeg()=" + getLeg()
					+ ", getColor()=" + getColor() + ", isPet()=" + isPet() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

		@Override
		public void move() {
			
			System.out.println("Dog can walk and run!!");
		}
		
		
}

