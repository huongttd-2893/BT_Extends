package Exercise4;

public abstract class SanPham {
	private int id;
	private String name;
	private int soLuongTonKho;
	private float donGia;

	public SanPham(int id, String name, int soLuongTonKho, float donGia) {
		this.id = id;
		this.name = name;
		this.soLuongTonKho = soLuongTonKho;
		this.donGia = donGia;
	}

	public float thueVAT(float vat) {
		return vat * this.donGia;
	}

	@Override
	public String toString() {
		return "SanPham [id= " + id + ", " + (name != null ? "name = " + name + ", " : "") + "soLuongTonKho = "
				+ soLuongTonKho + ", donGia = " + donGia + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSoLuongTonKho() {
		return soLuongTonKho;
	}

	public void setSoLuongTonKho(int soLuongTonKho) {
		this.soLuongTonKho = soLuongTonKho;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

}
