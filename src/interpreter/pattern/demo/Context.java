package interpreter.pattern.demo;

public class Context {

	public String input;

	public Context(String input) {
		this.input = input;
	}

	public void getBinaryForm(String input) {
		int i = Integer.parseInt(input);
		String binaryString = Integer.toBinaryString(i);
		System.out.println("Binary equivalent of " + input + " is " + binaryString);
	}

	public void printInWords(String input) {
		this.input = input;
		System.out.println("Printing the input in words:");
		char[] chars = input.toCharArray();
		for (char c : chars) {
			switch (c) {
			case '1':
				System.out.print("One ");
				break;
			case '2':
				System.out.print("Two ");
				break;
			case '3':
				System.out.print("Three ");
				break;
			case '4':
				System.out.print("Four ");
				break;

			case '5':
				System.out.print("Five ");
				break;
			default:
				System.out.print("* ");
				break;
			}
		}

	}

}
