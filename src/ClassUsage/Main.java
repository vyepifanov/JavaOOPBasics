package ClassUsage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Dog dog1 = new Dog(scan.next(), scan.next(), scan.next(), scan.nextDouble());
		Dog dog2 = new Dog(scan.next(), scan.next(), scan.next(), scan.nextDouble());

		double compareResult = dog1.compareTo(dog2);
		if (compareResult > 0) {
			System.out.println("Первая собака больше");
		} else if (compareResult < 0) {
			System.out.println("Вторая собака больше");
		} else {
			System.out.println("Собаки одинакового размера");
		}
	}

	public void getSum() {
		Scanner scan = new Scanner(System.in);
		String sent = scan.nextLine();

		String[] arr = sent.split("#");
		double result = 0.0;

		for (int i = 0; i < arr.length; i++) {
			try {
				double number = Double.parseDouble(arr[i]);
				result += number;
			} catch (NumberFormatException e) {
				continue;
			}
		}

		System.out.printf("%.1f", result);
	}

	public void getMax() {
		Scanner scan = new Scanner(System.in);
		String sent = scan.nextLine();

		int maxNumber = 0;
		int currentNumber = 0;

		for (int i = 0; i < sent.length(); i++) {
			char c = sent.charAt(i);
			if (Character.isDigit(c)) {
				currentNumber = currentNumber * 10 + (c - '0');
				if (currentNumber > maxNumber) {
					maxNumber = currentNumber;
				}
			} else {
				currentNumber = 0;
			}
		}

		System.out.println(maxNumber);
	}

	public void calculator() {
		Scanner scan = new Scanner(System.in);
		String sent = scan.nextLine();

		try {
			int operPos = -1;
			for (int i = 0; i < sent.length(); i++) {
				if (sent.charAt(i) == '+' || sent.charAt(i) == '-' ||
						sent.charAt(i) == '*' || sent.charAt(i) == '/' || sent.charAt(i) == '%') {
					operPos = i;
					break;
				}
			}

			if (operPos <= 0 || operPos == sent.length() - 1) {
				throw new IllegalArgumentException();
			}

			String leftOperand = sent.substring(0, operPos);
			String rightOperand = sent.substring(operPos + 1);

			int a = Integer.parseInt(leftOperand);
			int b = Integer.parseInt(rightOperand);
			char operator = sent.charAt(operPos);

			if (a < 0 || b < 0) {
				throw new IllegalArgumentException();
			}

			int value = switch(operator) {
				case '+' -> a + b;
				case '-' -> a - b;
				case '*' -> a * b;
				case '/' -> a / b;
				case '%' -> a % b;
				default -> throw new IllegalArgumentException();
			};

			System.out.printf("%d%c%d=%d", a, operator, b, value);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
