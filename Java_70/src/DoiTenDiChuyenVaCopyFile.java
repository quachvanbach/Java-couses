import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class DoiTenDiChuyenVaCopyFile {
	public static void copyAll(File f1, File f2) {
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}

		if (f1.isDirectory()) {
			File[] mangCon = f1.listFiles();
			for (File file : mangCon) {
				File file_new = new File(f2.getAbsoluteFile() + "\\" + file.getName());
				copyAll(file, file_new);
			}
		}
	}

	public static void main(String[] args) {

		File f1 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_70\\File_1.txt");
		File f2 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_70\\File_2.txt");
		File f3 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_70\\File_3.txt");

		// Đổi tên file dùng lớp File:
		f1.renameTo(f2);

		// Đổi tên file dùng lớp Files:
		try {
			Files.move(f2.toPath(), f3.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}

		// Di chuyển File:

		File fd0 = new File("C:\\\\Users\\\\quach\\\\eclipse-workspace\\\\Java_70\\F0\\File_3.txt");
		try {
			Files.move(f3.toPath(), fd0.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}

		// Copy File: Hàm copy chỉ có thể copy được bản thân tập tin, thư mục được trỏ đến.
		File f4 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_70\\F4");
		File f5 = new File("C:\\\\Users\\\\quach\\\\eclipse-workspace\\\\Java_70\\\\F4_copy");
//		try {
//			Files.copy(f4.toPath(), f5.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			System.out.println("Lỗi: " + e);
//		}
		
		DoiTenDiChuyenVaCopyFile.copyAll(f4, f5);
		

	}
	
}
