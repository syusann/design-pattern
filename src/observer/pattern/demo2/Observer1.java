package observer.pattern.demo2;

class Observer1 implements IObserver {
	public void update(int subValue) {
		System.out.println("Observer1:flag value changed in subject " + subValue);
	}
}
