import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		double a, b, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a: ");
		a = sc.nextDouble();
		System.out.println("Nhập b: ");
		b = sc.nextDouble();
		
		if (a==0) {
			if (b==0) {
				System.out.println("Phương trình có vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		} else {
			System.out.println("Phương trình có nghiệm là x = " + (-b) + "/" + a + " = " + ((-b/a)));
		}
	}
}
