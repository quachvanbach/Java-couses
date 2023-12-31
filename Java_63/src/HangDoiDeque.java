import java.util.ArrayDeque;
import java.util.Deque;

public class HangDoiDeque {
	public static void main(String[] args) {
		Deque<String> danhSachSV = new ArrayDeque<String>();
		danhSachSV.offerLast("Nguyen Van A");
		danhSachSV.offer("Tran Van B");
		danhSachSV.offer("Mac Van C");
		danhSachSV.offer("Hoang Van D");
		danhSachSV.offerFirst("Quach Dai E");

		while (true) {
			String ten = danhSachSV.poll();
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
