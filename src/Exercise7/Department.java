package Exercise7;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String departmentName;
	private ArrayList<Student> students;
	
	public Department(String departmentName, ArrayList<Student> students) {
		super();
		this.departmentName = departmentName;
		this.students = students;
	}
	public void sumRegularStudent() {
		int sum = 0;
		for (int i = 0; i < students.size(); i++) {
			Student sv = students.get(i);
			if (sv instanceof RegularStudent) {
				sum++;
			}
		}
		System.out.println("Tổng số sinh viên chính quy của Khoa là: " + sum);
	}
	
	public static void DepartmentRegularStudent(ArrayList<Department> departm) {
		for (int i = 0; i < departm.size(); i++) {
			Department k = departm.get(i);
			k.sumRegularStudent();
		}
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

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
}

