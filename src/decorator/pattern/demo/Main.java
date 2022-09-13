package decorator.pattern.demo;

public class Main {

	public static void main(String[] args) {
		Component c = new ConcreteComponent();

		ConcreteDecorator1 cd1 = new ConcreteDecorator1();
		cd1.setComponent(c);
		cd1.doJob();

		ConcreteDecorator2 cd2 = new ConcreteDecorator2();
		cd2.setComponent(cd1);
		cd2.doJob();

	}

}
