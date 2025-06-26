package Strategy;

public class NoEditing implements Editing{
	public NoEditing() {
	}

	@Override
	public String edit(String text) {
		return text;
	}
}
