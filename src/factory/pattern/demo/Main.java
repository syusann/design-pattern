package factory.pattern.demo;

public class Main {

	public static void main(String[] args) {
		System.out.println("***Factory Pattern Demo***");
		IAnimalFactory factory = new ConcreteFactory();
		try {
			IAnimal duck = factory.getAnimalType("Duck");
			duck.speak();

			IAnimal tiger = factory.getAnimalType("Tiger");
			tiger.speak();

			IAnimal lion = factory.getAnimalType("Lion");
			lion.speak();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
