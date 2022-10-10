package chainofresponsibility.pattern.demo;

public class FaxErrorHandler implements IReceiver {

	private IReceiver nextReceiver;

	public FaxErrorHandler(IReceiver nextReceiver) {
		this.nextReceiver = nextReceiver;
	}

	@Override
	public boolean processMessage(Message msg) {

		if (msg.msg.contains("Fax")) {
			System.out.println("FaxHandler handle::" + msg.priority + "::" + msg.msg);
			return true;
		} else {
			if (nextReceiver != null) {
				nextReceiver.processMessage(msg);
			}
		}
		return false;
	}

}
