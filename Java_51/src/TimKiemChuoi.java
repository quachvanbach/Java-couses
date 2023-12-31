
public class TimKiemChuoi {
	public static void main(String[] args) {
		String s1 = "Họ và tên: Nguyễn Văn A. Ngày sinh: 01-01-1991. Địa chỉ: thị trấn Thanh Hà, Thanh Hà, Hải Dương";
		String s2 = "Họ tên: Mạc Văn B. Ngày sinh: 02-02-1992. Địa chỉ: Thanh Thuỷ, Thanh Hà, Hải Dương";
		char c1 = 'A';

		// Hàm indexOf => trả lại vị trí của nội dung được tìm kiếm trong chuỗi đó (nếu
		// có).
		System.out.println(s1.indexOf("thị trấn Thanh Hà"));
		System.out.println(s2.indexOf("thị trấn Thanh Hà"));

		// Hàm indexOf có sử dụng vị trí bắt đầu tìm kiếm:
		System.out.println(s1.indexOf("Nguyễn Văn A", 11));
		System.out.println(s2.indexOf("Mạc Văn B", 11));

		// Tìm kiếm char:
		System.out.println(s1.indexOf(c1));
		System.out.println(s2.indexOf(c1));

		// Hàm lastIndexOf => Tìm kiếm ngược từ phải sang trái
		System.out.println(s1.lastIndexOf("Thanh Hà"));
	}
}
