import java.util.Arrays;

public class MangVaCachCopyMang {
	public static void main(String[] args) {
		// Kiểu nguyên thuỷ:
		int[] mang1 = { 1, 2, 3 };

		// Copy mảng bằng toán tử gán:
		int[] mang1_a = mang1;
		mang1_a[0] = 100;
		System.out.println(Arrays.toString(mang1));
		System.out.println(Arrays.toString(mang1_a));

		// Copy mảng dùng hàm clone.
		int[] mang1_b = mang1.clone();
		mang1_b[0] = 50;
		System.out.println(Arrays.toString(mang1));
		System.out.println(Arrays.toString(mang1_b));

		// Copy mảng dùng System.araycopy.
		int[] mang1_c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
		mang1_c[0] = 30;
		System.out.println(Arrays.toString(mang1));
		System.out.println(Arrays.toString(mang1_c));
		
		// Kiểu đối tượng:
		String[] mybObject = {"Quách Đại Bách","Hào Xá, Hải Hưng", "Sđt: 0375235356"};
		System.out.println(Arrays.toString(mybObject));

		// Copy mảng bằng toán tử gán:
		String[] mybObject_a = mybObject;
		mybObject_a[0] = "Quách Văn Bách";
		System.out.println(Arrays.toString(mybObject));
		System.out.println(Arrays.toString(mybObject_a));

		// Copy mảng dùng hàm clone.
		String[] mybObject_b = mybObject.clone();
		mybObject_b[1] = "Thanh Xá, Thanh Hà, Hải Dương";
		System.out.println(Arrays.toString(mybObject));
		System.out.println(Arrays.toString(mybObject_b));

		// Copy mảng dùng System.araycopy.
		String[] mybObject_c = new String[mybObject.length];
		System.arraycopy(mybObject, 0, mybObject_c, 0, mybObject.length);
		mybObject_c[0] = "Sđt: 0971882842";
		System.out.println(Arrays.toString(mybObject));
		System.out.println(Arrays.toString(mybObject_c));
	}
}
