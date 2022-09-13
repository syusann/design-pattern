package decorator.pattern.demo;

public class ConcreteComponent extends Component {

	@Override
	public void doJob() {
		System.out.println("I'm from concrete component, I'm closed for modification.");

	}

}
