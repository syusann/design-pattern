package builder.pattern.demo;

public class Car implements IBuilder {

	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("build body of car");
	}

	@Override
	public void insertWheel() {
		product.add("insert 4 wheel of car");
	}

	@Override
	public void addHeadLights() {
		product.add("add 2 head lights of car");

	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
