
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class StackTrongJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stackChuoi = new Stack<String>();

//		stackChuoi.push("giá trị"); => Đưa giá trị vào stack.
//		stackChuoi.pop(); => Lấy giá trị ra khỏi stack.
//		stackChuoi.peek(); => Lấy giá trị ra nhưng không xoá khỏi stack.
//		stackChuoi.clear(); => Xoá tất cả các phần tử trong stack.
//		stackChuoi.contains("giá trị"); => Xác định giá trị có tồn tại trong stack hay không?
//		stackChuoi.size(); => Lấy ra độ dài của stack.

		// Đảo ngược chuỗi:
		System.out.println("Nhập vào chuỗi: ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i) + "");
		}
		System.out.println("Chuỗi đảo ngược: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}
		System.out.println();
		
		
		// Chuyển từ hệ thập phân sang hệ nhị phân:
		Stack<String> stackSoDu = new Stack<String>();
		
		System.out.println("Nhập 1 số nguyên dương: ");
		int x = sc.nextInt();
		while (x > 0) {
			int soDu = x % 2;
			stackSoDu.push(soDu+"");
			x=x/2;
		}
		int doDai = stackSoDu.size();
		System.out.println("Chuỗi nhị phân là: ");
		for (int i = 0; i < doDai; i++) {
			System.out.print(stackSoDu.pop());
		}
	}
}
