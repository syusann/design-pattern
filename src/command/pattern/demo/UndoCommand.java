package command.pattern.demo;

public class UndoCommand implements ICommand {
	private Receiver r;

	public UndoCommand(Receiver r) {
		this.r = r;
	}

	@Override
	public void doCommand() {
		r.performUndo();
	}

}
