package main;

import javax.swing.UIManager;

import view.ViDu;

public class JavaSwingKeoTha {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			new ViDu();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
