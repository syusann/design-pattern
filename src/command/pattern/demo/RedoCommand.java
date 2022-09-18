package command.pattern.demo;

public class RedoCommand implements ICommand {
	private Receiver r;

	public RedoCommand(Receiver r) {
		this.r = r;
	}

	@Override
	public void doCommand() {
		r.performRedo();
	}

}
