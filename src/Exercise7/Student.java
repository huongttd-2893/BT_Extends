package Exercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	private String numberID;
	private String name;
	private String birthday;
	private int year;
	private float point;
	private ArrayList<LearningResult> result = new ArrayList<LearningResult>();

	public Student(String numberID, String name, String birthday, int year, float point, ArrayList<LearningResult> result) {
		super();
		this.numberID = numberID;
		this.name = name;
		this.birthday = birthday;
		this.year = year;
		this.point = point;
		this.result = result;
	}

	// Hiển thị thông tin sinh viên
	public void displaySVInfo() {
		System.out.println("Thông tin sinh viên");
		System.out.println("\t Mã SV: " + getNumberID());
		System.out.println("\t Họ tên: " + getName());
		System.out.println("\t Ngày sinh: " + getBirthday());
		System.out.println("\t Năm vào học: " + getYear());
		System.out.println("\t Điểm đầu vào: " + getPoint());
		result.forEach(ketqua -> ketqua.displayInfo());

	}

	
	public void displayMediumScoreStudent() {
		System.out.println("Điểm trung bình các môn học của " + name);
		for (LearningResult results : result) {
			System.out.println(" - " + results.getSemesterName()+ " là : " + results.getMediumScore());
		}
	}

	public static void GoodStudent8(List<Student> students) {
		System.out.println("Danh sách sinh viên có điểm trung bình ở học kỳ gần nhất có điểm trung bình từ 8.0 trở lên là: ");
		for (Student student: students) {
			if (student.getResult().get(student.getResult().size()-1).getMediumScore() >= 8.0)
			{
				student.displaySVInfo();
			}
		}
	}
	//Hàm sắp xếp
	public static void SortByYear(ArrayList<Student> st) {
		Collections.sort(st, new Comparator<Student>() {
			@Override
			public int compare(Student st1, Student st2) {
				return st1.getYear() > st2.getYear() ? -1 : 1;
			}
		});
		System.out.println("Sắp xếp thứ tự sinh viên giảm dần theo năm học:");
		for (int i = 0; i < st.size(); i++) {
			Student sv = st.get(i);
			sv.displaySVInfo();
		}
	}
	
	public String getNumberID() {
		return numberID;
	}

	public void setNumberID(String numberID) {
		this.numberID = numberID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	public List<LearningResult> getResult() {
		return result;
	}

	public void setResult(ArrayList<LearningResult> result) {
		this.result = result;
	}

}