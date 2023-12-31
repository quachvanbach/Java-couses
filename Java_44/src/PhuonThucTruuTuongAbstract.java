
public class PhuonThucTruuTuongAbstract {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(5, 5);
		ToaDo td2 = new ToaDo(10, 7);
		ToaDo td3 = new ToaDo(3, 9);

//		Hinh h = new Hinh(td1); => Hinh là lớp abstract nên không thể định nghĩa trực tiếp.

		Hinh h1 = new Diem(td1);

		Hinh h2 = new HinhTron(td2, 10);

		Hinh h3 = new HinhChuNhat(td3, 5, 10);

		System.out.println("Dien tich hinh 1: " + h1.tinhDienTich());
		System.out.println("Dien tich hinh 2: " + h2.tinhDienTich());
		System.out.println("Dien tich hinh 3: " + h3.tinhDienTich());
	}
}
