package Strategy;

public class CapsFirstLetters implements Editing{
	public CapsFirstLetters() {
	}

	@Override
	public String edit(String text) {
		if (text == null || text.isEmpty()) {
			return text;
		}

		StringBuilder result = new StringBuilder();
		boolean capitalizeNext = true;

		for (char ch : text.toCharArray()) {
			if (Character.isWhitespace(ch)) {
				result.append(ch);
				capitalizeNext = true;
			} else {
				if (capitalizeNext) {
					result.append(Character.toUpperCase(ch));
					capitalizeNext = false;
				} else {
					result.append(ch);
				}
			}
		}

		return result.toString();
	}
}
