package view;

import javax.swing.UIManager;

public class JPanelVaLookAndFeel {
	public static void main(String[] args) {
		try {
			// Thiết lập giao diện look and feel mặc định phù hợp với hệ điều hành:
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		new MyCalculator();
	}
}
