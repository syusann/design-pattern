package iterator.pattern.demo.aggregate;

import iterator.pattern.demo.iterator.IIterator;

public interface ISubject {
	IIterator createIterator();
}
