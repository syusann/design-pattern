package prototype.pattern.demo;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("*** Prototype Pattern Demo ***");

		BasicCar nano_base = new Nano("Green Nano");
		nano_base.price = 100000;

		BasicCar ford_base = new Nano("Black Ford");
		ford_base.price = 200000;

		BasicCar gn1 = nano_base.clone();
		gn1.price = nano_base.price + BasicCar.setPrice();
		System.out.println("Car is " + gn1.modelName + ", and it's price is " + gn1.price);

		BasicCar bf1 = ford_base.clone();
		bf1.price = ford_base.price + BasicCar.setPrice();
		System.out.println("Car is " + bf1.modelName + ", and it's price is " + bf1.price);

	}

}
