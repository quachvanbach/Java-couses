

public class HocSinh implements Comparable<HocSinh> {
	private int maHS;
	private String hoVaTen;
	private String tenLop;
	private double diemTB;

	public int getMaHS() {
		return maHS;
	}

	public void setMaHS(int maHS) {
		this.maHS = maHS;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}

	public HocSinh(int maHS, String hoVaTen, String tenLop, double diemTB) {
		super();
		this.maHS = maHS;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTB = diemTB;
	}

	public String getTen() {	
		String s = this.hoVaTen.trim();
		if (s.indexOf(" ") >= 0) {
			int viTri = s.lastIndexOf(" ");
			return s.substring(viTri+1);
		} else {
			return s;
		}
	}

	@Override
	public int compareTo(HocSinh o) {
		// So sánh mã Học sinh
//		return this.maHS - o.maHS;

		// So sánh bằng tên học sinh.
		String tenThis = this.getTen();
		String tenO = o.getTen();
		
		return tenThis.compareTo(tenO);
	}

	@Override
	public String toString() {
		return "HocSinh [maHS=" + maHS + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", diemTB=" + diemTB + "]";
	}
	
	
	

}
