package Decorator;

public class GreenSuperHero extends SuperHero{
	private final static int BASE_POWER = 10;

	public GreenSuperHero() { super(BASE_POWER); }

	@Override
	public String getDescription() { return "Green super-hero"; }
}
