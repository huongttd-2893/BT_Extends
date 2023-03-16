package Exercise6;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.stream.Collectors;

	public class RegistryVehicle {
		private List<Vehicle> vehicles;

		public List<Vehicle> getVehicles() {
			return vehicles;
		}

		public void setVehicles(List<Vehicle> vehicles) {
			this.vehicles = vehicles;
		}

		public RegistryVehicle() {
			vehicles = new ArrayList<>();
		}
        
	   // 1. Thêm phương tiện giao thông
		public void addVehicle(Vehicle vehicle) {
			this.vehicles.add(vehicle);
		}

	   // 2. Tìm kiếm phương tiện giao thông theo số xe
		public Vehicle findVehicleByLicenseNumber(String licenseNumber) {
			for (Vehicle vehicle : vehicles) {
				if (vehicle.getLicenseNumber().equals(licenseNumber)) {
					return vehicle;
				}
			}
			return null;
		}
		// 3. Tìm phương tiện giao thông của chủ xe có số cmnd tương ứng.
			public List<Vehicle> findVehicleByIdNumberOfOwner(String soCMND) {
				List<Vehicle> vehivlesByIdNumber = new ArrayList<>();
				for (Vehicle vehicle : vehicles) {
					if (vehicle.getOwner().getIdNumber().equals(soCMND)) {
						vehivlesByIdNumber.add(vehicle);
					}
				}
				return vehivlesByIdNumber;
			}

	   // 4. Xóa tất cả các phương tiện giao thông của một nhà sản xuất bất kỳ
		public void removeVehiclesByManufacturer(String manufacturer) {
			this.vehicles.removeIf(vehicle -> vehicle.getManufacturer().equals(manufacturer));
		}

		

		// 5. Hiển thị nhà sản xuất nào có nhiều xe nhất đang được quản lý
		public String findManufacturerWithMostVehicles() {
			Map<String, Integer> manufacturerCountMap = new HashMap<>();
			for (Vehicle vehicle : this.vehicles) {
				String manufacturer = vehicle.getManufacturer();
				int count = manufacturerCountMap.getOrDefault(manufacturer, 0);
				manufacturerCountMap.put(manufacturer, count + 1);
			}
			String manufacturerWithMostVehicles = null;
			int maxVehicleCount = 0;
			for (Map.Entry<String, Integer> entry : manufacturerCountMap.entrySet()) {
				if (entry.getValue() > maxVehicleCount) {
					manufacturerWithMostVehicles = entry.getKey();
					maxVehicleCount = entry.getValue();
				}
			}
			return manufacturerWithMostVehicles;
		}

		// 6. Sắp xếp các phương tiện giao thông theo số xe giảm dần
		public List<Vehicle> sortVehiclesByLicenseNumberDescending() {
			Collections.sort(vehicles);
			return vehicles;
		}

		// 7. Thống kê mỗi loại phương tiện có bao nhiêu xe đang được quản lý.
		public Map<String, Integer> countVehiclesByType() {
			Map<String, Integer> vehicleCountMap = new HashMap<>();
			vehicleCountMap.put("Car", getNumberOfCars());
			vehicleCountMap.put("Motorcycle", getNumberOfMotorcycle());
			vehicleCountMap.put("Truck", getNumberOfTrucks());
			return vehicleCountMap;
		}

		private int getNumberOfCars() {
			int count = 0;
			for (Vehicle vehicle : vehicles) {
				if (vehicle instanceof Car) {
					count++;
				}
			}
			return count;
		}

		private int getNumberOfMotorcycle() {
			int count = 0;
			for (Vehicle vehicle : vehicles) {
				if (vehicle instanceof Motorcycle) {
					count++;
				}
			}
			return count;
		}

		private int getNumberOfTrucks() {
			int count = 0;
			for (Vehicle vehicle : vehicles) {
				if (vehicle instanceof Truck) {
					count++;
				}
			}
			return count;
		}

	}
