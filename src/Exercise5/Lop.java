package Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lop {
	private String tenLop;
	private List<HocSinh> hocSinh;
	
	public void hienThiThongTinHocSinh() {
		System.out.println("Tên lớp: "+getTenLop());
		HocSinh hs = new HocSinh();
		hs.displayHocSinh();
	}
	
	public void nhapThongTinHocSinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ tên học sinh: ");
		String hoTen = scanner.nextLine();
		System.out.print("Nhập tuổi học sinh: ");
		int Tuoi = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập quê quán học sinh: ");
		String queQuan = scanner.nextLine();
		
		
	}
	public List<HocSinh> HocSinh20Tuoi(){
		List<HocSinh> hs20tuoi = new ArrayList<HocSinh>();
		for(HocSinh hs: hocSinh) {
			if (((HocSinh) hocSinh).getTuoi()==20)
				hs20tuoi.add(hs);
		}
		return hs20tuoi;
		
	}
		
	public Lop() {};
	public Lop(String tenLop, List<HocSinh> hocSinh) {
		super();
		this.tenLop = tenLop;
		this.hocSinh = hocSinh;
	}
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public List<HocSinh> getHocSinh() {
		return hocSinh;
	}
	public void setHocSinh(List<HocSinh> hocSinh) {
		this.hocSinh = hocSinh;
	}
	
	
}
