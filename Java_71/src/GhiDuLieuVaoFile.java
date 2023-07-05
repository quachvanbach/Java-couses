import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GhiDuLieuVaoFile {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("C:\\Users\\quach\\eclipse-workspace\\Java_71\\File.txt", "UTF-8");
			pw.println("Đây là cách để ghi dữ liệu vào File!");
			pw.print("Data: ");
			pw.print(3.14);
			pw.print(" là số PI");
			pw.println();

			Student st = new Student(001, "Nguyen Van A");
			pw.println(st);

			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
