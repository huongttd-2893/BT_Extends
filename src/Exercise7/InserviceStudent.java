package Exercise7;

import java.util.List;

public class InserviceStudent extends Student {
	private String trainingLinkPlace;
	
	public InserviceStudent(String numberID, String name, String birthday, int year, float point,
			List<LearningResult> result) {
		super(numberID, name, birthday, year, point, result);
	}
	
	public InserviceStudent(String numberID, String name, String birthday, int year, float point,
			List<LearningResult> result, String trainingLinkPlace) {
		super(numberID, name, birthday, year, point, result);
		this.trainingLinkPlace = trainingLinkPlace;
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
