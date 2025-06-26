package Strategy;

public class NoExtraSpaces implements Editing{
	public NoExtraSpaces() {
	}

	@Override
	public String edit(String text) {
		return text.trim().replaceAll("\\s+", " ");
	}
}
