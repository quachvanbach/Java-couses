
public abstract class PhuongTienDiChuyen {
	protected String tenLoaiPhuongTien;
	protected HangSanXuat hangSanXuat;



	public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
		super();
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}

	public String getTenLoaiPhuongTien() {
		return tenLoaiPhuongTien;
	}

	public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	}
	
	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}

	public void batDau() {
		System.out.println("Bat dau...");
	}
	
	public void tangToc() {
		System.out.println("Tang toc...");
	}	
	public void dungLai() {
		System.out.println("Dung Lai...");
	}
	
	public abstract double layVanToc();
}
