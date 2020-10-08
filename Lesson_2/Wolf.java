public class Wolf {
	private String sex = "male";
	private String name = "Alfa";
	private double weight = 22.3;
	private int age = 5;
	private String colour = "grey";

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		if(age <= 8) {
			this.age = age;
		} else{
			System.out.println("Incorrect age");
		}
	}

	public int getAge() {
		return age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void walk() {
		System.out.println("I can walk");
	}

	public void sit() {
		System.out.println("and I can sit");
	}

	public void run() {
		System.out.println("No run no food");
	}

	public void howl() {
		System.out.println("No way, also I can howl");
	}

	public void hunt() {
		System.out.println("No hunt no wolf?");
	}
}