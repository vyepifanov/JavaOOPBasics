package Factory;

public abstract class Dialog {
	public Dialog() {}

	public abstract Button createButton();

	public void renderWindow() {
		System.out.println("Рисуем окно диалога");
		Button button = createButton();
		button.render();
	}
}
