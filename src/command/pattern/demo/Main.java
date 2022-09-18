package command.pattern.demo;

public class Main {
	public static void main(String[] args) {
		System.out.println("*** Command Pattern Demo ***");

		Receiver r = new Receiver();
		Invoke i = new Invoke();
		UndoCommand undo = new UndoCommand(r);
		RedoCommand redo = new RedoCommand(r);
		i.executeCommand(undo);
		i.executeCommand(redo);

	}
}