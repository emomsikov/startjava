public class Calculator{
	public static void main(String[] args){

		int num1 = 2;
		int num2 = 3;
		int result = 0;
		char operation = '^';

		if(operation == '+'){
			result = num1 + num2;
			System.out.println("Result of addition " + num1 + " and " + num2 + " equals to "+ result);
		} else if(operation == '-'){
			result = num1 - num2;
			System.out.println("Result of substraction " + num2 + " from " + num1 + " equals to "+ result);
		} else if(operation == '*'){
			result = num1 * num2;
			System.out.println("Result of multiplication " + num1 + " and " + num2 + " equals to "+ result);
		} else if(operation == '/'){
			result = num1 / num2;
			System.out.println("Result of division " + num1 + " by " + num2 + " equals to "+ result);

		} else if(operation == '^'){
			result = 1;
			for(int i = 1; i <= num2; i++){
			result = result * num1;
			}
			System.out.println("Result of exponentiation " +num1 + " to the power of " + num2 + " equals to "+ result);
		} else if(operation == '%'){
			result = num1 % num2;
			System.out.println("Result of modulo division " + num1 + " by " + num2 + " equals to "+ result);
		}



	}
}