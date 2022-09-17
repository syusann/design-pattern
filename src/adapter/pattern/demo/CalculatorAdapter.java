package adapter.pattern.demo;

public class CalculatorAdapter {

	public double getArea(Triangle t) {
		Calculator c = new Calculator();
		Rectangle r = new Rectangle();
		r.length = t.base;
		r.width = 0.5 * t.height;
		return c.getArea(r);
	}

}
