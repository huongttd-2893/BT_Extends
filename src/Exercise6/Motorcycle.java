package Exercise6;

public class Motorcycle extends Vehicle {
	private int powerOutput;

	public Motorcycle(String licenseNumber, String manufacturer, int year, String color, Owner owner, int powerOutput) {
		super(licenseNumber, manufacturer, year, color, owner);
		this.powerOutput = powerOutput;
	}

	public int getPowerOutput() {
		return powerOutput;
	}

	public void setPowerOutput(int powerOutput) {
		this.powerOutput = powerOutput;
	}

	@Override
	public void hienThiThongTin() {
		System.out.println("Số xe: " + getLicenseNumber());
		System.out.println("Nhà sản xuất: " + getManufacturer());
		System.out.println("Năm sản xuất: " + getYear());
		System.out.println("Màu xe: " + getColor());
		System.out.println("Chủ xe: " + getOwner().getFullName());
		System.out.println("công xuất: " + powerOutput);
	}

}

