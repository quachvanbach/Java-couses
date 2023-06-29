
public class QuanLyPhuongTienDiChuyen {
	public static void main(String[] args) {
		HangSanXuat hsx1 = new HangSanXuat("Hang 1", "Hoa Ky");
		HangSanXuat hsx2 = new HangSanXuat("Hang 2", "Nhat Ban");
		HangSanXuat hsx3 = new HangSanXuat("Hang 3", "VietNam");
		
		PhuongTienDiChuyen pt1 = new MayBay(hsx1, "Xang dau");		
		PhuongTienDiChuyen pt2 = new XeOTo(hsx2, "Xang dau");		
		PhuongTienDiChuyen pt3 = new XeDap(hsx3);
		
		
		System.out.println("Lay ten hang san xuat: " + pt1.layTenHangSanXuat());
		System.out.println("Bat dau: ");
		pt2.batDau();
		
		System.out.println("Lay van toc: ");
		System.out.println("pt1: "+ pt1.layVanToc());
		System.out.println("pt2: "+ pt2.layVanToc());
		System.out.println("pt3: "+ pt3.layVanToc());
		
		System.out.println("Cat canh: ");
//		pt1.catCanh(); 
	}
}
