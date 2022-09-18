package state.pattern.demo;

public class Main {

	public static void main(String[] args) {
		System.out.println("***State Pattern Demo***");

		RemoteControl init = new Off();
		TV tv = new TV(init);
		tv.pressButton();

		tv.pressButton();

	}

}
