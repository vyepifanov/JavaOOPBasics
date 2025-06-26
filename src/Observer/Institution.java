package Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Institution implements PropertyChangeListener {
	private String name;

	public Institution(String name) {
		this.name = name;
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String src = (String) evt.getPropertyName();
		String text = (String) evt.getNewValue(); //извлекаем новые данные
		System.out.printf("%s received information from %s:%n", name, src);
		System.out.println(text);
	}
}
