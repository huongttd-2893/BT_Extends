package Exercise2;

import java.util.Scanner;

public class Main {

	public static void checkDateData(int year, int month, int day) {
	// check phải là số dương, month từ 1..12
	if (year <= 0 || month < 0 || month > 12 || day < 1 || day > 31) {
		System.out.println("Data không hợp lệ");
		return;
	}

	// Phải là năm nhuận và tháng 2
	if (month == 2 && (year % 4 == 0 || year % 400 == 0)) {
		if (day > 29) {
			System.out.println("Data không hợp lệ");
			return;
		}
		System.out.println("Data hợp lệ");
		return;
	}

	// tháng 2 nhưng ko phải năm nhuận
	if (month == 2) {
		if (day > 28) {
			System.out.println("Data không hợp lệ");
			return;
		}
		System.out.println("Data hợp lệ");
		return;
	}

	// Không phải tháng 2 và ko phải thuộc tháng có 31 ngày
	if (month == 4 || month == 6 || day == 9 || day == 11) {
		if (day > 30) {
			System.out.println("Data không hợp lệ");
			return;
		}
		System.out.println("Data hợp lệ");
		return;
	}

	
	// Không phải tháng 2, là 1 trong tháng có 31 ngày
	if (day > 31) {
		System.out.println("Data không hợp lệ");
		return;
	}
	System.out.println("Data hợp lệ");
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập năm: ");
	int year = sc.nextInt();

	System.out.println("Nhập tháng: ");
	int month = sc.nextInt();

	System.out.println("Nhập ngày: ");
	int day = sc.nextInt();

	checkDateData(year, month, day);

}

}