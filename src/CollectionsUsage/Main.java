package CollectionsUsage;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Garage garage = new Garage(Integer.parseInt(scan.next()));

		while (scan.hasNext()) {
			int action = scan.nextInt();
			try {
				switch (action) {
					case 1 -> {
						String brand = scan.next();
						double volume = scan.nextDouble();
						int box = scan.nextInt();

						Car car = new Car(brand, volume);
						if (garage.isFree(box)) {
							garage.putCar(car, box);
						} else {
							int freeBox = garage.getFreeBoxnumber();
							if (freeBox > 0) {
								garage.putCar(car, freeBox);
							}
						}
					}
					case 2 -> {
						int box = scan.nextInt();
						if (box < 1 || box > garage.getCapacity() || garage.isFree(box)) {
							System.out.println("ERROR");
						} else {
							System.out.println(garage.getCar(box));
						}
					}
					case 3 -> {
						System.out.println("----------------");
						for (Car car : garage) {
							System.out.println(car);
						}
						System.out.println("----------------");
					}
					case 4 -> {
						return;
					}
					default -> {
						return;
					}
				};
			} catch (ErrorBoxException exc) {}
		}
	}

	public void rangeIteration() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		Range r = new Range(a, b);

		for (Integer item : r) {
			System.out.print(item + " ");
		}
	}

	public void reverseArr() {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[scan.nextInt()];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		ReverseArray reverse = new ReverseArray(array);
		for (Integer item : reverse) {
			System.out.print(item + " ");
		}
	}

	public void commentSort() {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter(";|\n");

		int n = Integer.parseInt(scan.nextLine().trim());
		Comment[] comments = new Comment[n];

		for (int i = 0; i < n; i++) {
			String author = scan.next().trim();
			String text = scan.next().trim();
			int likes = Integer.parseInt(scan.next().trim());
			comments[i] = new Comment(author, text, likes);
		}

		Arrays.sort(comments, Comparator.comparingInt(Comment::getLikes).reversed());
		for (Comment comment : comments) {
			System.out.println(comment);
		}

		System.out.println();

		Arrays.sort(comments, Comparator.comparing(Comment::getAuthor));
		for (Comment comment : comments) {
			System.out.println(comment);
		}
	}

	public void purchaseSort() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Purchase[] arr = new Purchase[n];
		for (int i = 0; i < n; i++) {
			String name = scan.next();
			int price = scan.nextInt();
			int quan = scan.nextInt();

			arr[i] = new Purchase(name, price, quan);
		}

		Arrays.sort(arr, new Comparator<Purchase>() {
			@Override
			public int compare(Purchase o1, Purchase o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (int i = 0; i < n; i++) {
			System.out.printf("%s %d %d %d%n",
					arr[i].getName(), arr[i].getPrice(), arr[i].getQuantity(), arr[i].getValue());
		}

		System.out.println();
		Arrays.sort(arr, new Comparator<Purchase>() {
			@Override
			public int compare(Purchase o1, Purchase o2) {
				return Integer.compare(o1.getValue(), o2.getValue());
			}
		});
		for (int i = 0; i < n; i++) {
			System.out.printf("%s %d %d %d%n",
					arr[i].getName(), arr[i].getPrice(), arr[i].getQuantity(), arr[i].getValue());
		}
	}

	public void purchaseSet() {
		Scanner scan = new Scanner(System.in);
		MySet<Purchase> set = new MySet<>(3);

		String buffer = scan.nextLine();
		while (!"end".equals(buffer)) {
			String[] parts = buffer.split(" "); //разделяем на слова
			set.add(new Purchase(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
			buffer = scan.nextLine();
		}

		set.print();
	}

	public void studentsStack() {
		Scanner scan = new Scanner(System.in);
		Stack<Student> students = new Stack<>(10);

		while (true) {
			String input = scan.next();
			if (input.equalsIgnoreCase("конец")) {
				break;
			}

			double avgMark = scan.nextDouble();
			int age = scan.nextInt();
			Student student = new Student(input, avgMark, age);

			try {
				students.push(student);
			} catch (StackException exc) {
				System.out.println(exc.getMessage());
			}
		}

		students.print();
	}

	public void splitStudents() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> young = new ArrayList<>();
		ArrayList<Student> old = new ArrayList<>();

		while (true) {
			String input = scan.next();
			if (input.equalsIgnoreCase("end")) {
				break;
			}

			double avgMark = scan.nextDouble();
			int age = scan.nextInt();
			Student student = new Student(input, avgMark, age);

			if (age >= 18) {
				old.add(student);
			} else {
				young.add(student);
			}
		}

		if (young.isEmpty()) {
			System.out.println("Пустой список");
		} else {
			System.out.println(young.toString());
		}

		if (old.isEmpty()) {
			System.out.println("Пустой список");
		} else {
			System.out.println(old.toString());
		}
	}

	public void splitNumbers() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();

		while (true) {
			String input = scan.next();
			if (input.equalsIgnoreCase("finish")) {
				break;
			}

			try {
				int number = Integer.parseInt(input);
				if (number >= 0) {
					pos.add(number);
				} else {
					neg.add(number);
				}
			} catch (NumberFormatException e) {
				pos.add(0);
			}
		}

		Collections.sort(pos);
		Collections.sort(neg);

		if (pos.isEmpty()) {
			System.out.println("Пустой список");
		} else {
			for (int num : pos) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		if (neg.isEmpty()) {
			System.out.println("Пустой список");
		} else {
			for (int num : neg) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
