public class PhuongThucGetSet {
	public static void main(String[] args) {
		MyDate md = new MyDate(31, 10, 2021);
		System.out.println("Ngày: " + md.getDay());
		md.setDay(30);
		System.out.println("Ngày: " + md.getDay());
		System.out.println("Tháng: " + md.getMonth());
		md.setMonth(13);
		System.out.println("Tháng: " + md.getMonth());
		System.out.println("Năm: " + md.getYear());
		md.setYear(0);
		System.out.println("Năm: " + md.getYear());
	}
}
