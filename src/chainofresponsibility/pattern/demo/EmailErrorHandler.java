package chainofresponsibility.pattern.demo;

public class EmailErrorHandler implements IReceiver {

	private IReceiver nextReceiver;

	public EmailErrorHandler(IReceiver nextReceiver) {
		this.nextReceiver = nextReceiver;
	}

	@Override
	public boolean processMessage(Message msg) {

		if (msg.msg.contains("Email")) {
			System.out.println("EmailHandler handle::" + msg.priority + "::" + msg.msg);
			return true;
		} else {
			if (nextReceiver != null) {
				nextReceiver.processMessage(msg);
			}
		}
		return false;
	}

}
