package Exercise6;
public class XeTai extends Xe{
	private int trongTai;
	
	public XeTai(int soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe, int trongTai) {
		super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
		this.trongTai = trongTai;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Trọng tải: "+getTrongTai());
	}
	public int getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(int trongTai) {
		this.trongTai = trongTai;
	}
	
}
