package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

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
		JMenu jMenu_file = new JMenu("File");
		jMenu_file.setMnemonic(KeyEvent.VK_F);

		JMenuItem jjMenuItem_new = new JMenuItem("New");
		jjMenuItem_new.addActionListener(menuExampleCtroller);
		jjMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_open = new JMenuItem("Open");
		jMenuItem_open.addActionListener(menuExampleCtroller);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_save = new JMenuItem("Save");
		jMenuItem_save.addActionListener(menuExampleCtroller);
		jMenuItem_save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(menuExampleCtroller);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));

		jMenu_file.add(jjMenuItem_new);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_save);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);

		JMenu jMenu_edit = new JMenu("Edit");
		jMenu_edit.setMnemonic(KeyEvent.VK_E);

		JMenuItem jMenuItem_cut = new JMenuItem("Cut");
		jMenuItem_cut.addActionListener(menuExampleCtroller);
		jMenuItem_cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_copy = new JMenuItem("Copy");
		jMenuItem_copy.addActionListener(menuExampleCtroller);
		jMenuItem_copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_paste = new JMenuItem("Paste");
		jMenuItem_paste.addActionListener(menuExampleCtroller);
		jMenuItem_paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));

		jMenu_edit.add(jMenuItem_cut);
		jMenu_edit.addSeparator();
		jMenu_edit.add(jMenuItem_copy);
		jMenu_edit.addSeparator();
		jMenu_edit.add(jMenuItem_paste);

		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_edit);

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
