import java.nio.file.attribute.AclEntry;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class DateTimeTrongJava {
	public static void main(String[] args) {

		// Hàm lấy thời gian hiện tại
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Trước khi chạy for: " + t1);
		System.out.println("Sau khi chạy for: " + t2);
		System.out.println("Thời gian chạy for: " + (t2 - t1));

		// Chuyển đổi thời gian
		System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000 * 365));
		System.out.println("25 giờ = " + TimeUnit.HOURS.toSeconds(25) + "s");

		// Date
		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));

		// Calendar
		Calendar c = Calendar.getInstance();
		System.out.println("Ngày " + c.get(Calendar.DATE) + " tháng " + (c.get(Calendar.MONTH) + 1) + " năm "
				+ c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, 2);
		System.out.println("Ngày " + c.get(Calendar.DATE) + " tháng " + (c.get(Calendar.MONTH) + 1) + " năm "
				+ c.get(Calendar.YEAR));
		
		// Date format:
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		DateFormat df1 = new SimpleDateFormat("HH:mm:ss, dd/mm/yyyy");
		System.out.println(df1.format(d));
	}
}
