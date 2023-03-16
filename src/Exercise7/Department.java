package Exercise7;

import java.util.List;

public class Department {
	private String departmentName;
	private List<Student> students;
	
	public Department(String departmentName, List<Student> students) {
		super();
		this.departmentName = departmentName;
		this.students = students;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}

