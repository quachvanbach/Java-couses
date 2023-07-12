package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.ThucDonController;
import model.ThucDonModel;

public class ThucDonView extends JFrame {
	public ThucDonModel thucDonModel;
	public JRadioButton jRadioButton_com;
	public JRadioButton jRadioButton_pho;
	public JRadioButton jRadioButton_banhMi;
	public ButtonGroup buttonGroup_monChinh;
	public JCheckBox jCheckBox_traSua;
	public JCheckBox jCheckBox_cocacola;
	public JCheckBox jCheckBox_banhNgot;
	public JCheckBox jCheckBox_nem;
	public ArrayList<JCheckBox> buttonGroup_monPhu;
	public JLabel jLabel_thongTin;

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
		jPanel_monChinh.setLayout(new GridLayout(1, 3));
		jRadioButton_com = new JRadioButton("Cơm");
		jRadioButton_com.setFont(font);
		jRadioButton_pho = new JRadioButton("Phở");
		jRadioButton_pho.setFont(font);
		jRadioButton_banhMi = new JRadioButton("Bánh mì");
		jRadioButton_banhMi.setFont(font);
		buttonGroup_monChinh = new ButtonGroup();
		buttonGroup_monChinh.add(jRadioButton_com);
		buttonGroup_monChinh.add(jRadioButton_pho);
		buttonGroup_monChinh.add(jRadioButton_banhMi);
		jPanel_monChinh.add(jRadioButton_com);
		jPanel_monChinh.add(jRadioButton_pho);
		jPanel_monChinh.add(jRadioButton_banhMi);

		JPanel jPanel_monPhu = new JPanel();
		jPanel_monPhu.setLayout(new GridLayout(2, 2));
		jCheckBox_traSua = new JCheckBox("Trà sữa");
		jCheckBox_traSua.setFont(font);
		jCheckBox_cocacola = new JCheckBox("Cocacola");
		jCheckBox_cocacola.setFont(font);
		jCheckBox_banhNgot = new JCheckBox("Bánh ngọt");
		jCheckBox_banhNgot.setFont(font);
		jCheckBox_nem = new JCheckBox("Nem");
		jCheckBox_nem.setFont(font);
		buttonGroup_monPhu = new ArrayList<JCheckBox>();
		buttonGroup_monPhu.add(jCheckBox_traSua);
		buttonGroup_monPhu.add(jCheckBox_cocacola);
		buttonGroup_monPhu.add(jCheckBox_banhNgot);
		buttonGroup_monPhu.add(jCheckBox_nem);
		jPanel_monPhu.add(jCheckBox_traSua);
		jPanel_monPhu.add(jCheckBox_cocacola);
		jPanel_monPhu.add(jCheckBox_banhNgot);
		jPanel_monPhu.add(jCheckBox_nem);

		JPanel jPanel_luaChon = new JPanel();
		jPanel_luaChon.setLayout(new GridLayout(2, 1));
		jPanel_luaChon.add(jPanel_monChinh);
		jPanel_luaChon.add(jPanel_monPhu);

		this.add(jPanel_luaChon, BorderLayout.CENTER);

		JPanel jPanel_thanhToan = new JPanel();
		jPanel_thanhToan.setLayout(new GridLayout(1, 2));
		jLabel_thongTin = new JLabel();
		jLabel_thongTin.setFont(new Font("Arial", Font.PLAIN, 20));
		ActionListener thucDonController = new ThucDonController(this);
		JButton jButton_thanhToan = new JButton("Thanh toán");
		jButton_thanhToan.setFont(font);
		jButton_thanhToan.addActionListener(thucDonController);
		jPanel_thanhToan.add(jLabel_thongTin);
		jPanel_thanhToan.add(jButton_thanhToan);
		this.add(jPanel_thanhToan, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void hienThiKetQua() {
		if(this.thucDonModel.getLuaChon_monPhu()=="") {
			String kq = "Món chính: " + this.thucDonModel.getLuaChon_monChinh() + " || Món phụ: "
					+ this.thucDonModel.getLuaChon_monPhu()+ " || Tổng tiền: " + this.thucDonModel.getTongTien();
			this.jLabel_thongTin.setText(kq);			
		}else {
			String kq = "Món chính: " + this.thucDonModel.getLuaChon_monChinh() + " || Món phụ: "
					+ this.thucDonModel.getLuaChon_monPhu().substring(0, (this.thucDonModel.getLuaChon_monPhu()).length() - 2)+ " || Tổng tiền: " + this.thucDonModel.getTongTien();
			this.jLabel_thongTin.setText(kq);			
		}
	}

}
