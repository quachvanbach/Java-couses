package view;

import javax.swing.JFrame;

public class GioiThieuVeJFRAME {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(600,400);
		jf.setTitle("Ví dụ về JFrame");
		jf.setLocation(600,300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
