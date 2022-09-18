package facade.pattern.demo.robotparts;

public class RobotColor {
	private String color;

	public void setColor(String color) {
		this.color = color;
		System.out.println("RobotColor set to " + this.color);
	}
}
