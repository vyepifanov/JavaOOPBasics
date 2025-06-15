public class FlowDiscountPurchase extends Purchase{
	private static double discount;
	private static int minAmount;

	public FlowDiscountPurchase() {
	}

	public FlowDiscountPurchase(Commodity com, int count) {
		super(com, count);
	}

	public static double getDiscount() {
		return discount;
	}

	public static void setDiscount(double discount) {
		FlowDiscountPurchase.discount = discount;
	}

	public static int getMinAmount() {
		return minAmount;
	}

	public static void setMinAmount(int minAmount) {
		FlowDiscountPurchase.minAmount = minAmount;
	}

	@Override
	public int getCost() {
		if (this.getCount() >= minAmount) {
			int cost = super.getCost();
			return cost - (int)Math.floor(cost * getDiscount());
		}
		return super.getCost();
	}

	@Override
	public String toString() {
		return super.getCom().toString() + ';' +
				this.getCount() + ';' +
				getDiscount() + ';' +
				getMinAmount() + ';' +
				this.getCost();
	}
}
