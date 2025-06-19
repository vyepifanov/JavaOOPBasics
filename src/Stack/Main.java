package Stack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Stack stack = new Stack(scan.nextInt());
		int choice;
		char sim;
		try{
			while (true) {
				choice = scan.nextInt();
				try {
					switch (choice) {
						case 1:
							sim = scan.next().charAt(0);
							stack.push(sim);
							break;
						case 2:
							sim = stack.pop();
							System.out.println("Извлечено: " + sim);
							break;
						case 3:
							stack.print();
							break;
						case 4:
							stack.clear();
							break;
						default:
							return;
					}
				} catch (StackException e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (InputMismatchException e){
			System.out.println("Некорректный ввод данных");
		}
	}
}
