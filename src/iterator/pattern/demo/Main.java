package iterator.pattern.demo;

import iterator.pattern.demo.aggregate.Arts;
import iterator.pattern.demo.aggregate.ISubject;
import iterator.pattern.demo.aggregate.Science;
import iterator.pattern.demo.iterator.IIterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("***Iterator Pattern Demo***");
		ISubject arts = new Arts();
		ISubject science = new Science();

		IIterator itorArts = arts.createIterator();
		IIterator itorSci = science.createIterator();

		System.out.println("#Arts Subject:");
		printSubject(itorArts);

		System.out.println("#Science Subject:");
		printSubject(itorSci);

	}

	private static void printSubject(IIterator itor) {
		while (!itor.isDone()) {
			System.out.println(itor.next());
		}

	}

}
