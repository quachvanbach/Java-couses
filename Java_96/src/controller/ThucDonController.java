package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
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
	}
}