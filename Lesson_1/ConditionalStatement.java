public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 29;
		boolean isMale = true;
		double height = 1.79;
		char firstNameLetter = 'Y';

		if(age > 20) {
			System.out.println("Welcome to Aging!");
		}

		if(isMale) {
			System.out.println("If it made me smarter...");
		}

		if(!isMale) {
			System.out.println("Oopps!");
		}

		if(height < 1.80) {
			System.out.println("How do you live with that?!");
		} else {
			System.out.println("Great people make great things.");
		}

		if(firstNameLetter == 'M') {
			System.out.println("Your name starts with M");
		} else if(firstNameLetter == 'E') {
			System.out.println("Your name starts with E");
		} else {
			System.out.println("Your name starts with " + firstNameLetter);
		}
	}
}