package observer.pattern.demo2;

import java.util.ArrayList;
import java.util.List;

class Subject implements ISubject {

	List<IObserver> observerList = new ArrayList<>();
	private int subValue;

	public int getSubValue() {
		return this.subValue;
	}

	public void setSubValue(int subValue) {
		this.subValue = subValue;
		notifyObservers(subValue);
	}

	@Override
	public void register(IObserver o) {
		observerList.add(o);

	}

	@Override
	public void unregister(IObserver o) {
		observerList.remove(o);

	}

	@Override
	public void notifyObservers(int subValue) {
		for (int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update(subValue);
		}

	}

}
