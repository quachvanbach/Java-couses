import vidu.HocSinh;

public class XayDungPhuongThucCompareTo {
	public static void main(String[] args) {
		HocSinh hs1 =new HocSinh(101, "Nguyen Van Anh", "1A", 9);
		HocSinh hs2 =new HocSinh(100, "Tran Van An", "1A", 5);
		HocSinh hs3 =new HocSinh(101, "Mac Van Anh", "1A", 9);
		HocSinh hs4 =new HocSinh(102, "Hoang Van Binh", "1A", 10);
		
		System.out.println(hs1.compareTo(hs2));
		System.out.println(hs1.compareTo(hs3));
		System.out.println(hs1.compareTo(hs4));
		
	}
}
