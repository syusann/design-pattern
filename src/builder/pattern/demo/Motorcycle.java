package builder.pattern.demo;

public class Motorcycle implements IBuilder {

	private Product product = new Product();

	@Override
	public void buildBody() {
		product.add("build body of Motorcycle");
	}

	@Override
	public void insertWheel() {
		product.add("insert 2 wheel of Motorcycle");
	}

	@Override
	public void addHeadLights() {
		product.add("add 1 head lights of Motorcycle");

	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
