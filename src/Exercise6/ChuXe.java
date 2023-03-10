package Exercise6;

public class ChuXe {
	private int cmnd;
	private String hoTen;
	private String email;
	
	public void hienThiThongTinChuXe() {
		
		System.out.println("Số CMND: " +getCmnd()+ "Họ tên: "+getHoTen()+" Email: "+getEmail());
	}
	
	public ChuXe(int cmnd, String hoTen, String email) {
		this.cmnd = cmnd;
		this.hoTen = hoTen;
		this.email = email;
	}
	public int getCmnd() {
		return cmnd;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
