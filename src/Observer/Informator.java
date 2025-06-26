package Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Informator {
	private String name;
	private PropertyChangeSupport support;

	public Informator(String name) {
		this.name = name;
		support = new PropertyChangeSupport(this);
	}

	public String getName() {
		return name;
	}

	public void addListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}

	public void removeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}

	public void setText(String text) {
		support.firePropertyChange(name, "", text);
	}
}
