import java.util.Scanner;

class CalculatorTest {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.println("Введите первое число: ");
		int num1 = scan.nextInt();
		calc.setNum1(num1);

		System.out.println("Введите знак математической операции: ");
		char operator = scan.next().charAt(0);
		calc.setOperator(operator);

		System.out.println("Введите второе число: ");
		int num2 = scan.nextInt();
		calc.setNum2(num2);

		System.out.println(calc.getResult());
	}
}