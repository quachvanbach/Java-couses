import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		// Cú pháp: ax^2 + bx + c = 0
		// Các biến cần có: a, b, c, x1, x2, delta.
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		a = sc.nextDouble();
		System.out.println("b = ");
		b = sc.nextDouble();
		System.out.println("c = ");
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) {
			System.out.println("Nhập a không phù hợp");
		} else {

			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				x1 = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
			} else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm phân biệt");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}
