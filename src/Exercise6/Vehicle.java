package Exercise6;

import java.lang.reflect.Array;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class Vehicle implements Comparable<Vehicle>, Comparator<Vehicle> {
	private String licenseNumber;
	private String manufacturer;
	private int year;
	private String color;
	private Owner owner;
	
	
	public Vehicle() {};
	public Vehicle(String licenseNumber, String manufacturer, int year, String color, Owner owner) {
		this.licenseNumber = licenseNumber;
		this.manufacturer = manufacturer;
		this.year = year;
		this.color = color;
		this.owner = owner;
	}
	
	private boolean checkValidYear() {
		int currentYear = Year.now().getValue();
		if (year >= 2000 && year <= currentYear) {
			return true;
		}
		System.out.println("\t _Year is invalid");
		return false;
	}
	
	public abstract void hienThiThongTin();

	@Override
	public int compareTo(Vehicle other) {
		return other.licenseNumber.compareTo(this.licenseNumber);
	}

	@Override
	public int compare(Vehicle a, Vehicle b) {
		return b.licenseNumber.compareTo(a.getLicenseNumber());
	}

	public void loaiPhuongTien() {
		System.out.println(this.getClass().toString());
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
