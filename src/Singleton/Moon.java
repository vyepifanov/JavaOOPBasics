package Singleton;

public class Moon implements CelestialBody {
	private static Moon uniqueInstance;

	private Moon() {}

	public static Moon getUniqueInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Moon();
		}
		return uniqueInstance;
	}
}
