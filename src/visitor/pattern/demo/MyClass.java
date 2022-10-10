package visitor.pattern.demo;

public class MyClass implements IOriginalInterface {

	private int myInt = 5;

	public int getMyInt() {
		return this.myInt;
	}

	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}

	@Override
	public void accept(IVisitor visitor) {

		System.out.println("Initial value of myInt = " + myInt);
		visitor.visit(this);
		System.out.println("Value of myInt now = " + myInt);
	}

}
