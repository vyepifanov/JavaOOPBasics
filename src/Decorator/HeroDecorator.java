package Decorator;

public abstract class HeroDecorator extends SuperHero {
	protected SuperHero hero;

	public HeroDecorator(SuperHero hero) {
		this.hero = hero;
	}
}
