package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseEventController;
import model.MouseEventModel;

public class MouseEventView extends JFrame {
	private MouseEventModel mouseEventModel;
	private JPanel jPanel_mouse;
	private JLabel jLabel_position;
	private JLabel jLabel_x;
	private JLabel jLabel_y;
	private JLabel jLabel_empty_1;
	private JLabel jLabel_count_value;
	private JLabel jLabel_count;
	private JLabel jLabel_checkIn;
	private JLabel jLabel_empty_2;
	private JLabel jLabel_chekIn_value;

	public MouseEventView() throws HeadlessException {
		this.mouseEventModel = new MouseEventModel();
		this.init();
	}

	private void init() {
		this.setTitle("Mouse Event");
		this.setSize(700, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		MouseEventController mouseEventController = new MouseEventController(this);

		jPanel_mouse = new JPanel();
		jPanel_mouse.setBackground(Color.CYAN);
		jPanel_mouse.addMouseListener(mouseEventController);
		jPanel_mouse.addMouseMotionListener(mouseEventController);

		JPanel jPanel_info = new JPanel();
		jPanel_info.setLayout(new GridLayout(3, 3));

		Font font = new Font("Arial", Font.PLAIN, 20);
		jLabel_position = new JLabel("Position: ");
		jLabel_position.setFont(font);
		jLabel_x = new JLabel("x = ");
		jLabel_x.setFont(font);
		jLabel_y = new JLabel("y = ");
		jLabel_y.setFont(font);
		jLabel_count = new JLabel("Number of clocks: ");
		jLabel_count.setFont(font);
		jLabel_count_value = new JLabel("---");
		jLabel_count_value.setFont(font);
		jLabel_empty_1 = new JLabel();
		jLabel_empty_1.setFont(font);
		jLabel_checkIn = new JLabel("Mouse is in component: ");
		jLabel_checkIn.setFont(font);
		jLabel_chekIn_value = new JLabel("no");
		jLabel_chekIn_value.setFont(font);
		jLabel_empty_2 = new JLabel();
		jLabel_empty_2.setFont(font);

		jPanel_info.add(jLabel_position);
		jPanel_info.add(jLabel_x);
		jPanel_info.add(jLabel_y);
		jPanel_info.add(jLabel_count);
		jPanel_info.add(jLabel_count_value);
		jPanel_info.add(jLabel_empty_1);
		jPanel_info.add(jLabel_checkIn);
		jPanel_info.add(jLabel_chekIn_value);
		jPanel_info.add(jLabel_empty_2);

		this.setLayout(new BorderLayout());
		this.add(jPanel_mouse, BorderLayout.CENTER);
		this.add(jPanel_info, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void addClick() {
		this.mouseEventModel.addClick();
		this.jLabel_count_value.setText(this.mouseEventModel.getCount() + "");
	}

	public void enter() {
		this.mouseEventModel.enter();
		this.jLabel_chekIn_value.setText(this.mouseEventModel.getCheckIn());
	}

	public void exit() {
		this.mouseEventModel.exit();
		this.jLabel_chekIn_value.setText(this.mouseEventModel.getCheckIn());
	}

	public void updatePosition(int x, int y) {
		this.mouseEventModel.setX(x);
		this.mouseEventModel.setY(y);
		this.jLabel_x.setText(this.mouseEventModel.getX() + "");
		this.jLabel_y.setText(this.mouseEventModel.getY() + "");
	}

}
