package Exercise1;

public class Dog extends Animal{

	public Dog(String name, int age, String gender) {
		super(name, age, gender);
	}
		private String color;
		private float height;
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public float getHeight() {
			return height;
		}
		public void setHeight(float height) {
			this.height = height;
		}
		public Dog(String name, int age, String gender, String color, float height) {
			super(name, age, gender);
			this.color = color;
			this.height = height;
		}
		public void displayDog() {
			System.out.println("Tên: " +getName()+ " - Tuổi: " +getAge()+ " - Giới tính: "+getGender()+ " - Màu: " +color +" - Trọng lượng: "+height);
		
		}
		
	
	
	
	

}
