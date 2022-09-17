package strategy.pattern.demo.choices;

public class SecondChoice implements IChoice {

	@Override
	public void myChoice(String s1, String s2) {
		System.out.println("Second Choice to concate " + s1 + " " + s2);
	}

}
