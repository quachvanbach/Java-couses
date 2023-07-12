package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

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
		String monChinh = "";
		Enumeration<AbstractButton> buttons_monChinh = thucDonView.buttonGroup_monChinh.getElements();
		while (buttons_monChinh.hasMoreElements()) {
			AbstractButton b = buttons_monChinh.nextElement();
			if (b.isSelected()) {
				monChinh = b.getText();
			}
		}
		String monPhu = "";
		for (AbstractButton b : thucDonView.buttonGroup_monPhu) {
			if (b.isSelected()) {
				monPhu =(monPhu + b.getText() + " ; ");
			}
		}
		thucDonView.thucDonModel.setLuaChon_monChinh(monChinh);
		thucDonView.thucDonModel.setLuaChon_monPhu(monPhu);
		thucDonView.thucDonModel.tinhTongTien();
		thucDonView.hienThiKetQua();
	}
}