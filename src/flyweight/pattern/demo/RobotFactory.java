package flyweight.pattern.demo;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

	Map<String, IRobot> shapes = new HashMap<>();

	public int totalRobotCreated() {
		return shapes.size();
	}

	public IRobot getRobotFromFactory(String shape) throws Exception {
		IRobot robot = null;

		if (shapes.containsKey(shape)) {
			robot = shapes.get(shape);
		} else {
			switch (shape) {
			case "small":
				System.out.println("create small robot");
				robot = new SmallRobot();
				shapes.put("small", robot);
				break;
			case "large":
				System.out.println("create large robot");
				robot = new LargeRobot();
				shapes.put("large", robot);
				break;
			default:
				throw new Exception("Sorry, we only have small and large robot!!");
			}
		}
		return robot;

	}

}
