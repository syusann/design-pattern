package proxy.pattern.demo.proxyclass;

import proxy.pattern.demo.originclass.ConcreteSubject;
import proxy.pattern.demo.originclass.Subject;

public class Proxy extends Subject {

	private Subject cs;

	@Override
	public void doSomething() {
		System.out.println("Proxy call happening now");
		if (cs == null) {
			cs = new ConcreteSubject();
		}
		cs.doSomething();
	}

}
