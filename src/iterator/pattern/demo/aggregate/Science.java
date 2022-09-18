package iterator.pattern.demo.aggregate;

import java.util.LinkedList;

import iterator.pattern.demo.iterator.IIterator;

public class Science implements ISubject {

	private LinkedList<String> subject;

	public Science() {
		this.subject = new LinkedList<>();
		this.subject.addLast("Maths");
		this.subject.addLast("Chemistry");
		this.subject.addLast("Physics");

	}

	@Override
	public IIterator createIterator() {
		return new ScienceIterator(this.subject);
	}

}
