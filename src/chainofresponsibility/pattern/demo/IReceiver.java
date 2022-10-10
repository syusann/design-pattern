package chainofresponsibility.pattern.demo;

public interface IReceiver {
	boolean processMessage(Message msg);
}
