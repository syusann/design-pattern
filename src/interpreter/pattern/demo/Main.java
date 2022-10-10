package interpreter.pattern.demo;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("*** Prototype Pattern Demo ***");

		String input = "512";
		System.out.println("input is " + input);
		Context context = new Context(input);
		InterpreterPatternEx client = new InterpreterPatternEx(context);
		client.interpret(input);

	}

}
