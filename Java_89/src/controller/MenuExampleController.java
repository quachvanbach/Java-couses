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

		if (button.equals("Menu Item 1")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Menu Item 1");
		} else if (button.equals("Menu Item 2")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Menu Item 2");
		} else if (button.equals("Menu Item 3")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Menu Item 3");
		} else if (button.equals("Menu Item 4")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Menu Item 4");
		} else if (button.equals("Menu Item 5")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Menu Item 5");
		} else if (button.equals("Menu Item 6")) {
			this.menuExampleView.setTextJLabel("Bạn đã click vào Menu Item 6");
		} else if (button.equals("Exit")) {
			System.exit(0);
		}
	}

}
