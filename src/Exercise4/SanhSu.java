package Exercise4;

import java.time.LocalDate;

public class SanhSu extends SanPham {
	private LocalDate ngayNhapKho;
	private String nhaSanXuat;

	public SanhSu(int id, String name, int soLuongTonKho, float donGia, LocalDate ngayNhapKho, String nhaSanXuat) {
		super(id, name, soLuongTonKho, donGia);
		this.ngayNhapKho = ngayNhapKho;
		this.nhaSanXuat = nhaSanXuat;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\t\tSanhSu ["
				+ (ngayNhapKho != null ? "ngayNhapKho = " + ngayNhapKho + ", " : "Un-set, ")
				+ (nhaSanXuat != null ? "nhaSanXuat=" + nhaSanXuat : "") + "]";
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
}