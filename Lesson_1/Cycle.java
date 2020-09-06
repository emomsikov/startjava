public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println();

		int j = 6;
		while(j >= -6) {
			System.out.println(j);
			j -= 2;
		}

		System.out.println();

		int k = 10;
		int sum = 0;
		do {
			if(k % 2 == 0) {
				sum += k;
				k++;
			}
			k++;
		} while(k <= 20);

		System.out.println(sum);
	}
}