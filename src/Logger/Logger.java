package Logger;

import java.util.ArrayDeque;
import java.util.Deque;

public class Logger {
	private static Logger instance;
	private final Deque<String> errors = new ArrayDeque<>();

	private Logger() {}

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public void putError(String error) {
		errors.push(error);
	}

	public String getErrors() {
		StringBuilder result = new StringBuilder();
		while (!errors.isEmpty()) {
			result.append(errors.pop());
			if (!errors.isEmpty()) {
				result.append(" ");
			}
		}
		return result.toString();
	}
}
