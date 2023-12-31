package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoCucBorderLayout extends JFrame {
	public BoCucBorderLayout() {
		this.setTitle("Bố cục BorderLayout");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null); // => Căn cửa sổ ở giữa màn hình.

		// Set Layout
		BorderLayout borderLayout_1 = new BorderLayout();
		BorderLayout borderLayout_2 = new BorderLayout(15, 15);

		this.setLayout(borderLayout_2);

		JButton jButton_1 = new JButton("Button 1");
		JButton jButton_2 = new JButton("Button 2");
		JButton jButton_3 = new JButton("Button 3");
		JButton jButton_4 = new JButton("Button 4");
		JButton jButton_5 = new JButton("Button 3");

		this.add(jButton_1, BorderLayout.NORTH);
		this.add(jButton_2, BorderLayout.EAST);
		this.add(jButton_3, BorderLayout.SOUTH);
		this.add(jButton_4, BorderLayout.WEST);
		this.add(jButton_5, BorderLayout.CENTER);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
