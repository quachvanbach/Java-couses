import java.util.Scanner;

public class GioiThieuVeMang {
	public static void main(String[] args) {

		double[] mang1;
		double mang2[];
		
		mang1 = new double[11];
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < mang1.length; i++) {
			System.out.println("Nhấp phần tử thứ " + i + ":");
			mang1[i] = sc.nextDouble();
		}
		double tong = 0;
		for (int i = 1; i < mang1.length; i++) {
			tong += mang1[i];
		}
		System.out.println("Tổng = " + tong);
		
		mang2 = new double[]{1,2,3,4,5};
		System.out.println("Mảng 3 gồm các phần tử:");
		for (int i = 0; i < mang2.length; i++) {
			System.out.println(mang2[i]);
		}
	}
}
