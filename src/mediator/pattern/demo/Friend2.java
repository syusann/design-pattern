package mediator.pattern.demo;

public class Friend2 extends Friend {

	public Friend2(Mediator m, String name) {
		super(m);
		this.name = name;
	}

	public void send(String message) {
		mediator.send(this, message);
	}

	public void notify(String message) {
		System.out.println("friend2 gets message: " + message);
	}
}
