package Factory;

public abstract class Button {
	protected String label;

	public Button(String label) {
		this.label = label;
	}

	public abstract void render();
}
