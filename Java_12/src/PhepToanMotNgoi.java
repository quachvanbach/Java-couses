
public class PhepToanMotNgoi {
	public static void main(String[] args) {
		int a = 5;
		boolean b = false;
		System.out.println("Âm (-) : "+ (-a));
		System.out.println("Dương (+) : " + (+a));
		System.out.println("Phủ định (!) : " + (!b));
		
		System.out.println("----------------------");
		System.out.println("a = " + a);
		System.out.println("++a = " + (++a)); // Tăng giá trị của a thêm 1 sau đó mới chạy câu lệnh in ra màn hình.
		System.out.println("a++ = " + (a++)); // Chạy câu lệnh in ra màn hình sau đó mới tăng giá trị của a thêm 1.
		System.out.println("a = " + a);
		System.out.println("--a = " + (--a)); // Giảm giá trị của a đi 1 sau đó mới chạy câu lệnh in ra màn hình.
		System.out.println("a-- = " + (a--)); // Chạy câu lệnh in ra màn hình sau đó mới giảm giá trị của a đi 1.
		System.out.println("a = " + a);
	}
}
