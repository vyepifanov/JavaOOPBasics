package Factory;

public class HtmlDialog extends Dialog {
	@Override
	public Button createButton() {
		return new HtmlButton("OK");
	}
}
