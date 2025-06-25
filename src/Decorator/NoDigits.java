package Decorator;

public class NoDigits extends MessageDecorator {
	private Message message;

	public NoDigits(Message message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message.getMessage().replaceAll("\\d", "");
	}
}
