package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {
	private MenuExampleView menuExampleView;

	public MenuExampleController(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();

		if (button.equals("New")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào New Item");
		} else if (button.equals("Open")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Open Item");
		} else if (button.equals("Save")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Save Item");
		} else if (button.equals("Cut")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Cut Item");
		} else if (button.equals("Copy")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Copy Item");
		} else if (button.equals("Paste")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Paste Item");
		} else if (button.equals("Exit")) {
			System.exit(0);
		}
	}

}
