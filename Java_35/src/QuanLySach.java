
public class QuanLySach {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(12, 3, 1937);
		Ngay ngay2 = new Ngay(05, 9, 1945);
		Ngay ngay3 = new Ngay(26, 3, 1970);
		
		TacGia tacGia1 = new TacGia("Quach Bach", ngay1);
		TacGia tacGia2 = new TacGia("Bachqv", ngay2);
		TacGia tacGia3 = new TacGia("Quach Kaka", ngay3);
		
		Sach sach1 = new Sach("Java", 12800, 2021, tacGia1);
		Sach sach2 = new Sach("Python", 98000, 2016, tacGia2);
		Sach sach3 = new Sach("HTML", 210000, 2021, tacGia3);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		System.out.println("Sách 1 và sách 2 có cùng năm xuất bản: " + sach1.kiemTraCungNamXuatBan(sach2));
		System.out.println("Sách 1 và sách 2 có cùng năm xuất bản: " + sach1.kiemTraCungNamXuatBan(sach3));
		
		System.out.println("Sách 1 sau khi giảm 10% là: " + sach1.giaSauKhiGiam(10));
		System.out.println("Sách 2 sau khi giảm 20% là: " + sach2.giaSauKhiGiam(20));
		System.out.println("Sách 3 sau khi giảm 50% là: " + sach3.giaSauKhiGiam(50));
	}
}
