package CollectionsUsage;

public class Comment {
	private String author;
	private String text;
	private int likes;

	public Comment(String author, String text, int likes) {
		this.author = author;
		this.text = text;
		this.likes = likes;
	}

	public String getAuthor() {
		return author;
	}

	public int getLikes() {
		return likes;
	}

	@Override
	public String toString() {
		return author + "#" + text + "#" + likes;
	}
}
