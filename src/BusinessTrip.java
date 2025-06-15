import java.util.Objects;

public class BusinessTrip {
	final static int PER_DAY = 25;

	private String name;
	private int exp;
	private int days;

	public BusinessTrip() {
	}

	public BusinessTrip(String name, int days, int exp) {
		this.name = name;
		this.exp = exp;
		this.days = days;
	}

	public BusinessTrip(BusinessTrip bt) {
		this.name = bt.name;
		this.exp = bt.exp;
		this.days = bt.days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof BusinessTrip that)) return false;
		return this.getTotal() == that.getTotal();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getExp());
	}

	@Override
	public String toString() {
		return name + ';' + days + ';' + exp + ';' + getTotal();
	}

	public int getTotal() {
		return exp + days * PER_DAY;
	}

	public void show() {
		System.out.printf("Суточные = %d%n", PER_DAY);
		System.out.printf("Фамилия Имя = %s%n", this.name);
		System.out.printf("Транспортные расходы = %d%n", this.exp);
		System.out.printf("Количество дней = %d%n", this.days);
		System.out.printf("Итого расходы = %d%n", this.getTotal());
	}
}
