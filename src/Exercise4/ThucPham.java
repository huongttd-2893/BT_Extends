package Exercise4;

import java.time.LocalDate;

public class ThucPham extends SanPham {
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	private String nhaCungCap;

	public ThucPham(int id, String name, int soLuongTonKho, float donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan,
			String nhaCungCap) {
		super(id, name, soLuongTonKho, donGia);
		this.ngayHetHan = ngayHetHan;
		this.ngaySanXuat = ngaySanXuat;
		this.nhaCungCap = nhaCungCap;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\t\tThucPham ["
				+ (ngaySanXuat != null ? "ngaySanXuat = " + ngaySanXuat + ", " : "ngaySanXuat = UN-set, ")
				+ (ngayHetHan != null ? "ngayHetHan = " + ngayHetHan + ", " : "ngayHetHan = Un-set, ")
				+ (nhaCungCap != null ? "nhaCungCap = " + nhaCungCap : "nhaCungCap = UN-set") + "]";
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.compareTo(this.ngaySanXuat) < 0) {
			System.out.println("ngày hết hạn phải sau hoặc là ngày sản xuất");
			System.out.println("Data input invalid, set value FAIL!!!");
			return;
		}
		this.ngayHetHan = ngayHetHan;
	}

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

}
