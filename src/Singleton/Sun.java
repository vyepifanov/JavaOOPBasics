package Singleton;

public class Sun implements CelestialBody {
	private static Sun uniqueInstance;

	private Sun() {}

	public static Sun getUniqueInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Sun();
		}
		return uniqueInstance;
	}
}
