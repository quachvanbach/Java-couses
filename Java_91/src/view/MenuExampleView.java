package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
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

		// Tạo Menubar và các phím tắt
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
		Font font_toolbar = new Font("Arial", Font.BOLD, 20);

		jLabel = new JLabel();
		jLabel.setFont(font);

		// Tạo Toolbar:

		JToolBar jToolBar = new JToolBar();

		JButton jButton_undo = new JButton("Undo");
		jButton_undo.setFont(font_toolbar);
		jButton_undo.setToolTipText("Khôi phục lại thao tác");
		jButton_undo.setMnemonic(KeyEvent.VK_Z);
		jButton_undo.addActionListener(menuExampleCtroller);
		JButton jButton_redo = new JButton("Redo");
		jButton_redo.setFont(font_toolbar);
		jButton_redo.addActionListener(menuExampleCtroller);
		JButton jButton_cut = new JButton("Cut");
		jButton_cut.setFont(font_toolbar);
		jButton_cut.addActionListener(menuExampleCtroller);
		JButton jButton_copy = new JButton("Copy");
		jButton_copy.setFont(font_toolbar);
		jButton_copy.addActionListener(menuExampleCtroller);
		JButton jButton_paste = new JButton("Paste");
		jButton_paste.setFont(font_toolbar);
		jButton_paste.addActionListener(menuExampleCtroller);

		jToolBar.add(jButton_undo);
		jToolBar.add(jButton_redo);
		jToolBar.add(jButton_cut);
		jToolBar.add(jButton_copy);
		jToolBar.add(jButton_paste);
		
		jToolBar.setOpaque(true);
		jToolBar.setBackground(Color.LIGHT_GRAY);

		this.setLayout(new BorderLayout());
		this.setJMenuBar(jMenuBar);
		this.add(jToolBar, BorderLayout.NORTH);
		this.add(jLabel, BorderLayout.CENTER);
		this.setVisible(true);
	}

	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}

}
