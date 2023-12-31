import java.io.File;
import java.io.IOException;

public class TaoTapTinVaThuMuc {
	public static void main(String[] args) {

		File folder1 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_67");

		// Kiểm tra sự tồn tai của file, folder:
		System.out.println("Kiem tra su ton tai cua folder1: " + folder1.exists());

		// Tao thu muc:
		// Phương thức mkdir: => Tạo 1 thư mục
		File makedir = new File("C:\\Users\\quach\\eclipse-workspace\\Java_67\\NewFolder");
		makedir.mkdir();

		// Phương thức mkdirs => Tạo nhiều thư mục cùng lúc
		File makedirs = new File(
				"C:\\Users\\quach\\eclipse-workspace\\Java_67\\NewFolder1\\NewFolder2\\NewFolder3\\NewFolder4");
		makedirs.mkdirs();

		// Tạo tập tin:
		File createFile = new File("C:\\Users\\quach\\eclipse-workspace\\Java_67\\NewFolder\\Vidu.txt");
		try {
			if (createFile.exists()) {
				System.out.println("Không thể tạo File. \nFile Vidu.txt đã tồn tại!");
			} else {
				createFile.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
