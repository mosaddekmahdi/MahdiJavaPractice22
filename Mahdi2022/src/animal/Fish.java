package animal;

public class Fish {
	String color;
	boolean isFish;
	static int fishCount;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFish() {
		return isFish;
	}

	public void setFish(boolean isFish) {
		this.isFish = isFish;
	}

	public static int getFishCount() {
		return fishCount;
	}

	public static void setFishCount(int fishCount) {
		Fish.fishCount = fishCount;
	}

	public Fish(String color, int legCount, boolean isFish) {
		super();
		this.color = color;
		this.isFish = isFish;
	}

	
	@Override
	public String toString() {
		return "Fish [color=" + color + ", isFish=" + isFish + ", getColor()=" + getColor() + ", isFish()=" + isFish()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
 
	public Fish()
	{
		fishCount++;
		System.out.println("Hello Fish" + getFishCount());
		
	}
}

