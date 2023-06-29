
public class QuanLySinhVien {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(12, 5, 1995);
		Ngay ngay2 = new Ngay(28, 9, 1996);
		Ngay ngay3 = new Ngay(07, 10, 1994);
		Ngay ngay4 = new Ngay(21, 9, 1996);
		Ngay ngay5 = new Ngay(07, 10, 1994);

		Lop lop1 = new Lop("LH01", "Khoa học máy tính");
		Lop lop2 = new Lop("LH02", "Công nghệ thông tin");
		Lop lop3 = new Lop("LH03", "Khoa an ninh mạng");
		Lop lop4 = new Lop("LH04", "Kế toán");
		Lop lop5 = new Lop("LH05", "Máy tính văn phòng");

		SinhVien sinhVien1 = new SinhVien("001", "Quách Văn Bách", ngay1, 9.5, lop1);
		SinhVien sinhVien2 = new SinhVien("002", "Hù Thị Huế", ngay2, 4.9, lop2);
		SinhVien sinhVien3 = new SinhVien("003", "Nguyễn Văn A", ngay3, 7.5, lop3);
		SinhVien sinhVien4 = new SinhVien("004", "Trần Thị B", ngay4, 6, lop4);
		SinhVien sinhVien5 = new SinhVien("005", "Mạc Văn C", ngay5, 9, lop5);

		System.out.println("Tên khoa: ");
		System.out.println("Sinh viên 1: " + sinhVien1.layTenKhoa());
		System.out.println("Sinh viên 2: " + sinhVien2.layTenKhoa());
		System.out.println("Sinh viên 3: " + sinhVien3.layTenKhoa());
		System.out.println("Sinh viên 4: " + sinhVien4.layTenKhoa());
		System.out.println("Sinh viên 5: " + sinhVien5.layTenKhoa());

		System.out.println("Kiểm tra thi đạt");
		System.out.println("Sinh viên 1: " + sinhVien1.kiemTraThiDat());
		System.out.println("Sinh viên 2: " + sinhVien2.kiemTraThiDat());
		System.out.println("Sinh viên 3: " + sinhVien3.kiemTraThiDat());
		System.out.println("Sinh viên 4: " + sinhVien4.kiemTraThiDat());
		System.out.println("Sinh viên 5: " + sinhVien5.kiemTraThiDat());

		System.out.println("Sinh viên 1 có cùng ngày sinh với sinh viên 2: "+ sinhVien1.kiemTraCungNgaySinh(sinhVien2));
		System.out.println("Sinh viên 2 có cùng ngày sinh với sinh viên 4: "+ sinhVien2.kiemTraCungNgaySinh(sinhVien4));
		System.out.println("Sinh viên 3 có cùng ngày sinh với sinh viên 5: "+ sinhVien3.kiemTraCungNgaySinh(sinhVien5));
	}
}
