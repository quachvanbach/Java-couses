package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MyNotepadController;
import model.MyNotepadModel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyNotepadView extends JFrame {

	private JPanel contentPane;
	public MyNotepadModel myNotepadodel;
	public JLabel lblNewLabel;
	public JTextArea textArea;
	
	/**
	 * Create the frame.
	 */
	public MyNotepadView() {
		this.myNotepadodel = new MyNotepadModel();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));

		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 50));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("File name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 472, 28);
		panel.add(lblNewLabel);
		
		ActionListener action = new MyNotepadController(this);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.setBounds(523, 17, 89, 23);
		btnOpen.addActionListener(action);
		panel.add(btnOpen);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(641, 17, 89, 23);
		btnSave.addActionListener(action);
		panel.add(btnSave);
		
		this.setVisible(true);
	}

}
