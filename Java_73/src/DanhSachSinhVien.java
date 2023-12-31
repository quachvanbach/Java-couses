import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	// 1. Thêm Sinh viên vào danh sách:
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}

	// 2. In danh sách Sinh viên ra màn hình:
	public void inDanhSachSinhVien() {
		int i = 1;
		for (SinhVien sinhVien : danhSach) {
			System.out.println("Sinh Viên " + i + sinhVien);
			i++;
		}
	}

	// 3. Kiểm tra danh sách có rỗng hay không?
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}

	// 4. Lấy ra số lượng Sinh viên trong danh sách.
	public int laySoLuongSinhVien() {
		return this.danhSach.size();
	}

	// 5. Làm rỗng danh sách Sinh viên
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

	// 6. Kiểm tra Sinh viên có tồn tại trong danh sách hay không, dựa trên mã Sinh
	// viên.
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}

	// 7. Xoá 1 Sinh viên ra khỏi danh sách dựa trên mã Sinh viên.
	public void xoaSinhVien(SinhVien sv) {
		this.danhSach.remove(sv);
	}

	// 8. Tìm kiếm tất cả các Sinh viên dưa trên tên được nhập từ bàn phím.
	public void timSinhVien(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}

	// 9. Xuất ra danh sách Sinh viên có điểm từ cao đến thấp.
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
					return 1;
				} else if (o1.getDiemTrungBinh() == o2.getDiemTrungBinh()) {
					return 0;
				} else {
					return -1;
				}
			}

		});
	}

	// 10. Ghi dữ liệu xuống File:
	public void ghiDuLieuXuongFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);

			for (SinhVien sinhVien : danhSach) {
				oos.writeObject(sinhVien);
			}

			oos.flush();
			oos.close();

		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}
	}


}
