package Decorator;

public class SuperIntelligence extends HeroDecorator{
	private static final int EXTRA_POWER = 7;

	public SuperIntelligence(SuperHero hero) {
		super(hero);
	}

	@Override
	public String getDescription() {
		return hero.getDescription() + ", super Intelligence";
	}

	@Override
	public int getChanceToSurvive() {
		return hero.getChanceToSurvive() + EXTRA_POWER;
	}
}
