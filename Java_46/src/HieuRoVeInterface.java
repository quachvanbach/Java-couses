
public class HieuRoVeInterface {
	public static void main(String[] args) {
		System.out.println("Test MayTinhCasioFx500 & MayTinhVinaCal500: ");
		MayTinhCasioFx500 mfx500 = new MayTinhCasioFx500();
		MayTinhVinaCal500 mvn500 = new MayTinhVinaCal500();

		System.out.println("5 + 5 = " + mfx500.cong(5, 5));
		System.out.println("5 * 2 = " + mvn500.nhan(5, 2));
		System.out.println("5 / 0 = " + mfx500.chia(5, 0));

		System.out.println("Test SapXepChen & SapXepChon: ");
		double[] arr1 = new double[] { 5, 1, 3, 4, 5, 8, 0 };
		double[] arr2 = new double[] { 6, 2, 7, 9, 2, 4, 5 };
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		System.out.println("---------------------------------");

		sxchen.sapXepTang(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		System.out.println("");
		sxchon.sapXepGiam(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("");
		System.out.println("---------------------------------");

		System.out.println("Test PhanMemMayTinh: ");
		PhanMemMayTinh mayTinh = new PhanMemMayTinh();
		System.out.println("9 + 10 = " + mayTinh.cong(9, 10));
		double[] arr3 = new double[] { 1, 5, 7, 4, 5, 7, 8, 4, 21, 1 };
		mayTinh.sapXepTang(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i] + "");
		}
	}
}
