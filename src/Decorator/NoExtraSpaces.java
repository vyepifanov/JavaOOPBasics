package Decorator;

public class NoExtraSpaces extends MessageDecorator {
	private Message message;

	public NoExtraSpaces(Message message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message.getMessage().trim().replaceAll("\\s+", " ");
	}
}
