package composite.pattern.demo;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("*** Composite Pattern Demo ***");

		Teacher principal = new Teacher("Dr.S.Sam", "Principal");
		Teacher hodMaths = new Teacher("Mrs.S.Das", "Hod-Math");
		Teacher hodComps = new Teacher("Mr.Bill", "Hod-Comp");

		Teacher mathTeacher1 = new Teacher("Mr. mathTeacher1", "MathsTeacher");
		Teacher mathTeacher2 = new Teacher("Mrs. mathTeacher2", "MathsTeacher");

		Teacher compTeacher1 = new Teacher("Mrs. compTeacher1", "CSTeacher");
		Teacher compTeacher2 = new Teacher("Mr. compTeacher2", "CSTeacher");
		Teacher compTeacher3 = new Teacher("Mr. compTeacher3", "CSTeacher");

		principal.add(hodMaths);
		principal.add(hodComps);

		hodMaths.add(mathTeacher1);
		hodMaths.add(mathTeacher2);

		hodComps.add(compTeacher1);
		hodComps.add(compTeacher2);
		hodComps.add(compTeacher3);

		System.out.println("The College has the following structure");
		System.out.println(principal.getDetails());

		List<ITeacher> hods = principal.getControls();
		for (ITeacher teacher : hods) {
			System.out.println(teacher.getDetails());
		}

		List<ITeacher> mathTeachers = hodMaths.getControls();
		for (ITeacher teacher : mathTeachers) {
			System.out.println(teacher.getDetails());
		}

		List<ITeacher> compTeachers = hodComps.getControls();
		for (ITeacher teacher : compTeachers) {
			System.out.println(teacher.getDetails());
		}

		hodComps.remove(compTeacher2);
		System.out.println("compTeacher2 is leaving...");

		compTeachers = hodComps.getControls();
		for (ITeacher teacher : compTeachers) {
			System.out.println(teacher.getDetails());
		}
	}
}