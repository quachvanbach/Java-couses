package test;

import code_1.ViDu;
// import code_2.ViDu;  => Không thể import 2 package có class bên trong cùng thên.

public class TestViDu {
	public static void main(String[] args) {
		ViDu vd1 = new ViDu(1, 2);
		System.out.println(vd1.getA());
		
		code_2.ViDu vd2 = new code_2.ViDu(3, 4, 5); // Gọi trực tiếp qua package.
		System.out.println(vd2.getC());
	}
}
