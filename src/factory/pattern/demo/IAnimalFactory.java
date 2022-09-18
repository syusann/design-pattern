package factory.pattern.demo;

public abstract class IAnimalFactory {
	public abstract IAnimal getAnimalType(String type) throws Exception;
}
