package strategy.pattern.demo.context;

import strategy.pattern.demo.choices.IChoice;

public class Context {
	IChoice choice;

	public void setChoice(IChoice choice) {
		this.choice = choice;
	}

	public void showChoice(String s1, String s2) {
		choice.myChoice(s1, s2);
	}

}
