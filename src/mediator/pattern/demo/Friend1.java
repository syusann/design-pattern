package mediator.pattern.demo;

public class Friend1 extends Friend {

	public Friend1(Mediator m, String name) {
		super(m);
		this.name = name;
	}

	public void send(String message) {
		mediator.send(this, message);
	}

	public void notify(String message) {
		System.out.println("friend1 gets message: " + message);
	}
}
