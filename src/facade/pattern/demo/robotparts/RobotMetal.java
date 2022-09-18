package facade.pattern.demo.robotparts;

public class RobotMetal {
	private String metal;

	public void setMetal(String metal) {
		this.metal = metal;
		System.out.println("RobotMetal set to " + this.metal);
	}
}
