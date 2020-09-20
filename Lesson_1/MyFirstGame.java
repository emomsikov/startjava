public class MyFirstGame {
	public static void main(String[] args) {
		int computerNum = 0;
		int playerNum = 0;

		computerNum = 76;
		while(computerNum != playerNum) {
			if(playerNum > computerNum) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				playerNum = (playerNum + 1) / 2;
			} else if(playerNum < computerNum) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				playerNum = (playerNum + 1) * 2;
			}
		}
		System.out.println("Вы угадали!");
	}
}