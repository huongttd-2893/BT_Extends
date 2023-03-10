package Exercise6;


public class Oto extends Xe{
	
	private int soChoNgoi;
	private String kieuCoDong;
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Số chỗ ngồi: "+getSoChoNgoi()+" Kiểu cơ động: "+getKieuCoDong());
	}
	
	public Oto(int soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe, int soChoNgoi,
			String kieuCoDong) {
		super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
		this.soChoNgoi = soChoNgoi;
		this.kieuCoDong = kieuCoDong;
	}

	
	public int getSoChoNgoi() {
		return soChoNgoi;
	}
	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}
	public String getKieuCoDong() {
		return kieuCoDong;
	}
	public void setKieuCoDong(String kieuCoDong) {
		this.kieuCoDong = kieuCoDong;
	}
	
	

}
