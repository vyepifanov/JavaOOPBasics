public interface Transport {
	boolean canCarry(double weight); //проверяет, может ли объект перевезти заданный груз
	void add(double weight); //добавить груз
	double getTotalWeight(); //возвращает общий груз
}
