public class MyFirstGame {
	public static void main(String[] args) {
		int computerNum = 0;
		int playerNum = 0;
		boolean check = false;

		for(int i = 0; i < 10; i++) {
			computerNum = (i * 3) % 100;
			playerNum = (i * 7) % 100;
		}

		if(playerNum == computerNum) {
			System.out.println("Вы угадали!");
			check = true;
		}
		// бесконечный цикл - направь пжс в нужном направлении
		while(check == false) {
			if(playerNum > computerNum) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
					playerNum = (playerNum + 1) / 2;
			} else if(playerNum < computerNum) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
					playerNum = ((playerNum - 1) * 2) % 100;
			} else if(playerNum == computerNum) {
				System.out.println("Вы угадали!");
				check = true;
			}
		}
	}
}