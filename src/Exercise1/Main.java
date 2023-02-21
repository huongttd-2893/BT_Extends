package Exercise1;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog ("Chó con", 16, "Female","Trắng", 6);
		System.out.println("-----Thông tin Dog------------");
		dog.displayDog();
		Cat cat = new Cat ("Mèo kute", 5, "Male","Đen", 2);
		System.out.println("-----Thông tin Cat------------");
		cat.displayCat();
		 

	}
}
