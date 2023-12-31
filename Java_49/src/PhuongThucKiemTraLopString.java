import java.util.Scanner;

public class PhuongThucKiemTraLopString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("----------------");

		// Hàm length() => Lấy ra dộ dài của chuỗi.
		System.out.println(s.length());

		// Hàm charAt() => Lấy ra ký tự tại vị trí bất ký trong chuỗi.
		for (int i = 0; i < s.length(); i++) {
			System.out.println("Vị trí: " + i + " là: " + s.charAt(i));
		}

		// Hàm getChars(vị trí bắt đầu, vị trí kết thúc (-1), tên mảng, vị trí bắt đầu
		// lưu của mảng) =>
		char[] arrChar = new char[10];
		s.getChars(2, 5, arrChar, 0);
		for (int i = 0; i < arrChar.length; i++) {
			System.out.println("Giá trị của mảng tại " + i + " là: " + arrChar[i]);
		}

		// Hàm getByte => Có 3 cách lấy ra giá trị ASCII của các ký tự.
		byte[] arrayBytes = s.getBytes();
		for (byte b : arrayBytes) {
			System.out.println(b);
		}
	}
}
