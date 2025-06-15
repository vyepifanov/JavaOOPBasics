public class Trial {
	static int score;

	private String name;
	private int score1;
	private int score2;

	public Trial() {}

	public Trial(String name) {
		this.name = name;
	}

	public Trial(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}

	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		Trial.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	public boolean isPassed() {
		return (score1 >= score) && (score2 >= score);
	}

	@Override
	public String toString() {
		return name + ';' + score1 + ";" + score2;
	}
}
