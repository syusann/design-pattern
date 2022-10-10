package chainofresponsibility.pattern.demo;

public class Message {

	public String msg;
	public MessagePriority priority;

	public Message(String msg, MessagePriority priority) {
		this.msg = msg;
		this.priority = priority;
	};
}
