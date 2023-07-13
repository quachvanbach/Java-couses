package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import view.ThucDonView;

public class ThucDonController implements ActionListener {
	private ThucDonView thucDonView;

	public ThucDonController(ThucDonView thucDonView) {
		this.thucDonView = thucDonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String monChinh = thucDonView.jComboBox_monChinh.getSelectedItem().toString();

		String monPhu = "";
		List<String> luaChonMonPhu = thucDonView.jList_monPhu.getSelectedValuesList();
		for (String str : luaChonMonPhu) {
			monPhu += str + " ; ";
		}

		thucDonView.thucDonModel.setLuaChon_monChinh(monChinh);
		thucDonView.thucDonModel.setLuaChon_monPhu(monPhu);
		thucDonView.thucDonModel.tinhTongTien();
		thucDonView.hienThiKetQua();

		String soTien_Chuoi = (String) JOptionPane.showInputDialog(thucDonView,
				thucDonView.jLabel_thongTin.getText() + "\n----------------- Nhập vào số tiền -----------------",
				"Thông báo", JOptionPane.PLAIN_MESSAGE);
		try {
			double soTien = Double.valueOf(soTien_Chuoi);
			JOptionPane.showMessageDialog(thucDonView,
					"Trả lại cho khách " + (soTien - thucDonView.thucDonModel.getTongTien()), "Thông báo",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(thucDonView, "Nhập dữ liệu sai", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}