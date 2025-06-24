package Patterns;

public class Earth implements CelestialBody {
	private static Earth uniqueInstance;

	private Earth() {}

	public static Earth getUniqueInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Earth();
		}
		return uniqueInstance;
	}
}
