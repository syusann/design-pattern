package proxy.pattern.demo;

import proxy.pattern.demo.originclass.Subject;
import proxy.pattern.demo.proxyclass.Proxy;

public class Main {

	public static void main(String[] args) {
		Subject proxy = new Proxy();
		proxy.doSomething();
	}

}
