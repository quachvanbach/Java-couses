package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class ViDu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public ViDu() {
		this.setTitle("Thực đơn");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(57, 67, 235, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(57, 98, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("V\u00ED d\u1EE5");
		lblNewLabel.setFont(new Font("UVN Thoi Nay", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(161, 0, 66, 42);
		contentPane.add(lblNewLabel);
		
		this.setVisible(true);
	}
}
