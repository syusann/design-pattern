package mediator.pattern.demo;

public class Boss extends Friend {

	public Boss(Mediator m, String name) {
		super(m);
		this.name = name;
	}

	public void send(String message) {
		mediator.send(this, message);
	}

	public void notify(String message) {
		System.out.println("boss gets message: " + message);
	}
}
