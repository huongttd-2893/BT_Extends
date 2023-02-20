package Exercise1;

public class Cat extends Animal{

	public Cat(String name, int age, String gender) {
		super(name, age, gender);

	}
	private String feather_color;
	private float width;
	public String getFeather_color() {
		return feather_color;
	}
	public void setFeather_color(String feather_color) {
		this.feather_color = feather_color;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public Cat(String name, int age, String gender, String feather_color, float width) {
		super(name, age, gender);
		this.feather_color = feather_color;
		this.width = width;
	}
	public void display_Cat() {
		System.out.println("Tên: " +getName()+ " - Tuổi: " +getAge()+ " - Giới tính: "+getGender()+ " - Màu lông: " +feather_color +" - Chiều cao: "+width);
	
	}

}
