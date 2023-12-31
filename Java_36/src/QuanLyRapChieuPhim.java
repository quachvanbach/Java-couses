
public class QuanLyRapChieuPhim {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 5, 2022);
		Ngay ngay2 = new Ngay(01, 2, 2019);
		Ngay ngay3 = new Ngay(27, 12, 2006);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hãng A", "Việt Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hãng B", "Mỹ");
		
		BoPhim boPhim1 = new BoPhim("Phim gì đó", 2023, hangSanXuat1, 75, ngay1);
		BoPhim boPhim2 = new BoPhim("Phim gì đấy", 2021, hangSanXuat2, 65, ngay2);
		BoPhim boPhim3 = new BoPhim("Phim gì cơ?", 2023, hangSanXuat1, 97, ngay3);

		System.out.println("Bộ phim 1 có giá vé rẻ hơn bộ phim thứ 2: " + boPhim1.kiemTraGiaVeReHon(boPhim2));
		System.out.println("Bộ phim 1 có giá vé rẻ hơn bộ phim thứ 3: " + boPhim1.kiemTraGiaVeReHon(boPhim3));
		
		System.out.println("Tên hãng sản xuất của bộ phim 3: " + boPhim3.layTenHangSanXuat());

		System.out.println("Giá vé phim 1 sau khi giảm 10% là: " + boPhim1.giaSauKhuyenMai(10));
		System.out.println("Giá vé phim 2 sau khi giảm 30% là: " + boPhim2.giaSauKhuyenMai(30));
		System.out.println("Giá vé phim 3 sau khi giảm 70% là: " + boPhim3.giaSauKhuyenMai(70));
	}
}
