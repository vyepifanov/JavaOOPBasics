package Strategy;

public class Message {
	private String text;
	private Editing editWay;

	public Message(String text) {
		this.text = text;
	}

	public void setEditWay(Editing editWay) {
		this.editWay = editWay;
	}

	public void print() {
		System.out.println(editWay.edit(text));
	}
}
