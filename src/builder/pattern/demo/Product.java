package builder.pattern.demo;

import java.util.LinkedList;
import java.util.List;

public class Product {

	private List<String> parts;

	public Product() {
		parts = new LinkedList<>();
	}

	public void add(String string) {
		// System.out.println("Product:" + string);
		parts.add(string);

	}

	public void show() {
		System.out.println("Product completed as below:");
		for (String s : parts) {
			System.out.println(s);
		}
	}

}
