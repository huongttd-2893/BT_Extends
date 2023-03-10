package Exercise6;

public class Xe {
	private int soXe;
	private String nhaSanXuat;
	private int namSanXuat;
	private String mauXe;
	private  ChuXe chuXe;

	public void hienThiThongTin() {

		System.out.println("Số Xe: " + getSoXe() + " Nhà sản xuất: " + getNhaSanXuat() + " Năm sản xuất: "
				+ getNamSanXuat() + " Màu xe: " + getMauXe());
		this.chuXe.hienThiThongTinChuXe();

	}

	public Xe(int soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe) {
		super();
		this.soXe = soXe;
		this.nhaSanXuat = nhaSanXuat;
		this.namSanXuat = namSanXuat;
		this.mauXe = mauXe;
		this.chuXe = chuXe;
	}

	public int getSoXe() {
		return soXe;
	}

	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public String getMauXe() {
		return mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}

	public ChuXe getChuXe() {
		return chuXe;
	}

	public void setChuXe(ChuXe chuXe) {
		this.chuXe = chuXe;
	}

}
