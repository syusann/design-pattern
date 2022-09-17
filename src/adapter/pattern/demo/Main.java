package adapter.pattern.demo;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Adapter Pattern Demo ***");
		CalculatorAdapter ca = new CalculatorAdapter();
		Triangle t = new Triangle(10, 20);
		System.out.println("The area is " + ca.getArea(t));

	}

}
