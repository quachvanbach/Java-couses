
public class KieuDuLieuENum {
	public static void main(String[] args) {
		ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday, "Toán, Lý, Hoá");
		ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Tuesday, "Anh, Sinh, Sử, Địa");
		ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Tuesday, "Văn, Anh, Sinh");
		ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Thursday, "Toán, Văn, Anh");
		ThoiKhoaBieu tkb_t6 = new ThoiKhoaBieu(Day.Friday, "Văn, Sử, Địa");
		ThoiKhoaBieu tkb_t7 = new ThoiKhoaBieu(Day.Saturday, "Toán, Sinh, Hoá");
		ThoiKhoaBieu tkb_cn = new ThoiKhoaBieu(Day.Sunday, "Nghỉ");

		System.out.println(tkb_t2);
		System.out.println(tkb_t3);
		System.out.println(tkb_t4);
		System.out.println(tkb_t5);
		System.out.println(tkb_t6);
		System.out.println(tkb_t7);
		System.out.println(tkb_cn);

		int thang = Thang.Tháng_một.soNgay();
		System.out.println(thang);
	}
}
