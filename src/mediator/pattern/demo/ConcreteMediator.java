package mediator.pattern.demo;

public class ConcreteMediator extends Mediator {

	private Friend1 friend1;
	private Friend2 friend2;
	private Boss boss;

	public void setFriend1(Friend1 friend1) {
		this.friend1 = friend1;
	}

	public void setFriend2(Friend2 friend2) {
		this.friend2 = friend2;
	}

	public void setBoss(Boss boss) {
		this.boss = boss;
	}

	@Override
	public void send(Friend friend, String message) {

		if (friend1 == friend) {
			friend2.notify(message);
			boss.notify(friend1.name + " send to " + friend2.name + " :: " + message);
		}
		if (friend2 == friend) {
			friend1.notify(message);
			boss.notify(friend2.name + " send to " + friend1.name + " :: " + message);
		}
		if (boss == friend) {
			friend1.notify(boss.name + " send to " + friend1.name + " :: " + message);
			friend2.notify(boss.name + " send to " + friend2.name + " :: " + message);
		}

	}

}
