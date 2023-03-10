package Exercise6;

public class XeMay extends Xe {
	private int congSuat;
	
	public XeMay(int soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe, int congSuat) {
		super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
		this.congSuat = congSuat;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Công suất: "+getCongSuat());
	}


	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	
	
}
