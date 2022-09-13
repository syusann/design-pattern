package decorator.pattern.demo;

public class ConcreteDecorator1 extends AbstractDecorator {

	public void doJob() {
		super.doJob();
		System.out.println("I'm from concrete decorator 1.");
	}

}
