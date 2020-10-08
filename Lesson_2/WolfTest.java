public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.sex = "female";
		System.out.println("sex = " + wolfOne.sex);
		wolfOne.name = "Beta";
		System.out.println("name = " + wolfOne.name);
		wolfOne.weight = 15.7;
		System.out.println("weight = " + wolfOne.weight);
		wolfOne.age = 7;
		System.out.println("age = " + wolfOne.age);
		wolfOne.colour = "grey";
		System.out.println("colour = " + wolfOne.colour);

		wolfOne.walk();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}