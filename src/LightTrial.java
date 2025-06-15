public class LightTrial extends Trial {
	public LightTrial(String name, int score1, int score2) {
		super(name, score1, score2);
	}

	@Override
	public boolean isPassed() {
		return getScore() <= (super.getScore1() + super.getScore2());
	}
}
