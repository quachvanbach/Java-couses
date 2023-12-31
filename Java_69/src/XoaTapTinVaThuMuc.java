import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class XoaTapTinVaThuMuc {

	public static void xoaFile(File fx) {
		if (fx.isFile()) {
			System.out.println("Da xoa " + fx.getAbsolutePath());
			fx.delete();
		} else if (fx.isDirectory()) {
			File[] mangCon = fx.listFiles();
			for (File file : mangCon) {

				xoaFile(file);
			}
			System.out.println("Da xoa " + fx.getAbsolutePath());
			fx.delete();
		}
	}

	public static void main(String[] args) {

//		Xoá tập tin, thư mục sử dụng class File
		File fd0 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_69\\F0");
		File fd0_1 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_69\\F0_1");
		File f0 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_69\\abc.txt");
		File fd00 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_69\\P0");
		File fd00_1 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_69\\P0_1");
		File f00 = new File("C:\\Users\\quach\\eclipse-workspace\\Java_69\\P0_2.txt");

//		Hàm delete()
		fd0.delete(); // => Không xoá được.
		fd0_1.delete();

//		Hàm deleteOnExit()
		f0.deleteOnExit(); // => Không xoá được
		fd0.deleteOnExit();

//		Xoá thư mục có các tập tin, thư mục con:
		XoaTapTinVaThuMuc.xoaFile(fd0);

//		Xoá tập tin, thư mục sử dụng class Files
		Path p0 = fd00.toPath();
		Path p0_1 = fd00_1.toPath();
		Path p0_2 = f00.toPath();

		try {
//			Files.deleteIfExists(p0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p0_2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
