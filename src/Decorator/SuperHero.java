package Decorator;

public abstract class SuperHero{
	private int power;

	public SuperHero() {}

	public SuperHero(int power) {
		this.power = power;
	}

	public String getDescription() {
		return "";
	}

	public int getChanceToSurvive() {
		return this.power;
	}
}
