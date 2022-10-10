package interpreter.pattern.demo;

public class InterpreterPatternEx {

	public Context clientContext = null;
	public IExpression exp = null;

	public InterpreterPatternEx(Context clientContext) {
		this.clientContext = clientContext;
	}

	public void interpret(String str) {
		exp = new IntToWords(str);
		exp.interpret(clientContext);

		exp = new StringToBinaryExp(str);
		exp.interpret(clientContext);
	}

}
