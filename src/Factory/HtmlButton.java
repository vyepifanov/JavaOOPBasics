package Factory;

public class HtmlButton extends Button {
	public HtmlButton(String label) {
		super(label);
	}

	@Override
	public void render() {
		System.out.println("Отрисовали кнопку в стиле Html с надписью " + label);
	}
}
