package Decorator;

public class CapitalLetters extends MessageDecorator {
	private Message message;

	public CapitalLetters(Message message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message.getMessage().toUpperCase();
	}
}
