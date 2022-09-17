package templatemethod.pattern.demo.engineering;

public abstract class BasicEngineering {

	public void papers() {
		maths();
		softSkills();
		specialPaper();
	}

	protected abstract void specialPaper();

	private void softSkills() {
		System.out.println("Soft Skills");

	}

	private void maths() {
		System.out.println("Mathemetics");
	}

}
