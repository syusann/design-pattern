package bridge.pattern.demo;

public class Main {
	public static void main(String[] args) {
		System.out.println("*** Composite Pattern Demo ***");
		IColor green = new GreenColor();
		Shape triangle = new Triangle(green);
		triangle.drawShape(20);
		triangle.modifyBorder(20, 3);

		IColor red = new RedColor();
		Shape rectangle = new Rectangle(green);
		rectangle.drawShape(50);
		rectangle.modifyBorder(50, 2);

	}
}