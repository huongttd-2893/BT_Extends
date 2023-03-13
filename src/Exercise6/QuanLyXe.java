package Exercise6;

import java.util.ArrayList;

import java.util.Scanner;

public class QuanLyXe {

	private ArrayList<Xe> dsXe = new ArrayList<Xe>();

	public ChuXe nhapThongTinChuXe() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập CMND : ");
		int cmnd = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập Họ tên : ");
		String hoTen = scanner.nextLine();
		System.out.print("Nhập Email : ");
		String email = scanner.nextLine();
		return new ChuXe(cmnd, hoTen, email);
	}

	public Xe nhapThongTinXe() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập Số Xe : ");
		int soXe = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập Nhà sản xuất : ");
		String nhaSanXuat = scanner.nextLine();
		System.out.print("Nhập Năm sản xuất : ");
		int namSanXuat = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập màu xe : ");
		String mauXe = scanner.nextLine();
		ChuXe chuXe = this.nhapThongTinChuXe();
		return new Xe(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
	}

	public Oto nhapThongTinOTo() {
		Xe xe = this.nhapThongTinXe();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số chỗ ngồi : ");
		int soChoNgoi = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập kiểu cơ động : ");
		String kieuCoDong = scanner.nextLine();
		return new Oto(xe.getSoXe(), xe.getNhaSanXuat(), xe.getNamSanXuat(), xe.getMauXe(), xe.getChuXe(), soChoNgoi,
				kieuCoDong);
	}

	public XeMay nhapThongTinXeMay() {
		Xe xe = this.nhapThongTinXe();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập công suất : ");
		int congSuat = Integer.parseInt(scanner.nextLine());
		return new XeMay(xe.getSoXe(), xe.getNhaSanXuat(), xe.getNamSanXuat(), xe.getMauXe(), xe.getChuXe(), congSuat);
	}

	public XeTai nhapThongTinXeTai() {
		Xe xe = this.nhapThongTinXe();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập công suất : ");
		int trongTai = Integer.parseInt(scanner.nextLine());
		return new XeTai(xe.getSoXe(), xe.getNhaSanXuat(), xe.getNamSanXuat(), xe.getMauXe(), xe.getChuXe(), trongTai);
	}

	// 2. Tìm kiếm phương tiện giao thông theo số xe
	public void timKiemTheoSoXe(Scanner sc) {
		System.out.print("Nhập số xe cần tìm kiếm:");
		int soXeTK = sc.nextInt();
		int soXe;
		for (int i = 0; i < dsXe.size(); i++) {
			soXe = dsXe.get(i).getSoXe();
			if (soXe == soXeTK)
				dsXe.get(i).hienThiThongTin();
		}
	}

	//3. Tìm phương tiện giao thông của chủ xe có số cmnd tương ứng.
	public void timKiemChuXeTheoCMND(Scanner sc) {
		System.out.print("Nhập Chủ xe cần tìm kiếm: ");
		String chuXeTK = sc.nextLine();
		System.out.print("Nhập Số CMND của chủ xe cần tìm: ");
		int soCMNDTK = sc.nextInt();
		for (int i = 0; i < dsXe.size(); i++) {
			int soCMND = dsXe.get(i).getChuXe().getCmnd();
			String tenCX = dsXe.get(i).getChuXe().getHoTen();
			if (soCMND == soCMNDTK && tenCX == chuXeTK)
				dsXe.get(i).hienThiThongTin();
		}
	}
	//4. Xóa tất cả các phương tiện giao thông của một nhà sản xuất bất kỳ.
	public boolean delete(String nsx) {
        Xe nhaSanXuat = this.dsXe.stream().filter(t -> t.getNhaSanXuat().equals(nsx)).findFirst().orElse(null);
        if (nhaSanXuat == null) {
            return false;
        }
        this.dsXe.remove(nhaSanXuat);
        return true;
    }
	//6. Sắp xếp các phương tiện giao thông theo số xe giảm dần
//	public void sapXep() {
//		
//		for (int i = 0; i < dsXe.length - 1; i++) {
//            for (int j = i + 1; j < dsXe.length; j++) {
//                if (dsXe[i].getSoXe() > dsXe[j].getSoXe()) {
//                    temp = dsXe[j];
//                    dsXe[j] = dsXe[i];
//                    dsXe[i] = temp;
//                }
//            }
//        }
//	}
	
	
	public void nhapThongTinCacXe(Scanner sc) {
		char select;
		int choice = 0;
		while (true) {
			System.out.println("----- Mời lựa chọn nhập:-----");
			System.out.println("---1. Nhập thông tin xe ôTô");
			System.out.println("---2. Nhập thông tin xe Máy");
			System.out.println("---3. Nhập thông tin xe Tải");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				Oto oto = nhapThongTinOTo();
				dsXe.add(oto);
				oto.hienThiThongTin();
				break;
			}
			case 2: {
				XeMay xeMay = nhapThongTinXeMay();
				dsXe.add(xeMay);
				xeMay.hienThiThongTin();
				break;
			}
			case 3: {
				XeTai xeTai = nhapThongTinXeTai();
				dsXe.add(xeTai);
				xeTai.hienThiThongTin();
				break;
			}

			}
			System.out.println("Ban co muon nhap nua khong: (Y/N)");
			select = sc.nextLine().charAt(0);
			if (select == 'N' || select == 'n')
				break;
		}
	}

	public static void main(String[] args) {
		QuanLyXe quanLyXe = new QuanLyXe();
		Scanner sc = new Scanner(System.in);
		quanLyXe.nhapThongTinCacXe(sc);
		quanLyXe.timKiemTheoSoXe(sc);
		quanLyXe.timKiemChuXeTheoCMND(sc);
		
		
	}

}
