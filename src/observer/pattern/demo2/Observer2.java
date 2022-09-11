package observer.pattern.demo2;

class Observer2 implements IObserver {
	public void update(int subValue) {
		System.out.println("Observer2:flag value changed in subject " + subValue);
	}
}
