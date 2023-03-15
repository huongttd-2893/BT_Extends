package Exercise6;

public class Truck extends Vehicle {
	private int loadCapacity;

	public Truck(String licenseNumber, String manufacturer, int year, String color, Owner owner, int loadCapacity) {
		super(licenseNumber, manufacturer, year, color, owner);
		this.loadCapacity = loadCapacity;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("Số xe: " + getLicenseNumber());
		System.out.println("Nhà sản xuất: " + getManufacturer());
		System.out.println("Năm sản xuất: " + getYear());
		System.out.println("Màu xe: " + getColor());
		System.out.println("Chủ xe: " + getOwner().getFullName());
		System.out.println("Trọng tải: " + loadCapacity);

	}

}