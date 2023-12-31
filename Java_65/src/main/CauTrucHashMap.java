package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CauTrucHashMap {
	private Map<String, String> duLieu = new HashMap<String, String>();

	public String themTu(String tuKhoa, String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);
	}

	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}

	public String traTu(String tuKhoa) {
		String yNghia = this.duLieu.get(tuKhoa);
		return yNghia;
	}

	public void inTuKhoa() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}

	public int laySoLuong() {
		return this.duLieu.size();
	}

	public void xoaTatCa() {
		this.duLieu.clear();
	}

	public static void main(String[] args) {
		CauTrucTreeMap tuDien = new CauTrucTreeMap();
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		try {

			do {
				System.out.println("------------------");
				System.out.println("     *MENU");
				System.out.println(
						"1. Them tu (Tu khoa : Y nghia\n" + "2. Xoa tu\n" + "3. Tra tu\n" + "4. In ra danh sach tu\n"
								+ "5. So luong tu\n" + "6. Xoa tat ca cac tu\n" + "" + "0. Thoat chuong trinh");
				luaChon = sc.nextInt();
				sc.nextLine();

				if (luaChon == 1) {
					System.out.println("Nhap vao tu khoa: ");
					String tuKhoa = sc.nextLine();
					System.out.println("Nhap vao y nghia: ");
					String yNghia = sc.nextLine();
					tuDien.themTu(tuKhoa, yNghia);
				} else if (luaChon == 2 || luaChon == 3) {

					System.out.println("Nhap vao tu khoa: ");
					String tuKhoa = sc.nextLine();
					if (luaChon == 2) {
						tuDien.xoaTu(tuKhoa);
					} else {
						System.out.println("Ý nghia la: " + tuDien.traTu(tuKhoa));
					}
				} else if (luaChon == 4) {
					tuDien.inTuKhoa();
				} else if (luaChon == 5) {
					System.out.println("So luong tu khoa la: " + tuDien.laySoLuong());
				} else if (luaChon == 6) {
					tuDien.xoaTatCa();
				}

			} while (luaChon != 0);
		} catch (Exception e) {
			System.out.println("Xảy ra lỗi! \n" + e + " \nMời nhập lại!");
			main(args);

		}
	}
}
