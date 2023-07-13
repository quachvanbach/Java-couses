package main;

import javax.swing.UIManager;
import view.MyNotepadView;

public class OpenAndSaveTextFile {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyNotepadView();
		} catch (Exception e) {
			
		}
	}
}
