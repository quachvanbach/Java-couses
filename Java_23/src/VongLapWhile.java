import java.util.Scanner;

public class VongLapWhile {
	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);
		while (x != 0) {
			System.out.println("Nhập ký tự 0 để thoát, Nhập ký tự khác để tiếp tục");
			x = sc.nextInt();
		}

		int y = 0;
		while (true) {
			System.out.println(y);
			y++;
			if (y == 10)
				break;

		}
	}
}
