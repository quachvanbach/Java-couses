package code;

public class Sub_Infor extends Infor {
	public void method() {

//		super.a; Không thể truy xuất được.
//		super.b; => Truy cập được vì cùng chung 1 package. 
		super.c = 3;
		super.d = 4;
	}
}
