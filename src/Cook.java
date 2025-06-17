public class Cook {
	public void turnOvenOn() {
		System.out.println("Включаю плиту");
	}

	public void turnOvenOff() {
		System.out.println("Выключаю плиту");
	}

	public void bake(String product) throws BakingException{
		System.out.println("Готовлю блюдо");
		if (product.equals("Прогорклое масло") || product.equals("Низкосортная мука")) {
			throw new BakingException(product);
		}
		System.out.println("Конец приготовления блюда");
	}
}
