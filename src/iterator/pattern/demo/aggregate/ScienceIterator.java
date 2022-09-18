package iterator.pattern.demo.aggregate;

import java.util.LinkedList;

import iterator.pattern.demo.iterator.IIterator;

public class ScienceIterator implements IIterator {
	private LinkedList<String> subject;
	private int position;

	public ScienceIterator(LinkedList<String> subject) {
		this.subject = subject;
		this.position = 0;
	}

	@Override
	public void first() {
		this.position = 0;
	}

	@Override
	public String next() {
		return subject.get(position++);
	}

	@Override
	public boolean isDone() {
		return position >= subject.size();
	}

	@Override
	public String current() {
		return subject.get(position);
	}

}
