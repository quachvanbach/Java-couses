import java.util.Scanner;

public class BaiTapHinhTron {
	public static void main(String[] args) {
		double r, dienTich, chuVi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào bán kính r: ");
		r = sc.nextDouble();
		
		// Tính chu vi hình tròn
		chuVi = 2*r*Math.PI;
		System.out.println("Chu vi của hình tròn là: " + chuVi);
		System.out.println("Chu vi của hình tròn là: " + Math.round(chuVi)); // Làm tròn lấy phần số nguyên với Math.round()
		System.out.println("Chu vi của hình tròn là: " + Math.round(chuVi*100.0)/100.0); // Mẹo làm tròn lấy 2 số phần thập phân với Math.round()
		
		// Tính diện tích của hình tròn:
		dienTich = Math.PI * Math.pow (r,2);
		System.out.println("Diện tích của hình tròn là: " + dienTich);
		System.out.println("Diện tích của hình tròn là: " + Math.round(dienTich));
		System.out.println("Diện tích của hình tròn là: " + Math.round(dienTich*100.0)/100.0);
	}
}
