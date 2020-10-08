public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.setSex("female");
		System.out.println("sex = " + wolfOne.getSex());

		wolfOne.setName("Beta");
		System.out.println("name = " + wolfOne.getName());

		wolfOne.setWeight(15.7);
		System.out.println("weight = " + wolfOne.getWeight());

		wolfOne.setAge(5);
		System.out.println("age = " + wolfOne.getAge());

		wolfOne.setColour("grey");
		System.out.println("colour = " + wolfOne.getColour());

		wolfOne.walk();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}