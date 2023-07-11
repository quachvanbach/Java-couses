package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.MenuExampleController;

public class MenuExampleView extends JFrame {

	private JLabel jLabel;

	public MenuExampleView() {
		this.setTitle("Menubar Example");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		MenuExampleController menuExampleCtroller = new MenuExampleController(this);

		JMenuBar jMenuBar = new JMenuBar();
		JMenu jMenu_1 = new JMenu("Menu 1");
		JMenuItem jMenuItem_1 = new JMenuItem("Menu Item 1");
		JMenuItem jMenuItem_2 = new JMenuItem("Menu Item 2");
		JMenuItem jMenuItem_3 = new JMenuItem("Menu Item 3");
		jMenu_1.add(jMenuItem_1);
		jMenu_1.addSeparator();
		jMenu_1.add(jMenuItem_2);
		jMenu_1.addSeparator();
		jMenu_1.add(jMenuItem_3);
		jMenuItem_1.addActionListener(menuExampleCtroller);
		jMenuItem_2.addActionListener(menuExampleCtroller);
		jMenuItem_3.addActionListener(menuExampleCtroller);

		JMenu jMenu_2 = new JMenu("Menu 2");
		JMenuItem jMenuItem_4 = new JMenuItem("Menu Item 4");
		JMenuItem jMenuItem_5 = new JMenuItem("Menu Item 5");
		JMenuItem jMenuItem_6 = new JMenuItem("Menu Item 6");
		jMenu_2.add(jMenuItem_4);
		jMenu_2.addSeparator();
		jMenu_2.add(jMenuItem_5);
		jMenu_2.addSeparator();
		jMenu_2.add(jMenuItem_6);
		jMenuItem_4.addActionListener(menuExampleCtroller);
		jMenuItem_5.addActionListener(menuExampleCtroller);
		jMenuItem_6.addActionListener(menuExampleCtroller);

		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(menuExampleCtroller);
		JMenu JMenu_exit = new JMenu("Application");
		JMenu_exit.add(jMenuItem_exit);

		jMenuBar.add(jMenu_1);
		jMenuBar.add(jMenu_2);
		jMenuBar.add(JMenu_exit);

		Font font = new Font("Arial", Font.BOLD, 30);

		jLabel = new JLabel();
		jLabel.setFont(font);

		this.setJMenuBar(jMenuBar);
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}

}
