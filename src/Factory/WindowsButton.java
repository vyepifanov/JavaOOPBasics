package Factory;

public class WindowsButton extends Button {
	public WindowsButton(String label) {
		super(label);
	}

	@Override
	public void render() {
		System.out.println("Отрисовали кнопку в стиле Windows с надписью " + label);
	}
}
