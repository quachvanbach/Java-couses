package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import controller.ThucDonController;
import model.ThucDonModel;

public class ThucDonView extends JFrame {
	public ThucDonModel thucDonModel;
	public JLabel jLabel_thongTin;
	public JComboBox<String> jComboBox_monChinh;
	public JList<String> jList_monPhu;

	public ThucDonView() {
		this.thucDonModel = new ThucDonModel();
		this.init();
	}

	private void init() {
		this.setTitle("Thực đơn");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
		this.setLayout(new BorderLayout());

		Font font = new Font("Arial", Font.BOLD, 30);

		JLabel header = new JLabel("Thực đơn của nhà hàng");
		header.setFont(font);

		JPanel jPanel_tieuDe = new JPanel();
		jPanel_tieuDe.add(header);
		this.add(jPanel_tieuDe, BorderLayout.NORTH);

		JPanel jPanel_monChinh = new JPanel();
		jPanel_monChinh.setLayout(new FlowLayout());

		String[] cacMonChinh = new String[] { "Cơm", "Phở", "Bánh mì" };
		jComboBox_monChinh = new JComboBox<String>(cacMonChinh);
		jComboBox_monChinh.setFont(font);
		jPanel_monChinh.add(jComboBox_monChinh);

		JPanel jPanel_monPhu = new JPanel();
		jPanel_monPhu.setLayout(new GridLayout(1, 1));

		String[] cacMonPhu = new String[] { "Trà sữa", "Cocacola", "Bánh ngọt", "Nem" };
		jList_monPhu = new JList<String>(cacMonPhu);
		jList_monPhu.setFont(font);
		jPanel_monPhu.add(jList_monPhu);

		JPanel jPanel_luaChon = new JPanel();
		jPanel_luaChon.setLayout(new BorderLayout());
		jPanel_luaChon.add(jPanel_monChinh, BorderLayout.NORTH);
		jPanel_luaChon.add(jPanel_monPhu, BorderLayout.CENTER);

		this.add(jPanel_luaChon, BorderLayout.CENTER);

		JPanel jPanel_thanhToan = new JPanel();
		jPanel_thanhToan.setLayout(new GridLayout(2, 1));
		jLabel_thongTin = new JLabel();
		jLabel_thongTin.setFont(new Font("Arial", Font.PLAIN, 20));

		ActionListener thucDonController = new ThucDonController(this);
		JButton jButton_thanhToan = new JButton("Thanh toán");
		jButton_thanhToan.setFont(font);
		jButton_thanhToan.addActionListener(thucDonController);
		jPanel_thanhToan.add(jButton_thanhToan);
		jPanel_thanhToan.add(jLabel_thongTin);
		this.add(jPanel_thanhToan, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void hienThiKetQua() {
		if (this.thucDonModel.getLuaChon_monPhu() == "") {
			String kq = "<html>Món chính: " + this.thucDonModel.getLuaChon_monChinh() + "<html><br>Món phụ: "
					+ this.thucDonModel.getLuaChon_monPhu() + "<html><br>Tổng tiền: " + this.thucDonModel.getTongTien()
					+ "</html>";
			this.jLabel_thongTin.setText(kq);
		} else {
			String kq = "<html>Món chính: " + this.thucDonModel.getLuaChon_monChinh() + "<html><br>Món phụ: "
					+ this.thucDonModel.getLuaChon_monPhu().substring(0,
							(this.thucDonModel.getLuaChon_monPhu()).length() - 2)
					+ "<html><br>Tổng tiền: " + this.thucDonModel.getTongTien() + "</html>";
			this.jLabel_thongTin.setText(kq);
		}
	}

}
