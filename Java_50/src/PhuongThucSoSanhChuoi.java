
public class PhuongThucSoSanhChuoi {
	public static void main(String[] args) {
		String s1 = "titv.vn";
		String s2 = "TITV.VN";
		String s3 = "titv.vn";
		
		//Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt hoa - thường.
		System.out.println("s1 equals s2: "+ s1.equals(s2));
		System.out.println("s1 equals s2: "+ s1.equals(s3));
		
		//Hàm equalsIgnoreCase => so sánh 2 chuỗi giống nhau, không phân biệt hoa - thường.
		System.out.println("s1 equalsIgnoreCase s2: "+ s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s2: "+ s1.equalsIgnoreCase(s3));
		
		// Hàm compareTo => so sánh chuỗi.
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		
		System.out.println("sv1.compareTo(sv2): " + sv1.compareTo(sv2));
		System.out.println("sv1.compareTo(sv3): " + sv1.compareTo(sv3)); 
		
		// Hàm compareToIgnoreCase => Tương tự hàm compareTo, không phân biệt hoa - thường.
		
		// Hàm regionMatches(ký tự bắt đầu, chuỗi cần so sánh, ký tự bắt đầu của chuỗi cần so sánh, số ký tự cần so sánh) => so sánh 1 đoạn không phân biệt hoa - thường.
		String r1 = "quachvanbach";
		String r2 = "quachbach";
		
		boolean check = r1.regionMatches(8, r2, 5, 4);
		System.out.println(check);
		
		// Hàm startWith => kiểm tra chuỗi bắt đầu bằng...
		String sdt = "0971882842";
		
		System.out.println(sdt.startsWith("0971"));
		System.out.println(sdt.startsWith("0984"));
		
		// Hàm endWith => kiểm tra chuỗi kết thúc bằng...
		String file1 = "Hình ảnh.JPG";
		String file2 = "Ứng dụng.exe";
		
		if(file1.endsWith("JPG")) {
			System.out.println(file1+ ": Đây là file hình ảnh.");
		} else {
			System.out.println(file1+ ": Đây không phải là file hình ảnh");
		}
		if(file1.endsWith("JPG")) {
			System.out.println(file2+ ": Đây là file ứng dụng.");
		} else {
			System.out.println(file2+ ":  Đây không phải là file úng dụng.");
		}
	}
}
