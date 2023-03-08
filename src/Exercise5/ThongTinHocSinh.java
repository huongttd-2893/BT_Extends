package Exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class ThongTinHocSinh {

	public static void main(String[] args) {
		ArrayList<School> arrL = new ArrayList<>();
		int n;
//		School hocSinhLop;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số học sinh: ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("----Nhập thông tin học sinh thứ " + (i + 1) + ": ");
			School hocSinhLop = new School();
			hocSinhLop.nhapThongTinHoSoHocSinh();
			arrL.add(hocSinhLop);
		}

		for (int i = 0; i < arrL.size(); i++) {
			System.out.println("\n----Thông tin học sinh thứ " + (i + 1) + ": ");
			arrL.get(i).thongTinHocSinh();
		}

		System.out.println("\n----Danh sách Học Sinh 20 tuổi ");
		for (int i = 0; i < arrL.size(); i++) {
			if (arrL.get(i).getHocSinh().getTuoi() == 20) {
				arrL.get(i).thongTinHocSinh();
			}
		}
		int dem = 0;
		System.out.println("\n----Số Học sinh có tuổi là 23 và Quê ở Đà Nẵng ");
		for (int i = 0; i < arrL.size(); i++) {
			if (arrL.get(i).getHocSinh().getTuoi() == 23 
					&& arrL.get(i).getHocSinh().getQueQuan().toLowerCase().equals("Đà Nẵng".toLowerCase())) {
				dem++;
			}
			
		}
		System.out.println("Tổng là: "+dem);


	}

}
