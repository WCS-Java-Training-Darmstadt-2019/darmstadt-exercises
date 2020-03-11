package oO;

public class Animal {

	private String name;
	private int age;
	private String state;
	
	public Animal() {
	}

	public Animal(String name, int age, String state) {
		super();
		this.name = name;
		this.age = age;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String makeNoise() {
		if (this.getState().equals("relaxed")) {
			return "Yeah";
		} else {
			return "No!";
		}
	}
}
