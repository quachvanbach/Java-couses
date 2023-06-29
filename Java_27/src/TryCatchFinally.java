import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;

		try {
			System.out.println("Nhập vào sô nguyên: ");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Giá trị được nhập không đúng");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Giá trị được nhập vào là: " + n);
		System.out.println("Kết thúc chương trình!");
	}
}
