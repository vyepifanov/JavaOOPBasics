import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		IShape[] arr = new IShape[n];

		for (int i = 0; i < n; i++) {
			switch (scan.nextInt()) {
				case 1 -> {
					arr[i] = new Rectangle(scan.nextDouble(), scan.nextDouble());
				}
				case 2 -> {
					arr[i] = new Cube(scan.nextDouble());
				}
			}
		}

		int maxIndex = -1;
		double maxSquare = -1.0;
		for (int i = 0; i < n; i++) {
			double square = arr[i].computeSquare();
			System.out.printf("%.2f ", square);

			if (arr[i] instanceof Rectangle && maxSquare < square) {
				maxIndex = i;
				maxSquare = arr[i].computeSquare();
			}
		}
		System.out.println();

		if (maxSquare == -1) {
			System.out.println("ERROR");
		} else {
			Rectangle r = ((Rectangle)arr[maxIndex]);
			System.out.printf("Прямоугольник сторона 1 = %.1f, сторона 2 = %.1f Площадь = %.2f",
					r.getA(), r.getB(), maxSquare);
		}
	}

	public static void petWork() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Pet[] arr = new Pet[n];

		for (int i = 0; i < n; i++) {
			switch (scan.nextInt()) {
				case 1 -> {
					String name = scan.next();
					int age = scan.nextInt();
					String breed = scan.next();

					arr[i] = new Dog(name, age, breed);
				}
				case 2 -> {
					String name = scan.next();
					int age = scan.nextInt();
					String color = scan.next();

					arr[i] = new Cat(name, age, color);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i].getClass().getSimpleName() + " " + arr[i].getName() + ":");
			arr[i].getNoise();
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			if (arr[i] instanceof Cat) System.out.println(arr[i]);
		}
	}

	public static void studentsWork() {
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		Student.setBaseScholarship(base);

		int n = scan.nextInt();
		Learner[] arr = new Learner[n];
		for (int i = 0; i < n; i++) {
			switch (scan.nextInt()) {
				case 1 -> {
					String name = scan.next();
					int mark1 = scan.nextInt();
					int mark2 = scan.nextInt();
					String school = scan.next();
					String cl = scan.next();

					arr[i] = new Schoolboy(name, mark1, mark2, school, cl);
				}
				case 2 -> {
					String name = scan.next();
					int mark1 = scan.nextInt();
					int mark2 = scan.nextInt();
					String vuz = scan.next();
					String group = scan.next();

					arr[i] = new Student(name, mark1, mark2, vuz, group);
				}
			}
		}

		double average = 0.0;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " каникулы: " + arr[i].holidays());
			average += arr[i].averageGrade();
		}
		average /= n;
		System.out.printf("%.1f%n", average);

		boolean flag = true;
		int total = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] instanceof Student) {
				System.out.println(arr[i]);
				total += ((Student) arr[i]).calculateScholarship();
				flag = false;
			}
		}
		if (flag) {
			System.out.println("NO");
		} else {
			System.out.println(total);
		}
	}

	public static void emplWork() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Employee[] arr = new Employee[n];

		for (int i = 0; i < n; i++) {
			switch (scan.nextInt()) {
				case 1 -> {
					String surname = scan.next();
					String sex = scan.next();
					int age = scan.nextInt();
					int salary = scan.nextInt();

					arr[i] = new Employee(surname, sex, age, salary);
				}
				case 2 -> {
					String surname = scan.next();
					String sex = scan.next();
					int age = scan.nextInt();
					int salary = scan.nextInt();

					String status = scan.next();
					String specialization = scan.next();

					arr[i] = new Programmer(surname, sex, age, salary, status, specialization);
				}
				case 3 -> {
					String surname = scan.next();
					String sex = scan.next();
					int age = scan.nextInt();
					int salary = scan.nextInt();

					char gruppa = scan.next().charAt(0);

					arr[i] = new Accountant(surname, sex, age, salary, gruppa);
				}
			};
		}

		int totalSalary = 0;
		Employee empWithMax = arr[0];
		for (Employee emp : arr) {
			emp.show();
			totalSalary += emp.getSalary();

			if (empWithMax.getSalary() < emp.getSalary()) {
				empWithMax = emp;
			}
		}
		System.out.println(totalSalary);
		empWithMax.show();
		System.out.println();

		boolean flag = true;
		for (Employee emp : arr) {
			if (emp instanceof Programmer && ((Programmer) emp).getSpecialization().equals("frontend")) {
				emp.show();
				flag = false;
			}
		}

		if (flag) System.out.println("NO");
	}

	public static void truckWork() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Car[] arr = new Car[n];
		int y = 0;
		for (int i = 0; i < n; i++) {
			switch (scan.nextInt()) {
				case 1 -> {
					String brand = scan.next();
					String name = scan.next();
					double vol = scan.nextDouble();
					int year = scan.nextInt();

					arr[i] = new Car(brand, name, vol, year);
				}
				case 2 -> {
					String brand = scan.next();
					String name = scan.next();
					double vol = scan.nextDouble();
					int year = scan.nextInt();
					double capacity = scan.nextDouble();

					arr[i] = new Truck(brand, name, vol, year, capacity);
				}
			};
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

		double weigth = scan.nextDouble();
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (arr[i] instanceof Truck &&arr[i].getLife() <= 7 &&
					((Truck) arr[i]).ifCanCarry(weigth) ) {
				flag = false;
				System.out.println(arr[i]);
			}
		}
		if (flag) System.out.println("NO");
	}

	public static void purchaseWork() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Purchase[] arr = new Purchase[n];

		double discount = scan.nextDouble();
		FixDiscountPurchase.setDiscount(discount);
		FlowDiscountPurchase.setDiscount(discount);

		int minAmount = scan.nextInt();
		FlowDiscountPurchase.setMinAmount(minAmount);

		for (int i = 0; i < n; i++) {
			switch (scan.nextInt()) {
				case 1 -> {
					String name = scan.next();
					int price = scan.nextInt();
					int count = scan.nextInt();
					Commodity com = new Commodity(name, price);

					arr[i] = new Purchase(com, count);
				}
				case 2 -> {
					String name = scan.next();
					int price = scan.nextInt();
					int count = scan.nextInt();
					Commodity com = new Commodity(name, price);

					arr[i] = new FixDiscountPurchase(com, count);
				}
				case 3 -> {
					String name = scan.next();
					int price = scan.nextInt();
					int count = scan.nextInt();
					Commodity com = new Commodity(name, price);

					arr[i] = new FlowDiscountPurchase(com, count);
				}
			};
		}
		for (int i = 0; i < n; i++) System.out.println(arr[i]);

		int maxPurchase = 0;
		boolean allEqual = true;
		for (int i = 1; i < n; i++) {
			if (!arr[i].equals(arr[maxPurchase])) allEqual = false;
			if (arr[i].getCost() > arr[maxPurchase].getCost()) maxPurchase = i;
		}
		System.out.println(maxPurchase);
		System.out.println(allEqual ? "YES" : "NO");
	}

	public static void trialWork() {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		int timeLimit = scan.nextInt();

		Trial.setScore(score);
		LightTrial.setScore(score);

		StrongTrial.setScore(score);
		StrongTrial.setTimeLimit(timeLimit);

		int n = scan.nextInt();
		Trial[] arr = new Trial[n];
		for (int i = 0; i < n; i++) {
			switch (scan.nextInt()) {
				case 1 -> {
					arr[i] = new Trial(scan.next(), scan.nextInt(), scan.nextInt());
				}
				case 2 -> {
					arr[i] = new LightTrial(scan.next(), scan.nextInt(), scan.nextInt());
				}
				case 3 -> {
					arr[i] = new StrongTrial(scan.next(),
							scan.nextInt(), scan.nextInt(), scan.nextInt());
				}
			};
		}

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			if (arr[i].isPassed()) System.out.println(arr[i]);
		}
	}

	public static void carWork() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Car[] arr = new Car[n];
		int y = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = new Car(scan.next(), scan.next(), scan.nextDouble(), scan.nextInt());

			if (arr[y].getLife() > arr[i].getLife()) y = i;
		}

		int toChange = scan.nextInt();
		arr[toChange - 1].setVol(scan.nextDouble());

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println(arr[y]);
	}

	public static void purWork() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Purchase[] arr = new Purchase[n];
		int maxPurchase = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = new Purchase(new Commodity(scan.next(), scan.nextInt()), scan.nextInt());

			if (arr[i].getCost() > arr[maxPurchase].getCost()) {
				maxPurchase = i;
			}
		}

		int maxValue = arr[maxPurchase].getCost();
		for (int i = 0; i < n; i++) {
			if (arr[i].getCost() == maxValue) System.out.println(arr[i]);
		}
	}

	public static void btWork() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n < 0) {
			System.out.println("ERROR");
			return;
		}

		BusinessTrip[] arr = new BusinessTrip[n];
		for (int i = 0; i < (n - 1); i++) {
			arr[i] = new BusinessTrip(scan.next(), scan.nextInt(), scan.nextInt());
		}
		arr[n - 1] = new BusinessTrip(arr[0]);

		arr[0].setName(scan.next());
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

		int toFind = scan.nextInt();
		for (int i = 0; i < n; i++) {
			if (arr[toFind].equals(arr[i])) System.out.println(arr[i]);
		}
	}
}