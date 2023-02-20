package Exercise1;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog ("Chó con", 16, "Female","Trắng", 6);
		System.out.println("-----Thông tin Dog------------");
		dog.display_Dog();
		Cat cat = new Cat ("Mèo kute", 5, "Male","Đen", 8);
		System.out.println("-----Thông tin Cat------------");
		cat.display_Cat();

	}
}
