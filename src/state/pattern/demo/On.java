package state.pattern.demo;

public class On extends RemoteControl {

	@Override
	public void pressSwitch(TV tv) {
		System.out.println("I'm on, going to OFF");
		tv.setState(new Off());

	}

}
