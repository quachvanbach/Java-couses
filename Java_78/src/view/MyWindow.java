package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame {

	public MyWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void showIt() {
		this.setVisible(true);
	}

	public void showIt(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}

	public void showIt(String title, int width, int heiht) {
		this.setTitle(title);
		this.setSize(width, heiht);
		this.setVisible(true);
	}

	public void showIt(String title, int width, int heiht, int toadoX, int toadoY) {
		this.setTitle(title);
		this.setSize(width, heiht);
		this.setLocation(toadoX, toadoY);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		
		MyWindow m1 = new MyWindow();
		m1.showIt("Window 1");

		MyWindow m2 = new MyWindow();
		m2.showIt("Window 2", 600, 400);

		MyWindow m3 = new MyWindow();
		m1.showIt("Window 3", 600, 400, 600,300);
	}
}
