package momento.pattern.demo;

public class Originator {
	private String state;
	private Momento m;

	public Originator() {
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("current state : " + state);
	}

	public Momento originatorMomento() {
		m = new Momento(state);
		return m;

	}

	public void revert(Momento m) {
		System.out.println("revert to previous state");
		this.state = m.getState();
		System.out.println("state at present :" + state);
	}
}
