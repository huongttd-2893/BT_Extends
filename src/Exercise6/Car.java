package Exercise6;

public class Car extends Vehicle {
	private int seatingCapacity;
	private String engineType;

	public Car(String licenseNumber, String manufacturer, int year, String color, Owner owner, int seatingCapacity,
			String engineType) {
		super(licenseNumber, manufacturer, year, color, owner);
		this.seatingCapacity = seatingCapacity;
		this.engineType = engineType;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("Số xe: " + getLicenseNumber());
		System.out.println("Nhà sản xuất: " + getManufacturer());
		System.out.println("Năm sản xuất: " + getYear());
		System.out.println("Màu xe: " + getColor());
		System.out.println("Chủ xe: " + getOwner().getFullName());
		System.out.println("Số chỗ ngồi: " + seatingCapacity);
		System.out.println("Kiểu động cơ: " + engineType);

	}

}

