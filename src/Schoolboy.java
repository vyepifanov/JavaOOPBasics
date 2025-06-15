public class Schoolboy extends Learner {
	private String school;
	private String cl;

	public Schoolboy(String school, String cl) {
		this.school = school;
		this.cl = cl;
	}

	public Schoolboy(String name, int mark1, int mark2, String school, String cl) {
		super(name, mark1, mark2);
		this.school = school;
		this.cl = cl;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getCl() {
		return cl;
	}

	public void setCl(String cl) {
		this.cl = cl;
	}

	@Override
	public int holidays() {
		return 124;
	}

	@Override
	public String toString() {
		return super.toString() + ';' + school + ';' + cl;
	}
}
