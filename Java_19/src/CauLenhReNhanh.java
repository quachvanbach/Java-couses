import java.util.Scanner;

public class CauLenhReNhanh {
	public static void main(String[] args) {
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhập số nguyên từ 2 đến 8: ");
			n = sc.nextInt();
		}
		switch (n) {
		case 2: {

			System.out.println("Thứ 2");
			break;
		}
		case 3: {

			System.out.println("Thứ 3");
			break;
		}
		case 4: {

			System.out.println("Thứ 4");
			break;
		}
		case 5: {

			System.out.println("Thứ 5");
			break;
		}
		case 6: {

			System.out.println("Thứ 6");
			break;
		}
		case 7: {

			System.out.println("Thứ 7");
			break;
		}
		case 8: {

			System.out.println("Chủ nhật");
			break;
		}

		default:
			System.out.println("Nhập dữ liệu sai");
		}
	}
}
