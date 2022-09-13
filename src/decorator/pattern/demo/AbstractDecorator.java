package decorator.pattern.demo;

public abstract class AbstractDecorator extends Component {
	Component c;

	public void setComponent(Component c) {
		this.c = c;
	}

	@Override
	public void doJob() {
		if (c != null) {
			c.doJob();
		}
	}

}
