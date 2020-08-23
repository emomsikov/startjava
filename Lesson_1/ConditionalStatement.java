public class ConditionalStatement{
	
	public static void main(String[] args){

		int yourAge = 29;
		boolean yourSexIsMale = true;
		double yourHeight = 1.79;
		char yourNameStartsWith = 'Y';

		if(yourAge > 20){
			System.out.println("Welcome to Aging!");
		}

		if(yourSexIsMale){
			System.out.println("If it made me smarter...");
		}

		if(!yourSexIsMale){
			System.out.println("Oopps!");
		}

		if(yourHeight < 1.80){
			System.out.println("How do you live with that?!");
		}else{
			System.out.println("Great people make great things.");
		}

		if(yourNameStartsWith == 'M'){
			System.out.println("Your name starts with M");
		}else if(yourNameStartsWith == 'E'){
			System.out.println("Your name starts with E");
		}else{
			System.out.println("Your name starts with " + yourNameStartsWith);
		}


	}
}