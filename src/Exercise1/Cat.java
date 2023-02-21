package Exercise1;

public class Cat extends Animal{

	public Cat(String name, int age, String gender) {
		super(name, age, gender);

	}
	private String featherColor;
	private float width;
	public String getfeatherColor() {
		return featherColor;
	}
	public void setFeather_color(String featherColor) {
		this.featherColor = featherColor;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public Cat(String name, int age, String gender, String featherColor, float width) {
		super(name, age, gender);
		this.featherColor = featherColor;
		this.width = width;
	}
	public void displayCat() {
		System.out.println("Tên: " +getName()+ " - Tuổi: " +getAge()+ " - Giới tính: "+getGender()+ " - Màu lông: " +featherColor +" - Chiều cao: "+width);
	
	}

}
