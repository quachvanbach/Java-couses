
public class XeOTo extends PhuongTienDiChuyen {
	private String loaiNhienLieu;


	public XeOTo(HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super("Xe Oto", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		// TODO Auto-generated method stub
		return 80;
	}
	
	
}
