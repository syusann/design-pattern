package prototype.pattern.demo;

public class Nano extends BasicCar {

	public Nano(String m) {
		modelName = m;
	}

	public BasicCar clone() throws CloneNotSupportedException {
		return (Nano) super.clone();
	}

}
