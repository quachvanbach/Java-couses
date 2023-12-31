import java.util.Scanner;

public class LopMath {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a = ");
		a = sc.nextDouble();
		System.out.println("Nhập b =");
		b = sc.nextDouble();

		// Hàm giá trị tuyệt đối:
		System.out.println("|a| = " + Math.abs(a));

		// Hàm tìm min
		System.out.println("Min là: " + Math.min(a, b));
		
		// Hàm tìm max
		System.out.println("Max là: " + Math.max(a, b));
		
		// Hàm ceil
		System.out.println("Ceil là: " + Math.ceil(a));
		
		// Hàm floor
		System.out.println("Floor là: " + Math.floor(a));
		
		// Hàm căn bậc 2
		System.out.println("Căn bậc 2 (sqrt) là: " + Math.sqrt(a));
		
		// Hàm tính số luỹ thừa
		System.out.println(a + " luỹ thừa "+ b + " = " + Math.pow(a,b));
	}
}
