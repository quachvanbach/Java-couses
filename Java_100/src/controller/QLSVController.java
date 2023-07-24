package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.QLSVView;

public class QLSVController implements ActionListener {
	public QLSVView view;

	public QLSVController(QLSVView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Thêm")) {
			this.view.xoaForm();
			this.view.model.setLuaChon("Thêm");
		} else if (actionCommand.equals("Lưu")) {
			try {
				this.view.thucHienThem();
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (actionCommand.equals("Cập nhật")) {
			this.view.hienThiThongTinThiSinhDaChon();
		} else if (actionCommand.equals("Xoá")) {
			this.view.thucHienXoa();
		} else if (actionCommand.equals("Huỷ bỏ")) {
			this.view.xoaForm();
		}else if (actionCommand.equals("Tìm kiếm")) {
			this.view.thucHienTim();
		}else if (actionCommand.equals("Huỷ")) {
			this.view.thucHienTaiLaiDuLieu();
		}else if (actionCommand.equals("About Me")) {
			this.view.hienThiAbout();
		}else if (actionCommand.equals("Exit")) {
			this.view.thoatKhoiChuongTrinh();
		}else if (actionCommand.equals("Save")) {
			this.view.thucHienSave();
		}else if (actionCommand.equals("Open")) {
			this.view.thucHienOpen();
		}
	}

}
