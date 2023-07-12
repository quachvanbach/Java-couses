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
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleController;
import controller.MenuExampleMouseListener;

public class MenuExampleView extends JFrame {

	private JLabel jLabel;
	public JPopupMenu jPopupMenu;

	public MenuExampleView() {
		this.setTitle("Menubar Example");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());

		MenuExampleController menuExampleController = new MenuExampleController(this);

		// Tạo Menubar và các phím tắt
		JMenuBar jMenuBar = new JMenuBar();
		JMenu jMenu_file = new JMenu("File");
		jMenu_file.setMnemonic(KeyEvent.VK_F);

		JMenuItem jjMenuItem_new = new JMenuItem("New");
		jjMenuItem_new.addActionListener(menuExampleController);
		jjMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_open = new JMenuItem("Open");
		jMenuItem_open.addActionListener(menuExampleController);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_save = new JMenuItem("Save");
		jMenuItem_save.addActionListener(menuExampleController);
		jMenuItem_save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(menuExampleController);
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
		jMenuItem_cut.addActionListener(menuExampleController);
		jMenuItem_cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_copy = new JMenuItem("Copy");
		jMenuItem_copy.addActionListener(menuExampleController);
		jMenuItem_copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_paste = new JMenuItem("Paste");
		jMenuItem_paste.addActionListener(menuExampleController);
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
		jButton_undo.addActionListener(menuExampleController);
		JButton jButton_redo = new JButton("Redo");
		jButton_redo.setFont(font_toolbar);
		jButton_redo.addActionListener(menuExampleController);
		JButton jButton_cut = new JButton("Cut");
		jButton_cut.setFont(font_toolbar);
		jButton_cut.addActionListener(menuExampleController);
		JButton jButton_copy = new JButton("Copy");
		jButton_copy.setFont(font_toolbar);
		jButton_copy.addActionListener(menuExampleController);
		JButton jButton_paste = new JButton("Paste");
		jButton_paste.setFont(font_toolbar);
		jButton_paste.addActionListener(menuExampleController);

		jToolBar.add(jButton_undo);
		jToolBar.add(jButton_redo);
		jToolBar.add(jButton_cut);
		jToolBar.add(jButton_copy);
		jToolBar.add(jButton_paste);

		jToolBar.setOpaque(true);
		jToolBar.setBackground(Color.LIGHT_GRAY);

		// Tạo Menu chuột phải:

		jPopupMenu = new JPopupMenu();

		JMenu jMenuPopupFont = new JMenu("Font");
		JMenuItem jMenuItem_type = new JMenuItem("Font-Type");
		jMenuItem_type.addActionListener(menuExampleController);
		JMenuItem jMenuItem_size = new JMenuItem("Font-Size");
		jMenuItem_size.addActionListener(menuExampleController);

		JMenuItem jMenuItem_find = new JMenuItem("Find");
		jMenuItem_find.addActionListener(menuExampleController);
		JMenuItem jMenuItem_replace = new JMenuItem("Replae");
		jMenuItem_replace.addActionListener(menuExampleController);
		JMenuItem jMenuItem_selectAll = new JMenuItem("Select All");
		jMenuItem_selectAll.addActionListener(menuExampleController);

		jMenuPopupFont.add(jMenuItem_type);
		jMenuPopupFont.add(jMenuItem_size);

		jPopupMenu.add(jMenuPopupFont);
		jPopupMenu.addSeparator();
		jPopupMenu.add(jMenuItem_find);
		jPopupMenu.add(jMenuItem_replace);
		jPopupMenu.add(jMenuItem_selectAll);
		MenuExampleMouseListener menuExampleMouseListener = new MenuExampleMouseListener(this);
		this.addMouseListener(menuExampleMouseListener);
		this.add(jPopupMenu);

		this.setJMenuBar(jMenuBar);
		this.add(jToolBar, BorderLayout.NORTH);
		this.add(jLabel, BorderLayout.CENTER);
		this.setVisible(true);
	}

	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}

}
