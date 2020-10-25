public class Calculator {
		private int num1;
		private int num2;
		private char operator;
		private int result;

		public void setNum1(int num1) {
			this.num1 = num1;
		}

		public void setNum2(int num2) {
			this.num2 = num2;
		}

		public void setOperator(char operator) {
			this.operator = operator;
		}

		public int getResult() {
			switch (operator) {
				case '*':
					result = num1 * num2;
					return result;
				case '/':
					result = num1 / num2;
					return result;
				case '+':
					result = num1 + num2;
					return result;
				case '-':
					result  = num1 - num2;
					return result;
				case '^':
					result = 1;
					for(int i = 1; i <= num2; i++) {
						result *= num1;
					}
					return result;
				case '%':
					result = num1 % num2;
					return result;
				default:
					System.out.println("Некорректный знак мат.операции. Введите необходимый мат.оператор из списка: * / + - ^ %");
			}
			return result;
		}
	}