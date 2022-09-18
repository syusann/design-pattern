package iterator.pattern.demo.aggregate;

import iterator.pattern.demo.iterator.IIterator;

public class Arts implements ISubject {

	private String[] subject;

	public Arts() {
		this.subject = new String[2];
		this.subject[0] = "Painting";
		this.subject[1] = "Writing";
	}

	@Override
	public IIterator createIterator() {
		return new ArtsIterator(this.subject);
	}

}
