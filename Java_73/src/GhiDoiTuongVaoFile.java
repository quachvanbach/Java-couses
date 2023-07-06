import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class GhiDoiTuongVaoFile {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\quach\\eclipse-workspace\\Java_73\\SinhVien.data.txt");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);

			SinhVien st = new SinhVien("001", "Nguyen Van A", 2001, 9.5f);
			oos.writeObject(st);

			oos.flush();
			oos.close();

		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}
	}
}
