
public class QuanLyMayTinh {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15,8,2020);
		Ngay ngay2 = new Ngay(15,8,2020);
		Ngay ngay3 = new Ngay(15,8,2020);
		
		QuocGia quocGia1 = new QuocGia("VN", "Việt Nam");
		QuocGia quocGia2 = new QuocGia("US", "Hoa Kỳ");
		QuocGia quocGia3 = new QuocGia("TW", "Đài Loan");
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("KingCom", quocGia1);
		HangSanXuat hangSanXuat2 = new HangSanXuat("Macbook", quocGia2);
		HangSanXuat hangSanXuat3 = new HangSanXuat("Lenovo", quocGia3);

		MayTinh mayTinh1 = new MayTinh(hangSanXuat1, ngay1, 200, 6);
		MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngay2, 500, 6);
		MayTinh mayTinh3 = new MayTinh(hangSanXuat3, ngay3, 350, 6);

		System.out.println("So sánh giá thấp hơn:");
		System.out.println("Máy tính 1 < Máy tính 2 " + mayTinh1.kiemTraGiaThapHon(mayTinh2));
		System.out.println("Máy tính 2 < Máy tính 3 " + mayTinh2.kiemTraGiaThapHon(mayTinh3));
		
		System.out.println("Lấy tên Quốc gia sản xuất: ");
		System.out.println("Máy tính 1: " + mayTinh1.layTenQuocGia());
		System.out.println("Máy tính 2: " + mayTinh2.layTenQuocGia());
		System.out.println("Máy tính 3: " + mayTinh3.layTenQuocGia());
	}
}
