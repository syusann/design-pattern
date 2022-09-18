package iterator.pattern.demo.aggregate;

import iterator.pattern.demo.iterator.IIterator;

public class ArtsIterator implements IIterator {
	private String[] subject;
	private int position;

	public ArtsIterator(String[] subject) {
		this.subject = subject;
		this.position = 0;
	}

	@Override
	public void first() {
		this.position = 0;
	}

	@Override
	public String next() {
		return subject[position++];
	}

	@Override
	public boolean isDone() {
		return position >= subject.length;
	}

	@Override
	public String current() {
		return subject[position];
	}

}
