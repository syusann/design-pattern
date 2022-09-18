package momento.pattern.demo;

public class CareTaker {

	Momento m;

	public void saveMomento(Momento m) {
		this.m = m;
	}

	public Momento retrieveMomento() {
		return m;
	}

}
