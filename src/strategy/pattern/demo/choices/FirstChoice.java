package strategy.pattern.demo.choices;

public class FirstChoice implements IChoice {

	@Override
	public void myChoice(String s1, String s2) {
		System.out.println("First Choice to add " + s1 + " " + s2);
	}

}
