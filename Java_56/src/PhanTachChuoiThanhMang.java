import java.util.Arrays;

public class PhanTachChuoiThanhMang {
	public static void main(String[] args) {
		String s = "Day la ngon ngu lap trinh Java, Chao mung den voi ngon ngu lap trinh Java.";
	
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String[] b =s.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2 = "Xin chao, minh la Peter. Minh la Lap trinh vien";
		
		String[] c = s2.split("\\.|\\,");
		System.out.println(Arrays.toString(c));
		
		String s3 = "Nguyen Van A";
		
		String[] d = s3.split(" ");
		System.out.println(Arrays.toString(d));
		System.out.println("Ten: "+ d[d.length-1]);
		
		
	}
}
