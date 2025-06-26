package Strategy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Message message = new Message(scan.nextLine());

		int type = scan.nextInt();
		switch (type) {
			case 1 -> message.setEditWay(new NoExtraSpaces());
			case 2 -> message.setEditWay(new NoDigits());
			case 3 -> message.setEditWay(new CapsFirstLetters());
			default -> message.setEditWay(new NoEditing());
		}

		message.print();
	}
}
