package prototype.pattern.demo;

public class Ford extends BasicCar {

	public Ford(String m) {
		modelName = m;
	}

	public BasicCar clone() throws CloneNotSupportedException {
		return (Ford) super.clone();
	}

}
