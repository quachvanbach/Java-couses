import java.util.Scanner;

public class VongLapFor {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào x khởi tạo:");
		int x1 = sc.nextInt();
		System.out.println("Nhập vào y:");
		y = sc.nextInt();
		for (x = x1 ; x <= y; x++) {
			System.out.println("Số " + x);
		}
	}
}
