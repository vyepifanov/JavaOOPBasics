public class Abiturient {
	private String name;
	private String surname;
	private int math;
	private int physics;
	private int lang;

	public Abiturient() {
	}

	public Abiturient(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Abiturient(String surname, String name, int math, int physics, int lang) {
		this.name = name;
		this.surname = surname;
		this.math = math;
		this.physics = physics;
		this.lang = lang;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public void setLang(int lang) {
		this.lang = lang;
	}

	public double average() {
		return (math + physics + lang) / 3.;
	}

	public String getSurname() {
		return surname;
	}

	public void print() {
		System.out.printf(
				"%s %s математика = %d физика = %d язык = %d средний балл = %.1f",
				name, surname, math, physics, lang, this.average());
	}
}
