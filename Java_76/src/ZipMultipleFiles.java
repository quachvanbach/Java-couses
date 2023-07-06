import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMultipleFiles {
	public static void main(String[] args) throws IOException {
		List<String> sourceFiles = Arrays.asList("C:\\Users\\quach\\eclipse-workspace\\Java_76\\File_1.txt", "C:\\Users\\quach\\eclipse-workspace\\Java_76\\File_2.txt", "C:\\Users\\quach\\eclipse-workspace\\Java_76\\File_3.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\quach\\eclipse-workspace\\Java_76\\MultiZip.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		
		for (String sourceFile : sourceFiles) {
			File fileToZip = new File(sourceFile);
			FileInputStream fis = new FileInputStream(fileToZip);
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			
			zipOut.putNextEntry(zipEntry);
			
			byte[] bytes = new byte[1024];
			int length;
			while ((length = fis.read(bytes)) >= 0) {
				zipOut.write(bytes, 0, length);
			}
			fis.close();
		}
		zipOut.close();
		fos.close();
	}
}
