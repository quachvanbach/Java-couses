package main;

import javax.swing.UIManager;

import view.MenuExampleView;

public class CheckboxMenu {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MenuExampleView();
		} catch (Exception e) {
			System.out.println("Failded: " + e);
		}

	}
}
