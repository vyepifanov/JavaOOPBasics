public class FixDiscountPurchase extends Purchase{
	private static double discount;

	public FixDiscountPurchase() {
	}

	public FixDiscountPurchase(Commodity com, int count) {
		super(com, count);
	}

	public static double getDiscount() {
		return discount;
	}

	public static void setDiscount(double discount) {
		FixDiscountPurchase.discount = discount;
	}

	@Override
	public int getCost() {
		int cost = super.getCost();
		return cost - (int)Math.floor(cost * getDiscount());
	}

	@Override
	public String toString() {
		return super.getCom().toString() + ';' +
				this.getCount() + ';' +
				getDiscount() + ';' +
				this.getCost();
	}
}
