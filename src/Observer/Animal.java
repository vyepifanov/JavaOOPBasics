package Observer;

abstract class Animal implements Observer {
	protected String name;
	protected String type;

	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public void update(String newspaper) {
		System.out.println(name + " читает про " + type + " в номере " + newspaper.substring(newspaper.length() - 1));
	}
}
