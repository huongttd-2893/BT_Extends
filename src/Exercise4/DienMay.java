package Exercise4;

public class DienMay extends SanPham {
	private int thoiGianBaoHanh;
	private int congSuat;

	public DienMay(int id, String name, int soLuongTonKho, float donGia, int thoiGianBaoHanh, int congSuat) {
		super(id, name, soLuongTonKho, donGia);
		this.congSuat = congSuat;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\t\tDienMay [thoiGianBaoHanh = " + thoiGianBaoHanh + ", congSuat = " + congSuat
				+ "]";
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}

}
