package Exercise4;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class QuanLyKho implements DanhGiaMucDoTieuThuCuaSanPham {

	public static void main(String[] args) {
		List<SanPham> danhSachSanPham = new ArrayList<SanPham>();
		danhSachSanPham.add(new ThucPham(1, "thuc pham 1", 2, 20, LocalDate.parse("2023-2-10"),
				LocalDate.parse("2023-2-15"), "Nha san xua 1"));

		danhSachSanPham.add(new SanhSu(2, "Sanh su 1", 3, 250, LocalDate.parse("2023-2-12"), "Nha san xuất sanh su 1"));

		danhSachSanPham.add(new DienMay(2, "Dien may 1", 3, 1.50f, 10, 220));
	}

	@Override
	public void danhGiaMucDoTieuThu(SanPham sp) {
		if (sp instanceof DienMay && sp.getSoLuongTonKho() < 3) {
			System.out.println("Mức độ tiêu thụ:\n\t\t Sản phẩm " + sp.getName() + " - Bán được");
			return;
		}

		if (sp instanceof ThucPham && sp.getSoLuongTonKho() > 0
				&& ((ThucPham) sp).getNgayHetHan().isAfter(LocalDate.now())) {
			System.out.println("Mức độ tiêu thụ:\n\t\t Sản phẩm " + sp.getName() + " - Khó bán");
		}

		if (sp instanceof SanhSu && sp.getSoLuongTonKho() > 50
				&& ((SanhSu) sp).getNgayNhapKho().plusDays(10).isBefore(LocalDate.now())) {
			System.out.println("Mức độ tiêu thụ:\n\t\t Sản phẩm " + sp.getName() + " - Chậm bán");
		}

		System.out.println("Không thuộc phạm vi đánh giá");
	}

}