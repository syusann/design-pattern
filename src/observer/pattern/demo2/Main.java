package observer.pattern.demo2;

public class Main {

	public static void main(String[] args) {
		System.out.println("***Observer Pattern***");
		IObserver o1 = new Observer1();
		IObserver o2 = new Observer2();
		Subject sub1 = new Subject();
		sub1.register(o1);
		sub1.register(o2);
		System.out.println("Setting Flag = 5");
		sub1.setSubValue(5);
		System.out.println("Setting Flag = 25");
		sub1.setSubValue(25);
		sub1.unregister(o1);
		// No notification this time to o1 .Since it is unregistered.
		System.out.println("Setting Flag = 50");
		sub1.setSubValue(50);
		sub1.unregister(o2);
		System.out.println("Setting Flag = 70");
		sub1.setSubValue(70);

	}

}
