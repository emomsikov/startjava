import java.util.Scanner;

class CalculatorTest {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.println("Введите первое число: ");
		calc.setNum1(scan.nextInt());

		System.out.println("Введите знак математической операции: ");
		calc.setOperator(scan.next().charAt(0));

		System.out.println("Введите второе число: ");
		calc.setNum2(scan.nextInt());

		System.out.println(calc.calculate());

		boolean check = true;

		while (check) {
			System.out.println("Хотите продолжить? [yes/no]: ");
			String userInput = scan.next();
			if(userInput.equals("yes")) {
				check = false;
				break;
			} else if(userInput.equals("no")) {
				check = false;
				break;
			}
		}
	}
}