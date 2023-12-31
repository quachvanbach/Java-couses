import java.util.PriorityQueue;
import java.util.Queue;

public class HangDoiPriotityQueue {
	public static void main(String[] args) {
				Queue<String> danhSachSV = new PriorityQueue<String>();
				danhSachSV.offer("Nguyen Van A");
				danhSachSV.offer("Tran Van B");
				danhSachSV.offer("Mac Van C");
				danhSachSV.offer("Hoang Van D");
				danhSachSV.offer("Quach Dai E");

				while (true) {
					String ten = danhSachSV.poll();
					if (ten == null) {
						break;
					}
					System.out.println(ten);
				}
	}
}
