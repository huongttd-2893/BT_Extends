package Exercise7;

import java.util.ArrayList;
import java.util.List;

public class InserviceStudent extends Student {
	private String trainingLinkPlace;
	
	public InserviceStudent(String numberID, String name, String birthday, int year, float point,
			ArrayList<LearningResult> result) {
		super(numberID, name, birthday, year, point, result);
	}
	
	public InserviceStudent(String numberID, String name, String birthday, int year, float point,
			ArrayList<LearningResult> result, String trainingLinkPlace) {
		super(numberID, name, birthday, year, point, result);
		this.trainingLinkPlace = trainingLinkPlace;
	}
	
	public static void getInserviceStudent(List<Student> sts, String placeLink) {
		int c = 0;
		for (Student student : sts) {
			if (student instanceof InserviceStudent
					&& ((InserviceStudent) student).getTrainingLinkPlace() == placeLink) {
				student.displaySVInfo();
				c ++;
			}
		}
	}
	

	public String getTrainingLinkPlace() {
		return trainingLinkPlace;
	}

	public void setTrainingLinkPlace(String trainingLinkPlace) {
		this.trainingLinkPlace = trainingLinkPlace;
	}

	public void displaySVCQInfo() {
		super.displaySVInfo();
		System.out.println("\t Nơi liên kết đào tạo: " + getTrainingLinkPlace());
	}
}
