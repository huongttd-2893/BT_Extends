package Exercise7;

public class LearningResult {
	private String semesterName;
	private float mediumScore;

	public LearningResult(String semesterName, float mediumScore) {
		super();
		this.semesterName = semesterName;
		this.mediumScore = mediumScore;
	}

	public String getSemesterName() {
		return semesterName;
	}

	public void setSemesterName(String semesterName) {
		this.semesterName = semesterName;
	}

	public float getMediumScore() {
		return mediumScore;
	}

	public void setMediumScore(float mediumScore) {
		this.mediumScore = mediumScore;
	}

	public void displayInfo() {
		System.out.println("Kết quả học tập");
		System.out.println("\t Tên học kỳ: " + getSemesterName());
		System.out.println("\t Điểm trung bình: " + getMediumScore());
	}
}
