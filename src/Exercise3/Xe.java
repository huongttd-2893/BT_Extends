package Exercise3;

public abstract class Xe {
	private String nhaSanXuat;
	private String name;
	private float gia;

	public Xe(String nhaSanXuat, String name, float gia) {
		this.nhaSanXuat = nhaSanXuat;
		this.name = name;
		this.gia = gia;
	}

	@Override
	public String toString() {
		return "THÔNG TIN CHUNG [" + (nhaSanXuat != null ? "nhaSanXuat = " + nhaSanXuat + ", " : "")
				+ (name != null ? "name = " + name + ", " : "") + "gia = " + gia + "]";
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}
}
