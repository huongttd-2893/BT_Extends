package Exercise5;

import java.util.Scanner;

public class School{
	private String tenLop;
	private HocSinh hocSinh;
	
	public School() {}
	
	
	public School(String hoTen, int tuoi, String queQuan) {
	}

	public School(String hoTen, int tuoi, String queQuan, String tenLop, HocSinh hocSinh) {
		this.tenLop = tenLop;
		this.hocSinh = hocSinh;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public HocSinh getHocSinh() {
		return hocSinh;
	}

	public void setHocSinh(HocSinh hocSinh) {
		this.hocSinh = hocSinh;
	}
	
	public void nhapThongTinHoSoHocSinh() {
		hocSinh  = new HocSinh();
		hocSinh.nhapThongTinHocSinh();	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập lớp : ");
		tenLop = scanner.nextLine();
		
	}

	public void thongTinHocSinh() {
		hocSinh.displayHocSinh();
		System.out.println("Lớp: " + getTenLop());
	}

}

