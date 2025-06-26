package Observer;

import java.util.ArrayList;
import java.util.List;

public class Newspaper implements Subject{
	private List<Observer> observers = new ArrayList<>();
	private int issueNumber = 0;

	public void publishNewIssue() {
		issueNumber++;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update("Лесная правда, номер " + issueNumber);
		}
	}
}
