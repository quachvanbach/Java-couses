
public class TinhKeThua {
	public static void main(String[] args) {

		ConNguoi cn = new ConNguoi("bachqv", 1995);
		cn.an();
		cn.uong();
		cn.ngu();
		
		HocSinh hs = new HocSinh("Quach Van Bach", 1995, "12A", "THPT Thanh Binh");
		hs.an();
		hs.uong();
		hs.ngu();
		hs.lamBaiTap();
	}
}
