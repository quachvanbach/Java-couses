package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.TimKiemView;

public class ThanhCuonScrollPane {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new TimKiemView();
	}
}
