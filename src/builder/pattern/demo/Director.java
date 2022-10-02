package builder.pattern.demo;

public class Director {

	IBuilder builder;

	public void construct(IBuilder builder) {
		this.builder = builder;
		this.builder.buildBody();
		this.builder.insertWheel();
		this.builder.addHeadLights();
	}
}
