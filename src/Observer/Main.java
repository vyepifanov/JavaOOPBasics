package Observer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Informator informator1 = new Informator("МЧС");
		Informator informator2 = new Informator("Налоговая инспекция");

		Institution one = new Institution("ГГУ им. Ф. Скорины");
		Institution two = new Institution("БГУ");

		informator1.addListener(one);
		informator1.addListener(two);

		informator2.addListener(one);
		informator2.addListener(two);

		String data = scan.nextLine();
		while (!"end".equals(data)) {
			String[] words = data.split(";");
			int informatorNumber = Integer.parseInt(words[0]);
			if (informatorNumber == 1) {
				informator1.setText(words[1]);
			} else {
				informator2.setText(words[1]);
			}
			data = scan.nextLine();
		}
	}

	public void newspaperTask() {
		Scanner scan = new Scanner(System.in);
		Newspaper newspaper = new Newspaper();

		Bear potap = new Bear("Потап");
		Bear nastasya = new Bear("Настасья");
		Rabbit trusishka = new Rabbit("Трусишка");
		Wolf alex = new Wolf("Алекс");

		newspaper.registerObserver(potap);
		newspaper.registerObserver(nastasya);
		newspaper.registerObserver(alex);
		newspaper.registerObserver(trusishka);

		newspaper.publishNewIssue();

		String unsubscribedName = scan.nextLine();
		System.out.println("\n" + unsubscribedName + " не хочет получать газету\n");

		if (unsubscribedName.equals("Потап")) {
			newspaper.removeObserver(potap);
		} else if (unsubscribedName.equals("Настасья")) {
			newspaper.removeObserver(nastasya);
		} else if (unsubscribedName.equals("Алекс")) {
			newspaper.removeObserver(alex);
		} else if (unsubscribedName.equals("Трусишка")) {
			newspaper.removeObserver(trusishka);
		}

		newspaper.publishNewIssue();
	}
}
