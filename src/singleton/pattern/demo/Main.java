package singleton.pattern.demo;

public class Main {

	public static void main(String[] args) {
		System.out.println("***Singleton Pattern Demo***");
		System.out.println("Try to make a captain for our team.");
		MakeACaptain c1 = MakeACaptain.getCaptain();
		System.out.println("Try to make another captain for our team.");
		MakeACaptain c2 = MakeACaptain.getCaptain();
		if (c1 == c2) {
			System.out.println("c1 and c2 are same instance.");
		}

	}

}
