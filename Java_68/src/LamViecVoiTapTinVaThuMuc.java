import java.io.File;
import java.util.Scanner;

public class LamViecVoiTapTinVaThuMuc {
	File file;

	/**
	 * @param tenFile
	 */
	public LamViecVoiTapTinVaThuMuc(String tenFile) {
		this.file = new File(tenFile);
	}

	public boolean kiemTraThucThi() {
		return this.file.canExecute();
	}

	public boolean kiemTraDoc() {
		return this.file.canRead();
	}

	public boolean kiemTraGhi() {
		return this.file.canWrite();
	}

	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}

	public void layTenFile() {
		System.out.println(this.file.getName());
	}

	public void kiemTraLaTapTinHayThuMuc() {
		if (this.file.isDirectory()) {
			System.out.println(this.file.getName() + ": là 1 thư mục.");
		} else if (this.file.isFile()) {
			System.out.println(this.file.getName() + ": là 1 tập tin.");
		}
	}

	public void inDanhSachCacFileCon() {
		if (this.file.isDirectory()) {
			System.out.println("Danh sách các tập tin/thư mục có trong thư mục:");
			File[] mangCon = this.file.listFiles();
			for (File file : mangCon) {
				System.out.println(file.getName());
			}
		} else if (this.file.isFile()) {
			System.out.println(this.file.getName() + ": là 1 tập tin. Không chứa được các file, folder con");
		}
	}

	public void inCayThuMuc() {
		this.inChiTietCayThuMuc(this.file, 1);
	}

	public void inChiTietCayThuMuc(File f, int bac) {
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|___");
		System.out.println(f.getName());
		File[] mangCon = f.listFiles();
		if (f.isDirectory()) {
			for (File fx : mangCon) {
				inChiTietCayThuMuc(fx, bac + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên file: ");
		String tenFile = sc.nextLine();
		LamViecVoiTapTinVaThuMuc filePath = new LamViecVoiTapTinVaThuMuc(tenFile);
		int luaChon = 0;
		do {
			System.out.println("========================");
			System.out.println("         Menu");
			System.out.println("1. Kiểm tra File có thể thực thi: ");
			System.out.println("2. Kiểm tra File có thể đọc: ");
			System.out.println("3. Kiểm tra File có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. Lấy tên File: ");
			System.out.println("6. Kiểm tra đường dẫn trỏ đến là thư mục hay là tập tin: ");
			System.out.println("7. In ra danh sách các folder, file con: ");
			System.out.println("8. In ra cây thư mục: ");
			System.out.println("0. Thoát chuong trình.");
			luaChon = sc.nextInt();

			switch (luaChon) {
			case 1:
				System.out.println(" Kiểm tra File có thể thực thi: " + filePath.kiemTraThucThi());
				break;
			case 2:
				System.out.println(" Kiểm tra File có thể đọc: " + filePath.kiemTraDoc());
				break;
			case 3:
				System.out.println(" Kiểm tra File có thể ghi: : " + filePath.kiemTraGhi());
				break;
			case 4:
				filePath.inDuongDan();
				break;
			case 5:
				filePath.layTenFile();
				break;
			case 6:
				filePath.kiemTraLaTapTinHayThuMuc();
				break;
			case 7:
				filePath.inDanhSachCacFileCon();
				break;
			case 8:
				filePath.inCayThuMuc();
				break;
			default:
				break;
			}
		} while (luaChon != 0);
	}
}
