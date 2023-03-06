package Exercise3;

public class XeMay extends Xe implements QuanLyThue {
	private String nhienLieu;

	final float THUETRUOCBA = 0.05f;

	public XeMay(String nhaSanXuat, String name, String nhienLieu, float gia) {
		super(nhaSanXuat, name, gia);
		this.nhienLieu = nhienLieu;
	}

	@Override
	public double tinhThueVAT() {
		return VAT * this.getGia();
	}

	@Override
	public double tinhThueTruocBa() {
		return THUETRUOCBA * this.getGia();
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tXeMay [" + (nhienLieu != null ? "nhienLieu = " + nhienLieu + ", " : "")
				+ "THUETRUOCBA = " + THUETRUOCBA + ", tinhThueVAT() = " + tinhThueVAT() + ", tinhThueTruocBa() = "
				+ tinhThueTruocBa() + "]";
	}

	public String getNhienLieu() {
		return nhienLieu;
	}

	public void setNhienLieu(String nhienLieu) {
		this.nhienLieu = nhienLieu;
	}

}
