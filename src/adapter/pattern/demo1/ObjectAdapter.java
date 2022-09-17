package adapter.pattern.demo1;

public class ObjectAdapter {
	IIntegerValue iv;

	public ObjectAdapter(IIntegerValue iv) {
		this.iv = iv;
	}

	public int getInteger() {
		return 2 + this.iv.getInteger();
	}

}
