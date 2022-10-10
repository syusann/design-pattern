package visitor.pattern.demo;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("*** Prototype Pattern Demo ***");

		IVisitor visitor = new Visitor();
		MyClass myClass = new MyClass();
		myClass.accept(visitor);

	}

}
