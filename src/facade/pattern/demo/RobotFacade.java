package facade.pattern.demo;

import facade.pattern.demo.robotparts.RobotBody;
import facade.pattern.demo.robotparts.RobotColor;
import facade.pattern.demo.robotparts.RobotMetal;

public class RobotFacade {
	private RobotBody body;
	private RobotColor color;
	private RobotMetal metal;

	public RobotFacade() {
		body = new RobotBody();
		color = new RobotColor();
		metal = new RobotMetal();
	}

	public void constructRobot(String color, String metal) {
		System.out.println("..constrcut robot start");
		this.color.setColor(color);
		this.metal.setMetal(metal);
		this.body.createBody();
		System.out.println("..construct robot end");
		System.out.println();
	}

}
