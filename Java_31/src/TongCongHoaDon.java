
public class TongCongHoaDon {
	public static void main(String[] args) {
		HoaDonCaPhe trungNguyen = new HoaDonCaPhe("Trung Nguyen", 100, 1.5);
		HoaDonCaPhe g7 = new HoaDonCaPhe("G7", 200, 3);
		System.out.println("-------Cà phê Trung Nguyên-------");
		System.out.println("Tổng tiền: " + trungNguyen.tinhTongTien());
		System.out.println("Khối lượng này lớn hơn 2kg đúng hay sai? " + trungNguyen.kiemTraKhoiLuongLonHon(2));
		System.out.println("Khối lượng này lớn hơn 1kg đúng hay sai? " + trungNguyen.kiemTraKhoiLuongLonHon(1));
		System.out.println("Tổng tiền này lơn hơn 500 đúng hay sai? " + trungNguyen.kiemTraTongTienLonHon500K());
		System.out.println("Hoá đơn này được giảm giá " + trungNguyen.giamGia(10) + "đ");
		System.out.println("Giá sau khi giảm: "+ trungNguyen.giaSauKhiGiam(10) + "đ");
		
		System.out.println("-------Cà phê G7-------");
		System.out.println("Tổng tiền: " + g7.tinhTongTien());
		System.out.println("Khối lượng này lớn hơn 2kg đúng hay sai? " + g7.kiemTraKhoiLuongLonHon(2));
		System.out.println("Khối lượng này lớn hơn 1kg đúng hay sai? " + g7.kiemTraKhoiLuongLonHon(1));
		System.out.println("Tổng tiền này lơn hơn 500 đúng hay sai? " + g7.kiemTraTongTienLonHon500K());
		System.out.println("Hoá đơn này được giảm giá " + g7.giamGia(10) + "đ");
		System.out.println("Giá sau khi giảm: "+ g7.giaSauKhiGiam(10) + "đ");
	}
}
