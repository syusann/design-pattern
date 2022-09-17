package adapter.pattern.demo1;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Adapter Pattern demo - Object Adapter ***");
		ClassAdapter ca = new ClassAdapter();
		System.out.println("ClassAdapter.getInteger()=" + ca.getInteger());

		IntegerValue iv = new IntegerValue();
		ObjectAdapter oa = new ObjectAdapter(iv);
		System.out.println("ObjectAdapter.getInteger()=" + oa.getInteger());

	}

}
