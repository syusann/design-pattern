package visitor.pattern.demo;

public class Visitor implements IVisitor {

	@Override
	public void visit(MyClass myClass) {
		System.out.println("Visitor is trying to update the int value.");
		myClass.setMyInt(1000);
		System.out.println("update the int value...");

	}

}
