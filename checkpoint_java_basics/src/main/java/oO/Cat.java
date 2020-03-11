package oO;

public class Cat extends Animal {

	public Cat() {
		super();
	}

	public Cat(String name, int age, String state) {
		super(name, age, state);
	}

	@Override
	public String makeNoise() {
		if (this.getState().equals("relaxed")) {
			return "Meeouw...";
		} else {
			return "Krrchhhhhhh!";
		}
	}

}
