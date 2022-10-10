package composite.pattern.demo;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ITeacher {

	private String teacherName;
	private String deptName;
	private List<ITeacher> controls;

	public Teacher(String teacherName, String deptName) {
		this.teacherName = teacherName;
		this.deptName = deptName;
		this.controls = new ArrayList<>();
	}

	public void add(Teacher teacher) {
		this.controls.add(teacher);
	}

	public void remove(Teacher teacher) {
		this.controls.remove(teacher);
	}

	public List<ITeacher> getControls() {
		return this.controls;
	}

	@Override
	public String getDetails() {
		return (teacherName + " is the " + deptName);
	}

}
