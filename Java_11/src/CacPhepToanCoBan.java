import java.util.Scanner;

public class CacPhepToanCoBan {
	public static void main(String[] args) {
		// Khai báo biến
		int a, b;

		// Nhập dữ liệu:
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập và số a: ");
		a = sc.nextInt();
		System.out.println("Nhập và số b: ");
		b = sc.nextInt();

		int tong = a + b;
		System.out.println(a + " + " + b + " = " + tong);
		
		int hieu = a - b;
		System.out.println(a + " - " + b + " = " + hieu);
		
		int tich = a * b;
		System.out.println(a + " * " + b + " = " + tich);
		
		float thuong = (float)a / b;
		System.out.println(a + " / " + b + " = " + thuong);
		
		int soDu = a % b;
		System.out.println(a + " % " + b + " = " + soDu);
		
	}
}
