package Factory;

public class WindowsDialog extends Dialog {
	@Override
	public Button createButton() {
		return new WindowsButton("OK");
	}
}
