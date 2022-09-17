package adapter.pattern.demo1;

public class ClassAdapter extends IntegerValue {
	public int getInteger() {
		return 2 + super.getInteger();
	}
}
