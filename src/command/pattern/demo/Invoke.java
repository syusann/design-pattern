package command.pattern.demo;

public class Invoke {

	private ICommand c;

	public void executeCommand(ICommand c) {
		this.c = c;
		c.doCommand();
	}

}
