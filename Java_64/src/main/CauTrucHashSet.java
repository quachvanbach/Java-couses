package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CauTrucHashSet {
	public Set<String> thungPhieuDuThuong = new HashSet<String>();

	public CauTrucHashSet() {

	}

	public Set<String> getThungPhieuDuThuong() {
		return thungPhieuDuThuong;
	}

	public void setThungPhieuDuThuong(Set<String> thungPhieuDuThuong) {
		this.thungPhieuDuThuong = thungPhieuDuThuong;
	}

	public boolean themPhieu(String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
	}

	public boolean xoaPhieu(String giaTri) {
		return this.thungPhieuDuThuong.remove(giaTri);
	}

	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
	}

	public void xoaTatCaPhieuDuthuong() {
		this.thungPhieuDuThuong.clear();
	}

	public int laySoLuong() {
		return this.thungPhieuDuThuong.size();
	}

	public String rutMotPhieu() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
		ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}

	public void inTatCaPhieu() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CauTrucHashSet thungPhieu = new CauTrucHashSet();
		int luaChon = 0;
		do {
			System.out.println("------------------------------");
			System.out.println("         ** Menu **");
			System.out.println("1. Them ma so du thuong.");
			System.out.println("2. Xoa ma so du thuong.");
			System.out.println("3. Kiem tra ma so du thuong co ton tai hay khong.");
			System.out.println("4. Xoa tat ca cac phieu du thuong.");
			System.out.println("5. So luong phieu du thuong.");
			System.out.println("6. Rut tham trung thuong.");
			System.out.println("7. In ra tat ca cac phieu trong thung.");
			System.out.println("");
			luaChon = sc.nextInt();
			sc.nextLine();

			if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("Nhap vao Ma du thuong: ");
				String giaTri = sc.nextLine();
				if (luaChon == 1) {
					thungPhieu.themPhieu(giaTri);
				} else if (luaChon == 2) {
					thungPhieu.xoaPhieu(giaTri);
				} else {
					System.out.println("Ket qua kiem tra: " + thungPhieu.kiemTraPhieuTonTai(giaTri));
				}
			} else if (luaChon == 4) {
				thungPhieu.xoaTatCaPhieuDuthuong();
			} else if (luaChon == 5) {
				System.out.println("So luong phieu: " + thungPhieu.laySoLuong());
			} else if (luaChon == 6) {
				System.out.println("Ma so trung thuong la: " + thungPhieu.rutMotPhieu());
			} else if (luaChon == 7) {
				System.out.println("Tat ca cac phieu co trong thung: ");
				thungPhieu.inTatCaPhieu();
			}

		} while (luaChon != 0);
	}
}
