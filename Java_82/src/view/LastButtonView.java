package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListerner;
import model.LastButtonModel;

public class LastButtonView extends JFrame {
	private LastButtonModel lastButtonModel;
	private JLabel jLabel;

	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();

		this.init();
	}

	private void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);

		JPanel jPanel_center = new JPanel();
		jPanel_center.setLayout(new GridLayout());

		LastButtonListerner lastButtonListerner = new LastButtonListerner(this);

		Font font = new Font("Arial", Font.BOLD, 30);

		JButton jButton_1 = new JButton("1");
		jButton_1.setFont(font);
		jButton_1.addActionListener(lastButtonListerner);
		JButton jButton_2 = new JButton("2");
		jButton_2.setFont(font);
		jButton_2.addActionListener(lastButtonListerner);
		JButton jButton_3 = new JButton("3");
		jButton_3.setFont(font);
		jButton_3.addActionListener(lastButtonListerner);
		JButton jButton_4 = new JButton("4");
		jButton_4.setFont(font);
		jButton_4.addActionListener(lastButtonListerner);

		jPanel_center.setLayout(new GridLayout(2, 2, 20, 20));
		jPanel_center.add(jButton_1);
		jPanel_center.add(jButton_2);
		jPanel_center.add(jButton_3);
		jPanel_center.add(jButton_4);

		JPanel jPanel_footer = new JPanel();
		jLabel = new JLabel("-----");
		jLabel.setFont(font);
		jPanel_footer.add(jLabel);

		this.setLayout(new BorderLayout());
		this.add(jPanel_center, BorderLayout.CENTER);
		this.add(jPanel_footer, BorderLayout.SOUTH);

		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void changTo_1() {
		this.lastButtonModel.setValue_1();
		jLabel.setText("Last button: " + this.lastButtonModel.getValue());
	}

	public void changTo_2() {
		this.lastButtonModel.setValue_2();
		jLabel.setText("Last button: " + this.lastButtonModel.getValue());
	}

	public void changTo_3() {
		this.lastButtonModel.setValue_3();
		jLabel.setText("Last button: " + this.lastButtonModel.getValue());
	}

	public void changTo_4() {
		this.lastButtonModel.setValue_4();
		jLabel.setText("Last button: " + this.lastButtonModel.getValue());
	}

}
