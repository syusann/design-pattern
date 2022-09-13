package decorator.pattern.demo;

public class ConcreteDecorator2 extends AbstractDecorator {

	public void doJob() {
		System.out.println("I'm from concrete decorator 2. begin");
		super.doJob();
		System.out.println("I'm from concrete decorator 2. end");
	}

}
