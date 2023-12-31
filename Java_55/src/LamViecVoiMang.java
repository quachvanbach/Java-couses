import java.lang.reflect.Array;
import java.util.Arrays;

public class LamViecVoiMang {

	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}

	public static void main(String[] args) {
		int[] soNguyen_1 = new int[] { 1, 2, 3, 9, 8, 7, 6 };
		int[] soNguyen_2 = new int[15];

		System.out.println("a khoi tao: " + Arrays.toString(soNguyen_1));

		// Hàm sort: Sắp xếp tăng dần:
		Arrays.sort(soNguyen_1);
		System.out.println("a sau khi duoc sap xep: " + Arrays.toString(soNguyen_1));

		// Hàm binarySearch: hàm tìm kiếm:
		System.out.println(Arrays.binarySearch(soNguyen_1, 8));
		System.out.println(Arrays.binarySearch(soNguyen_2, 8));

		// Hàm điền giá trị:

		Arrays.fill(soNguyen_2, 5);
		System.out.println("Mang soNguyen_2 sau khi duoc dien gia tri: " + Arrays.toString(soNguyen_2));

		// Hàm sắp xếp giảm dần:
		Arrays.sort(soNguyen_1);
		soNguyen_1 = LamViecVoiMang.reverse(soNguyen_1);
		System.out.println("a sau khi duoc sap xep: " + Arrays.toString(soNguyen_1));

		HocSinh hs1 = new HocSinh(101, "Nguyen Van Anh", "1A", 9);
		HocSinh hs2 = new HocSinh(100, "Tran Van An", "1A", 5);
		HocSinh hs3 = new HocSinh(101, "Mac Van Anh", "1A", 9);
		HocSinh hs4 = new HocSinh(102, "Hoang Van Binh", "1A", 10);

		HocSinh[] hocSinh = new HocSinh[] { hs1, hs2, hs3 };
		System.out.println("Hoc Sinh khoi tao: " + Arrays.toString(hocSinh));
		// Hàm sắp xếp:
		Arrays.sort(hocSinh);
		System.out.println("Hoc Sinh sau khi duoc sap xep: " + Arrays.toString(hocSinh));

		// Tìm kiếm:
		System.out.println("Tim kiem An: " + Arrays.binarySearch(hocSinh, hs1));
		System.out.println("Tim kiem Binh: " + Arrays.binarySearch(hocSinh, hs4));
	}
}
