package Exercise7;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String numberID;
	private String name;
	private String birthday;
	private int year;
	private float point;
	private List<LearningResult> result = new ArrayList<LearningResult>();

	public Student(String numberID, String name, String birthday, int year, float point, List<LearningResult> result) {
		super();
		this.numberID = numberID;
		this.name = name;
		this.birthday = birthday;
		this.year = year;
		this.point = point;
		this.result = result;
	}

	// hiển thị thông tin sinh viên
	public void displaySVInfo() {
		System.out.println("Thông tin sinh viên");
		System.out.println("\t Mã SV: " + getNumberID());
		System.out.println("\t Họ tên: " + getName());
		System.out.println("\t Ngày sinh: " + getBirthday());
		System.out.println("\t Năm vào học: " + getYear());
		System.out.println("\t Điểm đầu vào: " + getPoint());
		result.forEach(ketqua -> ketqua.displayInfo());

	}

	// hiển thị điểm trung bình sinh viên
//	public float displayMediumScoreStudent() {
//		float score = 0;
//		for (LearningResult res : this.getResult()) {
//			if (res.getMediumScore() > score) {
//				score = res.getMediumScore();
//			}
//		}
//		return score;
//
//	}
	public void displayMediumScoreStudent() {
		System.out.println("Điểm trung bình các môn học của " + name);
		for (LearningResult results : result) {
			System.out.println(" - " + results.getSemesterName()+ " là : " + results.getMediumScore());
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

	public void setResult(List<LearningResult> result) {
		this.result = result;
	}

}