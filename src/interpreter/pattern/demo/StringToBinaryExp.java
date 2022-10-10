package interpreter.pattern.demo;

public class StringToBinaryExp implements IExpression {

	private String s;

	public StringToBinaryExp(String s) {
		this.s = s;
	}

	@Override
	public void interpret(Context ic) {
		ic.getBinaryForm(s);
	}

}
