package main;

import java.awt.Dialog;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.MenuExampleView;

public class XuLySuKienMenuBar {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MenuExampleView();
		} catch (Exception e) {
			System.out.println("Failded: " + e);
		}

	}
}
