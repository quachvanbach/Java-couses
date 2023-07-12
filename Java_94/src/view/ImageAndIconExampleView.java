package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageAndIconExampleView extends JFrame {
	JMenu menu, subMenu;
	JMenuItem i1, i2, i3, i4, i5;
	JMenuBar jMenuBar = new JMenuBar();
	private JButton jButton;
	private JLabel jLabel;

	public ImageAndIconExampleView() {
		setTitle("Add image and icon for app");
		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Font font = new Font("Arial", Font.BOLD, 40);

		// Set Icon => JFrame
		URL urlIconNotepad = ImageAndIconExampleView.class.getResource("title_notepad.png");
		Image img = Toolkit.getDefaultToolkit().createImage(urlIconNotepad);
		this.setIconImage(img);

		// JMenuBar
		menu = new JMenu("Menu");
		subMenu = new JMenu("Sub Menu");
		i1 = new JMenuItem("New");
		i1.setIcon(new ImageIcon(ImageAndIconExampleView.class.getResource("menu_new.png")));
		i2 = new JMenuItem("Open");
		i2.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(ImageAndIconExampleView.class.getResource("menu_open.png"))));
		i3 = new JMenuItem("Save");
		i3.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(ImageAndIconExampleView.class.getResource("menu_save.png"))));
		i4 = new JMenuItem("Save As...");
		i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit()
				.createImage(ImageAndIconExampleView.class.getResource("menu_save_as.png"))));
		i5 = new JMenuItem("Exit");
		i5.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(ImageAndIconExampleView.class.getResource("menu_exit.png"))));

		menu.add(i1);
		menu.addSeparator();
		menu.add(i2);
		menu.addSeparator();
		menu.add(subMenu);
		menu.addSeparator();
		subMenu.add(i3);
		subMenu.addSeparator();
		subMenu.add(i4);
		menu.add(i5);
		jMenuBar.add(menu);

		jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(ImageAndIconExampleView.class.getResource("main.png"))));

		jButton = new JButton("Test Button");
		jButton.setFont(font);
		jButton.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(ImageAndIconExampleView.class.getResource("point.png"))));

		this.setJMenuBar(jMenuBar);
		this.add(jLabel, BorderLayout.CENTER);
		this.add(jButton, BorderLayout.SOUTH);

		this.setVisible(true);
	}
}
