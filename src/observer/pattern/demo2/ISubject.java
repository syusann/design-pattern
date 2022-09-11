package observer.pattern.demo2;

interface ISubject {
	void register(IObserver o);

	void unregister(IObserver o);

	void notifyObservers(int subValue);
}
