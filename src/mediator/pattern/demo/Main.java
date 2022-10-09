package mediator.pattern.demo;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Mediator Pattern Memo***");

		ConcreteMediator m = new ConcreteMediator();
		Friend1 f1 = new Friend1(m, "friend1");
		Friend2 f2 = new Friend2(m, "friend2");
		Boss boss = new Boss(m, "boss");

		m.setFriend1(f1);
		m.setFriend2(f2);
		m.setBoss(boss);

		f1.send("Do you have time?");
		f2.send("Yes.");

		boss.send("Go back to work!!");

	}

}
