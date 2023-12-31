import java.util.Scanner;

public class ChuyenDoiThapPhanSangNhiPhan {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n>0:");
		n = sc.nextInt();
		
		String nhiPhan = "";
		/* Cách tính số nhị phân:
		 * Lấy số được cho chia cho 2.
		 * Sau đó chia liên tục kết quả nhận được cho 2
		 * Ta nhận được các số dư sau các kết quả đó.
		 * Ghép chúng lại và đảo ngược chuỗi đó, ta nhận được dãy số nhị phân.
		 */
		
		while (n>0) {
			nhiPhan = (n%2) + nhiPhan;
			n = n/2;
		}
		System.out.println("Hệ nhị phân của " + n + " là: " + nhiPhan);
	}
}
