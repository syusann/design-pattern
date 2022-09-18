package state.pattern.demo;

public class Off extends RemoteControl {

	@Override
	public void pressSwitch(TV tv) {
		System.out.println("I'm off, going to ON");
		tv.setState(new On());

	}

}
