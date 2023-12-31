package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class LapTrinhMiniGame {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 500000;
		Scanner sc = new Scanner(System.in);

//		Locale lc = new Locale("vi", "VN");
		Locale lc = new Locale("en", "us");
//		NumberFormat numf = NumberFormat.getInstance(lc);
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

		int luaChon = 0;
		do {
			System.out.println("------------ Mời bạn lựa chọn ------------");
			System.out.println("Chọn 1 để tiếp tục chơi");
			System.out.println("Chọn ký tự bất kỳ để thoát!");
			luaChon = sc.nextInt();

			if (luaChon == 1) {
				System.out.println("*** Bắt đầu chơi ***");

				// Đặt cược:
				System.out.println("***** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi)
						+ " bạn muốn cược bao nhiêu? ***");
				double datCuoc = 0;
				do {
					System.out
							.println("*****  Đặt cược ( 0 < số tiền cươc <= " + numf.format(taiKhoanNguoiChoi) + " )");
					datCuoc = sc.nextDouble();
				} while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

				// Lựa chọn tài xỉu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("*****  Chọn 1: Tài hoặc Chọn 2: Xỉu");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

				// Tung xúc xắc:
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();

				int giaTri1 = xucXac1.nextInt(5) + 1;
				int giaTri2 = xucXac2.nextInt(5) + 1;
				int giaTri3 = xucXac3.nextInt(5) + 1;
				int tong = giaTri1 + giaTri2 + giaTri3;

				// Tính toán kết quả:
				System.out.println("--- Kết quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3 + " ---");
				if (tong == 3 || tong == 18) {
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("*** Tổng là: " + tong + " => Nhà cái ăn, bạn đã thua");
					System.out.println("*** Tài khoản bạn còn: " + numf.format(taiKhoanNguoiChoi));
				} else if (tong >= 4 && tong <= 10) {

					System.out.println("*** Tổng là: " + tong + " => Xỉu");
					if (luaChonTaiXiu == 2) {
						System.out.println(" *** Bạn đã thắng cược!");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("*** Tài khoản bạn còn: " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("*** Bạn đã thua cược!");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("*** Tài khoản bạn còn: " + numf.format(taiKhoanNguoiChoi));
					}
				} else {

					System.out.println("*** Tổng là: " + tong + " => Tài");
					if (luaChonTaiXiu == 1) {
						System.out.println(" *** Bạn đã thắng cược!");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("*** Tài khoản bạn còn: " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println(" *** Bạn đã thua cược!");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("*** Tài khoản bạn còn: " + numf.format(taiKhoanNguoiChoi));
					}
				}

			}
		} while (luaChon == 1);
	}
}
