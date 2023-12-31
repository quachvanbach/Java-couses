
public class CatNoiChuoi {
	public static void main(String[] args) {
		String s1 = "Họ tên: Nguyễn Văn A.";
		String s2 = " Địa chỉ: Thị trấn Thanh Hà, Thanh Hà, Hải Dương. ";

		// Hàm concat() => Nối chuỗi:
		String s3 = s1.concat(s2);
		System.out.println(s3);

		// Hàm replace() => Thay thế:
		String s4 = s1.replaceAll("Nguyễn Văn A", "Mạc Văn B");
		System.out.println(s4);

		// Hàm toLowerCase() => Chuyển chuỗi về chữ in thường.
		//Hàm toUpperCase() => Chuyển chuỗi về chữ in hoa
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		// Hàm trim() => Xoá khoảng trắng dư thừa ở đầu và cuối chuỗi:
		System.out.println(s2.trim());
		
		// Hàm subString => cắt chuỗi ban đầu thành các chuỗi con.
		String s5 = s1.substring(8);
		String s6 = s1.substring(8,20);
		System.out.println(s5);
		System.out.println(s6);
	}
}
