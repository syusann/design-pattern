package templatemethod.pattern.demo;

import templatemethod.pattern.demo.engineering.BasicEngineering;
import templatemethod.pattern.demo.engineering.ComputerScience;
import templatemethod.pattern.demo.engineering.Electronics;

public class Main {

	public static void main(String[] args) {
		System.out.println("***Template Method Pattern Demo***\n");
		BasicEngineering cs = new ComputerScience();
		System.out.println("Computer Science papers:");
		cs.papers();

		BasicEngineering es = new Electronics();
		System.out.println("Electronics papers:");
		es.papers();

	}

}
