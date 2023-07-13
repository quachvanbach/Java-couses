package model;

import java.util.StringTokenizer;

public class ThucDonModel {
	private String luaChon_monChinh;
	private String luaChon_monPhu;
	private double tongTien;

	public ThucDonModel() {

		this.luaChon_monPhu = "";
		this.tongTien = 0;
	}

	public String getLuaChon_monChinh() {
		return luaChon_monChinh;
	}

	public void setLuaChon_monChinh(String luaChon_monChinh) {
		this.luaChon_monChinh = luaChon_monChinh;
	}

	public String getLuaChon_monPhu() {
		return luaChon_monPhu;
	}

	public void setLuaChon_monPhu(String luaChon_monPhu) {
		this.luaChon_monPhu = luaChon_monPhu;
	}

	public double getTongTien() {
		return tongTien;
	}

	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}



	public void tinhTongTien() {
		this.tongTien = 0;
		if (this.luaChon_monChinh.equals("Cơm")) {
			tongTien += 30000;
		} else if (this.luaChon_monChinh.equals("Phở")) {
			tongTien += 40000;
		} else if (this.luaChon_monChinh.equals("Bánh mì")) {
			tongTien += 15000;
		}

		StringTokenizer stk = new StringTokenizer(this.luaChon_monPhu, ";");
		while (stk.hasMoreElements()) {
			String monPhu = stk.nextToken();
			monPhu = monPhu.trim();
			if (monPhu.equals("Trà sữa")) {
				tongTien += 50000;
			} else if (monPhu.equals("Cocacola")) {
				tongTien += 12000;
			} else if (monPhu.equals("Bánh ngọt")) {
				tongTien += 15000;
			} else if (monPhu.equals("Nem")) {
				tongTien += 20000;
			}
		}
	}

}
