package singleton.pattern.demo;

public class MakeACaptain {

	private static MakeACaptain captain;

	private MakeACaptain() {
	};

	public static MakeACaptain getCaptain() {
		if (captain == null) {
			captain = new MakeACaptain();
			System.out.println("New captain selected for our team!");

		} else {
			System.out.println("We already have a captain. Send him to toss!");
		}
		return captain;
	}

}
