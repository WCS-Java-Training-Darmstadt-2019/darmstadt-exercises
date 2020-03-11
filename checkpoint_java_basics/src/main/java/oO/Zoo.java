package oO;

public class Zoo {

	public static void main (String[] args) {
		Animal cat1 = new Cat("Kitty", 2, "relaxed");
		System.out.println("Animal " + cat1.getName() + " is " + cat1.getState() + " and says " + cat1.makeNoise());
		
		Animal cat2 = new Cat("Katty", 2, "annoyed");
		System.out.println("Animal " + cat2.getName() + " is " + cat2.getState() + " and says " + cat2.makeNoise());
		
		Animal cat3 = new Cat("Foo", 0, "okay");
		System.out.println("Animal " + cat3.getName() + " is " + cat3.getState() + " and says " + cat3.makeNoise());
	}
}
