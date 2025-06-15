public class StrongTrial extends Trial{
	private static int timeLimit;
	private int time;

	public static int getTimeLimit() {
		return timeLimit;
	}

	public static void setTimeLimit(int timeLimit) {
		StrongTrial.timeLimit = timeLimit;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public StrongTrial(String name, int score1, int score2, int time) {
		super(name, score1, score2);
		this.time = time;
	}

	@Override
	public boolean isPassed() {
		return super.isPassed() && this.time <= getTimeLimit();
	}

	@Override
	public String toString() {
		return super.toString() + ";" + time;
	}
}
