package proxy.pattern.demo.originclass;

public class ConcreteSubject extends Subject {

	@Override
	public void doSomething() {
		System.out.println("I'm from concrete class.");
	}

}
