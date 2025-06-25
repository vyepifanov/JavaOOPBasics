package Decorator;

public class SuperAgility extends HeroDecorator{
	private static final int EXTRA_POWER = 3;

	public SuperAgility(SuperHero hero) {
		super(hero);
	}

	@Override
	public String getDescription() {
		return hero.getDescription() + ", super Agility";
	}

	@Override
	public int getChanceToSurvive() {
		return hero.getChanceToSurvive() + EXTRA_POWER;
	}
}
