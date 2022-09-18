package factory.pattern.demo;

public class ConcreteFactory extends IAnimalFactory {

	@Override
	public IAnimal getAnimalType(String type) throws Exception {
		switch (type) {
		case "Duck":
			return new Duck();
		case "Tiger":
			return new Tiger();

		default:
			throw new Exception("Type err:" + type);
		}
	}

}
