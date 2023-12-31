import java.util.Scanner;

public class ToanTuTrongJava {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a, b;
			System.out.println("Nhập giá trị của a: ");
			a = sc.nextInt();
			System.out.println("Nhập giá trị của b: ");
			b = sc.nextInt();
			
			// Toán tử so sánh
			System.out.println("So sánh: " + a + " == " + b + " :" + (a==b));
			System.out.println("So sánh: " + a + " != " + b + " :" + (a!=b));
			System.out.println("So sánh: " + a + " < " + b + " :" + (a<b));
			System.out.println("So sánh: " + a + " <= " + b + " :" + (a<=b));
			System.out.println("So sánh: " + a + " > " + b + " :" + (a>b));
			System.out.println("So sánh: " + a + " >= " + b + " :" + (a>=b));
			
			// Toán tử điều kiện
			System.out.println("-------------------------------------------");
			System.out.println("Cả 2 số là số chẵn: "+ (a%2==0 && b%2==0));
			System.out.println("Có ít nhất 1 số là số chẵn: "+ (a%2==0 || b%2==0));
		}
	}
}
