package test;

import code.Infor;

public class Sub_Infor extends Infor {
	public void method() {
//		super.b; => Không thể truy xuất được.
		super.c = 3; // => khác gói nhưng vì là subclass nên vẫn sử dụng được.
		super.d = 4;
	}
}
