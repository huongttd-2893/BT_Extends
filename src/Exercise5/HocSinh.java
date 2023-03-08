package Exercise5;

import java.util.Scanner;

public  class HocSinh {
	private String hoTen;
	private int Tuoi;
	private String queQuan;
	
	public HocSinh() {
		
	}
	public HocSinh(String hoTen, int tuoi, String queQuan) {
		this.hoTen = hoTen;
		Tuoi = tuoi;
		this.queQuan = queQuan;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getTuoi() {
		
		return this.Tuoi;
	}
	public void setTuoi(int tuoi) {
		this.Tuoi = tuoi;
	}
	public String getQueQuan() {
		
		return this.queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	

	public void nhapThongTinHocSinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên học sinh: ");
		this.hoTen = scanner.nextLine();
		System.out.print("Nhập tuổi học sinh: ");
		this.Tuoi = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập quê quán học sinh: ");
		this.queQuan = scanner.nextLine();
		
	}
	
	public void displayHocSinh() {
		System.out.println("Họ tên: "+ getHoTen() +" Tuổi: "+getTuoi()+" Quê quán: "+getQueQuan());
	}
	
}
