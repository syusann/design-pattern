package bridge.pattern.demo;

public class GreenColor implements IColor {

	@Override
	public void fillWithColor(int border) {
		System.out.println("Green color with " + border + " inch border");

	}

}
