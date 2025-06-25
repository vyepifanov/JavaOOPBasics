package Decorator;

public class RedSuperHero extends SuperHero{
	private final static int BASE_POWER = 12;

	public RedSuperHero() {
		super(BASE_POWER);
	}

	@Override
	public String getDescription() {
		return "Red super-hero";
	}
}
