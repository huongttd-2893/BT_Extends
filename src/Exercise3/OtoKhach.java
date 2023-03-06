package Exercise3;

public class OtoKhach extends Xe implements QuanLyThue {
	private int soGhe;

	final float THUETRUOCBA = 0.05f;

	public OtoKhach(String nhaSanXuat, String name, float gia, int soGhe) {
		super(nhaSanXuat, name, gia);
		this.soGhe = soGhe;
	}

	@Override
	public double tinhThueVAT() {
		return VAT * this.getGia();
	}

	@Override
	public double tinhThueTruocBa() {
		return THUETRUOCBA * this.getGia();
	}

	public double thueTieuThuDacBiet() {
		if (soGhe >= 5) {
			return 0.3 * this.getGia();
		}

		return 0.5 * this.getGia();
	}

	@Override
	public String toString() {
		return super.toString() + "\n OtoKhach [soGhe = " + soGhe + ", THUETRUOCBA = " + THUETRUOCBA + ", tinhThueVAT() = "
				+ tinhThueVAT() + ", tinhThueTruocBa() = " + tinhThueTruocBa() + ", thueTieuThuDacBiet() = "
				+ thueTieuThuDacBiet() + "]";
	}

	public int getSoGhe() {
		return soGhe;
	}

	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}

}
