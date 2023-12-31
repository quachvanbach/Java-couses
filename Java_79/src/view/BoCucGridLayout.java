package view;

import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoCucGridLayout extends JFrame{
	public BoCucGridLayout() {
		this.setTitle("Bố cục GridLayout");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null); // => Căn cửa sổ ở giữa màn hình.

		// Set Layout
		GridLayout GridLayout_1 = new GridLayout();
		GridLayout GridLayout_2 = new GridLayout(4, 4);
		GridLayout GridLayout_3 = new GridLayout(4,4,25,25);
		
		this.setLayout(GridLayout_3);

//		JButton jButton_1 = new JButton("Button 1");
//		JButton jButton_2 = new JButton("Button 2");
//		JButton jButton_3 = new JButton("Button 3");
		
		for (int i = 1; i <= 16; i++) {
			JButton jButton = new JButton("Button "+i);
			this.add((jButton));
		}

//		this.add(jButton_1);
//		this.add(jButton_2);
//		this.add(jButton_3);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
