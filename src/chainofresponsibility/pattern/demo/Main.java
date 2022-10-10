package chainofresponsibility.pattern.demo;

public class Main {
	public static void main(String[] args) {
		System.out.println("*** Chain of Responsibility Pattern Demo ***");

		IReceiver faxHandler, emailHandler;
		emailHandler = new EmailErrorHandler(null);
		faxHandler = new FaxErrorHandler(emailHandler);

		IssueRaiser raiser = new IssueRaiser(faxHandler);

		Message m1 = new Message("Fax is reaching...", MessagePriority.High);
		Message m2 = new Message("Email Server found virus...", MessagePriority.High);
		Message m3 = new Message("Fax is busy...", MessagePriority.Normal);
		Message m4 = new Message("New Email is coming...", MessagePriority.Normal);

		raiser.raiseMessage(m1);
		raiser.raiseMessage(m2);
		raiser.raiseMessage(m3);
		raiser.raiseMessage(m4);

	}
}