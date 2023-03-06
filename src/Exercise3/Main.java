package Exercise3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Xe xeMay1 = new XeMay("HonDa", "Future", "Xang", 500);
		XeMay xeVinfast = new XeMay("Vinfast", "Xe dien", "Dien", 3200);
		Xe oToCon = new OtoKhach("Toyota", "xe oto con", 10000, 5);
		Xe oto16Cho = new OtoKhach("Kia", "Xe khach 16 cho", 15000, 16);
		Xe xeDap = new XeDap("VietNam", "cua tui do", 20);

//		List<Xe> quanLyXe2 = new ArrayList<Xe>();
//		quanLyXe2.add(xeVinfast); // tu add tiep cac item

		List<Xe> quanLyXe = Arrays.asList(xeMay1, xeVinfast, oto16Cho, oToCon, xeDap);

		for (Xe xe : quanLyXe) {
			System.out.println(xe.toString());
			System.out.println("\n");
		}
	}

}
