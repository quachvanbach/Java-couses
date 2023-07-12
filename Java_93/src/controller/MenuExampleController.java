package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

import view.MenuExampleView;

public class MenuExampleController implements ActionListener {
	private MenuExampleView menuExampleView;

	public MenuExampleController(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();

		if (button.equals("Exit")) {
			System.exit(0);
		} else if (button.equals("Toolbar")) {
			AbstractButton checkBox = (AbstractButton) e.getSource();
			boolean check = checkBox.getModel().isSelected();
			if (check) {
				this.menuExampleView.enableToolbar();
			} else {
				this.menuExampleView.disableToolbar();
			}
		} else {
			this.menuExampleView.setTextJLabel("Bạn đã click vào: " + button + " Item");
		}
	}

}
