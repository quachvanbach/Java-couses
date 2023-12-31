
public class PhuongThucEqualsVaHascode {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(20, 10, 2023);
		MyDate md2 = new MyDate(12, 3, 1995);
		MyDate md3 = new MyDate(20, 10, 2023);

		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);

		System.out.println("md1 bằng md2: " + md1.equals(md2));
		System.out.println("md1 bằng md3: " + md1.equals(md3));

		System.out.println("Hashcode md1: " + md1.hashCode());
		System.out.println("Hashcode md2: " + md2.hashCode());
		System.out.println("Hashcode md3: " + md3.hashCode());
	}
}
