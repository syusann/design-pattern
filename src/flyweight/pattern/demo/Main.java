package flyweight.pattern.demo;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("***Flyweight Pattern Demo***");

		RobotFactory factory = new RobotFactory();
		IRobot robot = factory.getRobotFromFactory("small");
		robot.print();

		robot = factory.getRobotFromFactory("small");
		robot.print();
		robot = factory.getRobotFromFactory("small");
		robot.print();

		int numOfRobots = factory.totalRobotCreated();
		System.out.println("num of robots = " + numOfRobots);

		for (int i = 0; i < 5; i++) {
			robot = factory.getRobotFromFactory("large");
			robot.print();
		}
		System.out.println("num of robots = " + factory.totalRobotCreated());
	}

}
