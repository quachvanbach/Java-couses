package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoCucFlowLayout extends JFrame {
	public BoCucFlowLayout() {
		this.setTitle("Bố cục FlowLayout");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null); // => Căn cửa sổ ở giữa màn hình.

		// Set Layout
		FlowLayout flowLayout_1 = new FlowLayout();
		FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.LEFT);
		FlowLayout flowLayout_3 = new FlowLayout(FlowLayout.CENTER,10,10);
		FlowLayout flowLayout_4 = new FlowLayout(FlowLayout.RIGHT);
		
		this.setLayout(flowLayout_3);

		JButton jButton_1 = new JButton("Button 1");
		JButton jButton_2 = new JButton("Button 2");
		JButton jButton_3 = new JButton("Button 3");

		this.add(jButton_1);
		this.add(jButton_2);
		this.add(jButton_3);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
