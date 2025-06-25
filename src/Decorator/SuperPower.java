package Decorator;

public class SuperPower extends HeroDecorator{
	private static final int EXTRA_POWER = 4;

	public SuperPower(SuperHero hero) {
		super(hero);
	}

	@Override
	public String getDescription() {
		return hero.getDescription() + ", super Power";
	}

	@Override
	public int getChanceToSurvive() {
		return hero.getChanceToSurvive() + EXTRA_POWER;
	}
}
