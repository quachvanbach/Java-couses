import java.util.Scanner;

public class QuanLySinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
		int luaChon = 0;
		do {
			System.out.println("   ---------- MENU ----------");
			System.out.println("1. Thêm Sinh Viên vào danh sách.\n" + "2. In danh sách Sinh Viên ra màn hình.\n"
					+ "3. Kiểm tra danh sách có rỗng hay không?\n" + "4. Lấy ra số lượng Sinh viên trong danh sách.\n"
					+ "5. Làm rỗng danh sách Sinh viên.\n"
					+ "6. Kiểm tra Sinh viên có tồn tại trong danh sách hay không, dựa trên mã Sinh viên.\n"
					+ "7. Xoá 1 Sinh viên ra khỏi danh sách dựa trên mã Sinh viên.\n"
					+ "8. Tìm kiếm tất cả các Sinh viên dưa trên tên được nhập từ bàn phím.\n"
					+ "9. Xuất ra danh sách Sinh viên có điểm từ cao đến thấp.\n" + "0. Thoát khỏi chương trình.");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1) {
				// Thêm Sinh viên vào danh sách
				System.out.println("Nhập mã Sinh Viên: ");
				String maSinhVien = sc.nextLine();
				System.out.println("Nhập họ và tên Sinh Viên: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Nhập năm sinh: ");
				int namSinh = sc.nextInt();
				System.out.println("Nhập điểm trung bình: ");
				float diemTrungBinh = sc.nextFloat();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				danhSachSinhVien.themSinhVien(sv);
			} else if (luaChon == 2) {
				// In danh sách Sinh viên ra màn hình.

				danhSachSinhVien.inDanhSachSinhVien();

			} else if (luaChon == 3) {
				// 3. Kiểm tra danh sách có rỗng hay không?
				System.out.println("Kiểm tra danh sách rỗng: " + danhSachSinhVien.kiemTraDanhSachRong());

			} else if (luaChon == 4) {
				// 4. Lấy ra số lượng Sinh viên trong danh sách.
				System.out.println("Số lượng Sinh viên: " + danhSachSinhVien.laySoLuongSinhVien());
			} else if (luaChon == 5) {
				// 5. Làm rỗng danh sách Sinh viên.
				danhSachSinhVien.lamRongDanhSach();
				System.out.println("Toàn bộ Sinh viên đã bị xoá khỏi danh sách");
			} else if (luaChon == 6) {
				// 6. Kiểm tra Sinh viên có tồn tại trong danh sách hay không, dựa trên mã Sinh
				// viên.
				System.out.println("Nhập mã Sinh Viên: ");
				String maSinhVien = sc.nextLine();
				SinhVien sinhVien = new SinhVien(maSinhVien);
				System.out
						.println("Kiểm tra sinh viên có trong danh sách: " + danhSachSinhVien.kiemTraTonTai(sinhVien));
			} else if (luaChon == 7) {
				// 7. Xoá 1 Sinh viên ra khỏi danh sách dựa trên mã Sinh viên.
				System.out.println("Nhập mã Sinh Viên: ");
				String maSinhVien = sc.nextLine();
				SinhVien sinhVien = new SinhVien(maSinhVien);
				danhSachSinhVien.xoaSinhVien(sinhVien);
				System.out.println("Đã xoá Sinh viên có mã Sinh viên là " + maSinhVien);
			} else if (luaChon == 8) {
				// 8. Tìm kiếm tất cả các Sinh viên dưa trên tên được nhập từ bàn phím.
				System.out.println("Nhập họ và tên Sinh Viên: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				danhSachSinhVien.timSinhVien(hoVaTen);
			} else if (luaChon == 9) {
				// 9. Xuất ra danh sách Sinh viên có điểm từ cao đến thấp.
				danhSachSinhVien.sapXepSinhVienGiamDanTheoDiem();
				danhSachSinhVien.inDanhSachSinhVien();
			}
		} while (luaChon != 0);

	}
}
