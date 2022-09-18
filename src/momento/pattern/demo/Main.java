package momento.pattern.demo;

public class Main {

	public static void main(String[] args) {
		System.out.println("***Momento Pattern Memo***");
		Originator o = new Originator();
		o.setState("first state");
		CareTaker c = new CareTaker();
		c.saveMomento(o.originatorMomento());

		o.setState("second state");
		o.revert(c.retrieveMomento());

	}

}
