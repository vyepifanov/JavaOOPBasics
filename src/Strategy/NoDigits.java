package Strategy;

public class NoDigits implements Editing{
	public NoDigits() {
	}

	@Override
	public String edit(String text) {
		return text.replaceAll("\\d", "");
	}
}
