
public class PhuongThucOverloading {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		System.err.println("Tìm min giữa 5 và 6: " + mm.timMin(5, 6));
		System.err.println("Tìm min giữa 5.9 và 6.6: " + mm.timMin(5.9, 6.6));

		System.out.println("Tính tổng của 5 và 6: " + mm.tinhTong(5, 6));
		double arr[] = new double[] { 1, 2, 3, 4, 5 };
		System.out.println("Tính tổng của mảng: " + mm.tinhTong(arr));
	}
}
