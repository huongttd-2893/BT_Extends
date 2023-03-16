package Exercise6;

import java.time.Year;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		Owner on1 = new Owner("123456789", "Huong", "huong@gmail.com");
		Owner on2 = new Owner("987654321", "Vy", "vy@gmail.com");

		Vehicle car1 = new Car("A123", "Toyota", 2010, "trắng", on1, 5, "gasoline");
		Vehicle car2 = new Car("B123", "Honda", 2015, "đen", on2, 4, "electric");
		Vehicle bike1 = new Motorcycle("C123", "Yamaha", 2018, "đỏ", on1, 12);
		Vehicle truck1 = new Truck("D123", "Yamaha", 2020, "xanh", on2, 102);
		Vehicle bike2 = new Motorcycle("E123", "Suzuki", 2012, "trắng", on1, 1);

		
		RegistryVehicle vhs = new RegistryVehicle();
		vhs.addVehicle(car1);
		vhs.addVehicle(truck1);
		vhs.addVehicle(car1);
		vhs.addVehicle(bike2);
		vhs.addVehicle(bike1);
		
		//Tìm kiếm phương tiện giao thông theo số xe
		System.out.println("-----Phương tiện giao thông có số xe A123 là: ");
		vhs.findVehicleByLicenseNumber("A123").hienThiThongTin();
		
		//Xóa tất cả các phương tiện giao thông của một nhà sản xuất bất kỳ.
		System.out.println("-----Sau khi xóa nhà sản xuất: ");
		vhs.removeVehiclesByManufacturer("Honda");
		
		for (Vehicle vehicle : vhs.getVehicles()) {
			vehicle.hienThiThongTin();
		}
		
		//Cho biết nhà sản xuất nào có nhiều xe nhất đang được quản lý
		System.out.println("\n");
		System.out.println("-----Nhà sản xuất có nhiều xe nhất đang được quản lý: ");
		System.out.println(vhs.findManufacturerWithMostVehicles());
		
		//Sắp xếp các phương tiện giao thông theo số xe giảm dần
		System.out.println("-----Sau khi sắp xếp: ");
		vhs.sortVehiclesByLicenseNumberDescending();
		for (Vehicle vehicle : vhs.getVehicles()) {
			vehicle.hienThiThongTin();
		}
		
		//Thống kê mỗi loại phương tiện có bao nhiêu xe đang được quản lý.
		System.out.println("-----Thống kê số lượng từng loại: ");
		Map<String, Integer> vehiclesByTypes = vhs.countVehiclesByType();
		vehiclesByTypes.forEach((k, v) ->{
			System.out.println("Loại " + k + " - số lượng: " + v);
		});

	}

}
