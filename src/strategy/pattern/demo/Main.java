package strategy.pattern.demo;

import strategy.pattern.demo.choices.FirstChoice;
import strategy.pattern.demo.choices.IChoice;
import strategy.pattern.demo.choices.SecondChoice;
import strategy.pattern.demo.context.Context;

public class Main {

	public static void main(String[] args) {
		System.out.println("***Strategy Pattern Demo***");
		IChoice c;
		Context ctx;
		ctx = new Context();
		for (int i = 1; i <= 2; i++) {
			c = select(i);
			ctx.setChoice(c);
			ctx.showChoice("s" + i, "t" + i);
		}
	}

	private static IChoice select(int i) {
		IChoice c = null;
		if (i == 1) {
			c = new FirstChoice();
		}
		if (i == 2) {
			c = new SecondChoice();
		}
		return c;
	}

}
