public class Student extends Learner {
	private String vuz;
	private String group;

	private static int baseScholarship;

	public Student(String vuz, String group) {
		this.vuz = vuz;
		this.group = group;
	}

	public Student(String name, int mark1, int mark2, String vuz, String group) {
		super(name, mark1, mark2);
		this.vuz = vuz;
		this.group = group;
	}

	public String getVuz() {
		return vuz;
	}

	public void setVuz(String vuz) {
		this.vuz = vuz;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public static int getBaseScholarship() {
		return baseScholarship;
	}

	public static void setBaseScholarship(int baseScholarship) {
		Student.baseScholarship = baseScholarship;
	}

	public int calculateScholarship(){
		if(averageGrade() >= 9){
			return (int)(baseScholarship * 1.6);
		}else if(averageGrade() >= 8){
			return (int)(baseScholarship * 1.4);
		}else if(averageGrade() >= 6){
			return (int)(baseScholarship * 1.2);
		}else if(averageGrade() >= 5){
			return baseScholarship;
		}else{
			return 0;
		}
	}

	@Override
	public int holidays() {
		return 74;
	}

	@Override
	public String toString() {
		return super.toString() + ';' + vuz + ';' + group;
	}
}
