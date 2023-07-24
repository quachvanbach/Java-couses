package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.DateChooser;
import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	public QLSVModel model;
	public JTextField textFieldMaThiSinh_timKiem;
	public JTable table;
	public JTextField textFieldHoVaTen;
	public JTextField textFieldMaThiSinh;
	public JTextField textFieldNgaySinh;
	public JTextField textFieldDiemMon1;
	public JTextField textFieldDiemMon2;
	public JTextField textFieldDiemMon3;
	public ButtonGroup btnGioiTinh;
	public JComboBox<String> comboBoxQueQuan;
	public JRadioButton radioButtonNam;
	public JRadioButton radioButtonNu;
	private JComboBox<String> comboBoxQueQuan_timKiem;

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 851, 635);
		setLocationRelativeTo(null);

		ActionListener action = new QLSVController(this);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuFile);

		JMenuItem menuItemOpen = new JMenuItem("Open");
		menuItemOpen.addActionListener(action);
		menuItemOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuItemOpen);

		JSeparator separator = new JSeparator();
		menuFile.add(separator);

		JMenuItem menuItemSave = new JMenuItem("Save");
		menuItemSave.addActionListener(action);
		menuItemSave.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuItemSave);

		JSeparator separator_1 = new JSeparator();
		menuFile.add(separator_1);

		JMenuItem menuItemExit = new JMenuItem("Exit");
		menuItemExit.addActionListener(action);
		menuItemExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuItemExit);

		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(menuAbout);

		JMenuItem menuItemAboutMe = new JMenuItem("About Me");
		menuItemAboutMe.addActionListener(action);
		menuItemAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(menuItemAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lableQueQuan_timKiem = new JLabel("Quê quán");
		lableQueQuan_timKiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lableQueQuan_timKiem.setBounds(10, 11, 77, 22);
		contentPane.add(lableQueQuan_timKiem);

		comboBoxQueQuan_timKiem = new JComboBox<String>();
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		for (Tinh tinh : listTinh) {
			comboBoxQueQuan_timKiem.addItem(tinh.getTenTinh());
		}
		comboBoxQueQuan_timKiem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxQueQuan_timKiem.setBounds(107, 9, 156, 28);
		comboBoxQueQuan_timKiem.setSelectedIndex(-1);
		contentPane.add(comboBoxQueQuan_timKiem);

		JLabel labelMaSinhVien_timKiem = new JLabel("Mã thí sinh");
		labelMaSinhVien_timKiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelMaSinhVien_timKiem.setBounds(302, 11, 87, 22);
		contentPane.add(labelMaSinhVien_timKiem);

		textFieldMaThiSinh_timKiem = new JTextField();
		textFieldMaThiSinh_timKiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldMaThiSinh_timKiem.setColumns(10);
		textFieldMaThiSinh_timKiem.setBounds(399, 8, 156, 28);
		contentPane.add(textFieldMaThiSinh_timKiem);

		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.addActionListener(action);
		btnTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTimKiem.setBounds(586, 7, 107, 31);
		contentPane.add(btnTimKiem);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 53, 815, 1);
		contentPane.add(separator_2);

		JLabel lblDanhSchTh = new JLabel("Danh s\u00E1ch Th\u00ED sinh");
		lblDanhSchTh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDanhSchTh.setBounds(10, 65, 171, 33);
		contentPane.add(lblDanhSchTh);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "M\u00E3 th\u00ED sinh", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Ng\u00E0y sinh",
						"Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3" }));
		table.setRowHeight(25);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 109, 815, 241);
		contentPane.add(scrollPane);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(10, 361, 815, 1);
		contentPane.add(separator_2_1);

		JLabel lblHoVaTen = new JLabel("Họ và tên");
		lblHoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHoVaTen.setBounds(10, 418, 77, 22);
		contentPane.add(lblHoVaTen);

		textFieldHoVaTen = new JTextField();
		textFieldHoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldHoVaTen.setColumns(10);
		textFieldHoVaTen.setBounds(107, 415, 156, 28);
		contentPane.add(textFieldHoVaTen);

		JLabel lableMaThiSinh = new JLabel("Mã thí sinh");
		lableMaThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lableMaThiSinh.setBounds(10, 376, 87, 22);
		contentPane.add(lableMaThiSinh);

		textFieldMaThiSinh = new JTextField();
		textFieldMaThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldMaThiSinh.setColumns(10);
		textFieldMaThiSinh.setBounds(107, 373, 156, 28);
		contentPane.add(textFieldMaThiSinh);

		JLabel lblNgaySinh = new JLabel("Ngày Sinh");
		lblNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNgaySinh.setBounds(10, 460, 80, 22);
		contentPane.add(lblNgaySinh);

		textFieldNgaySinh = new JTextField();
		textFieldNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldNgaySinh.setColumns(10);
		textFieldNgaySinh.setBounds(107, 457, 156, 28);
		contentPane.add(textFieldNgaySinh);

		JLabel lableQueQuan = new JLabel("Qu\u00EA qu\u00E1n");
		lableQueQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lableQueQuan.setBounds(302, 376, 77, 22);
		contentPane.add(lableQueQuan);

		comboBoxQueQuan = new JComboBox<String>();
		for (Tinh tinh : listTinh) {
			comboBoxQueQuan.addItem(tinh.getTenTinh());
		}
		comboBoxQueQuan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBoxQueQuan.setBounds(399, 374, 156, 28);
		comboBoxQueQuan.setSelectedIndex(-1);
		contentPane.add(comboBoxQueQuan);

		JLabel lblGioiTinh = new JLabel("Giới tính");
		lblGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGioiTinh.setBounds(302, 418, 80, 22);
		contentPane.add(lblGioiTinh);

		radioButtonNam = new JRadioButton("Nam ");
		radioButtonNam.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButtonNam.setBounds(399, 417, 78, 23);

		contentPane.add(radioButtonNam);

		radioButtonNu = new JRadioButton("Nữ");
		radioButtonNu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		radioButtonNu.setBounds(477, 417, 78, 23);
		contentPane.add(radioButtonNu);

		btnGioiTinh = new ButtonGroup();
		btnGioiTinh.add(radioButtonNam);
		btnGioiTinh.add(radioButtonNu);

		textFieldDiemMon1 = new JTextField();
		textFieldDiemMon1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldDiemMon1.setColumns(10);
		textFieldDiemMon1.setBounds(701, 373, 120, 28);
		contentPane.add(textFieldDiemMon1);

		JLabel lblimMn = new JLabel("Điểm môn 1");
		lblimMn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblimMn.setBounds(586, 376, 114, 22);
		contentPane.add(lblimMn);

		textFieldDiemMon2 = new JTextField();
		textFieldDiemMon2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldDiemMon2.setColumns(10);
		textFieldDiemMon2.setBounds(701, 415, 120, 28);
		contentPane.add(textFieldDiemMon2);

		JLabel lblimMn_1 = new JLabel("Điểm môn 2");
		lblimMn_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblimMn_1.setBounds(586, 418, 114, 22);
		contentPane.add(lblimMn_1);

		textFieldDiemMon3 = new JTextField();
		textFieldDiemMon3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldDiemMon3.setColumns(10);
		textFieldDiemMon3.setBounds(701, 457, 120, 28);
		contentPane.add(textFieldDiemMon3);

		JLabel lblimMn_2 = new JLabel("Điểm môn 3");
		lblimMn_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblimMn_2.setBounds(586, 460, 114, 22);
		contentPane.add(lblimMn_2);

		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(action);
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThem.setBounds(10, 517, 132, 31);
		contentPane.add(btnThem);

		JButton btnXoa = new JButton("Xoá");
		btnXoa.addActionListener(action);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXoa.setBounds(183, 517, 132, 31);
		contentPane.add(btnXoa);

		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.addActionListener(action);
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCapNhat.setBounds(356, 517, 132, 31);
		contentPane.add(btnCapNhat);

		JButton btnLưu = new JButton("Lưu");
		btnLưu.addActionListener(action);
		btnLưu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLưu.setBounds(529, 517, 132, 31);
		contentPane.add(btnLưu);

		JButton btnHuyBo = new JButton("Huỷ bỏ");
		btnHuyBo.addActionListener(action);
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHuyBo.setBounds(693, 517, 132, 31);
		contentPane.add(btnHuyBo);

		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBounds(10, 494, 811, 1);
		contentPane.add(separator_2_2);

		JButton btnHuyTimKiem = new JButton("Huỷ");
		btnHuyTimKiem.addActionListener(action);
		btnHuyTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHuyTimKiem.setBounds(714, 7, 107, 31);
		contentPane.add(btnHuyTimKiem);

		this.setVisible(true);

	}

	public void xoaForm() {
		textFieldMaThiSinh.setText("");
		textFieldHoVaTen.setText("");
		textFieldNgaySinh.setText("");
		comboBoxQueQuan.setSelectedIndex(-1);
		btnGioiTinh.clearSelection();
		textFieldDiemMon1.setText("");
		textFieldDiemMon2.setText("");
		textFieldDiemMon3.setText("");
	}

	public void themThiSinhVaoTable(ThiSinh ts) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = dateFormat.format(ts.getNgaySinh());
		DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
		modelTable.addRow(new Object[] { ts.getMaThiSinh() + "", ts.getTenThiSinh(), ts.getQueQuan().getTenTinh(),
				dateString, (ts.isGioiTinh() ? "Nam" : "Nữ"), ts.getDiemMon1() + "", ts.getDiemMon2() + "",
				ts.getDiemMon3() + "" });
	}

	public ThiSinh getThiSinhDangChon() {
		DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
		int indexRow = table.getSelectedRow();

		int maThiSinh = Integer.valueOf(modelTable.getValueAt(indexRow, 0) + "");
		String tenThiSinh = modelTable.getValueAt(indexRow, 1) + "";
		Tinh tinh = Tinh.getTinhByTen(modelTable.getValueAt(indexRow, 2));
		Date ngaySinh = new Date(modelTable.getValueAt(indexRow, 3) + "");
		String textGioiTinh = modelTable.getValueAt(indexRow, 4) + "";
		boolean gioiTinh = textGioiTinh.equals("Nam");
		float diemMon1 = Float.valueOf(modelTable.getValueAt(indexRow, 5) + "");
		float diemMon2 = Float.valueOf(modelTable.getValueAt(indexRow, 6) + "");
		float diemMon3 = Float.valueOf(modelTable.getValueAt(indexRow, 7) + "");

		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		return ts;
	}

	public void themHoacCapNhatThiSinh(ThiSinh ts) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = dateFormat.format(ts.getNgaySinh());
		DefaultTableModel modelTable = (DefaultTableModel) table.getModel();

		if (!this.model.kiemTraTonTai(ts)) {
			this.model.insert(ts);
			this.themThiSinhVaoTable(ts);
		} else {
			this.model.update(ts);
			int soLuongDong = modelTable.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String id = modelTable.getValueAt(i, 0) + "";
				if (id.equals(ts.getMaThiSinh() + "")) {
					modelTable.setValueAt(ts.getMaThiSinh() + "", i, 0);
					modelTable.setValueAt(ts.getTenThiSinh(), i, 1);
					modelTable.setValueAt(ts.getQueQuan().getTenTinh() + "", i, 2);
					modelTable.setValueAt(dateString, i, 3);
					modelTable.setValueAt((ts.isGioiTinh() ? "Nam" : "Nữ"), i, 4);
					modelTable.setValueAt(ts.getDiemMon1() + "", i, 5);
					modelTable.setValueAt(ts.getDiemMon2() + "", i, 6);
					modelTable.setValueAt(ts.getDiemMon3() + "", i, 7);
				}
			}
		}

	}

	public void hienThiThongTinThiSinhDaChon() {
		ThiSinh ts = getThiSinhDangChon();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = dateFormat.format(ts.getNgaySinh());

		this.textFieldMaThiSinh.setText(ts.getMaThiSinh() + "");
		this.textFieldHoVaTen.setText(ts.getTenThiSinh() + "");
		this.comboBoxQueQuan.setSelectedItem(ts.getQueQuan().getTenTinh());
		this.textFieldNgaySinh.setText(dateString);
		if (ts.isGioiTinh()) {
			radioButtonNam.setSelected(true);
		} else {
			radioButtonNu.setSelected(true);
		}
		this.textFieldDiemMon1.setText(ts.getDiemMon1() + "");
		this.textFieldDiemMon2.setText(ts.getDiemMon2() + "");
		this.textFieldDiemMon3.setText(ts.getDiemMon3() + "");

	}

	public void thucHienXoa() {
		ThiSinh ts = getThiSinhDangChon();

		DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
		int indexRow = table.getSelectedRow();
		int luaChon = JOptionPane.showConfirmDialog(this,
				"Bạn có chắc chắn xoá thí sinh [" + ts.getMaThiSinh() + "] [" + ts.getTenThiSinh() + "]");
		if (luaChon == JOptionPane.YES_OPTION) {
			this.model.delete(ts);
			modelTable.removeRow(indexRow);

		}

	}

	public void thucHienThem() {
		int maThiSinh = Integer.valueOf(this.textFieldMaThiSinh.getText());
		String tenThiSinh = this.textFieldHoVaTen.getText();
		int queQuan = this.comboBoxQueQuan.getSelectedIndex();
		Tinh tinh = Tinh.getTinhByID(queQuan);
		Date ngaySinh = new Date(this.textFieldNgaySinh.getText());
		boolean gioiTinh = true;

		if (this.radioButtonNam.isSelected()) {
			gioiTinh = true;
		} else if (this.radioButtonNu.isSelected()) {
			gioiTinh = false;
		}
		float diemMon1 = Float.valueOf(this.textFieldDiemMon1.getText());
		float diemMon2 = Float.valueOf(this.textFieldDiemMon2.getText());
		float diemMon3 = Float.valueOf(this.textFieldDiemMon3.getText());

		ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		this.themHoacCapNhatThiSinh(ts);
	}

	public void thucHienTim() {

		// Goi ham huy tim kiem
		this.thucHienTaiLaiDuLieu();

		// Thuc hien tim kiem
		int queQuan = this.comboBoxQueQuan_timKiem.getSelectedIndex();
		String maThiSinhTimKiem = this.textFieldMaThiSinh_timKiem.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soLuongDong = model_table.getRowCount();

		Set<Integer> idCuaThiSinhCanXoa = new TreeSet();
		if (queQuan >= 0) {
			Tinh tinhDaChon = Tinh.getTinhByID(queQuan);
			for (int i = 0; i < soLuongDong; i++) {
				String tenTinh = model_table.getValueAt(i, 2) + "";
				String id = model_table.getValueAt(i, 0) + "";
				if (!tenTinh.equals(tinhDaChon.getTenTinh())) {
					idCuaThiSinhCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		if (maThiSinhTimKiem.length() > 0) {
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0) + "";
				if (!id.equals(maThiSinhTimKiem)) {
					idCuaThiSinhCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		for (Integer idCanXoa : idCuaThiSinhCanXoa) {
			System.out.println(idCanXoa);
			soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String idTrongTable = model_table.getValueAt(i, 0) + "";
				if (idTrongTable.equals(idCanXoa.toString())) {
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}

	public void thucHienTaiLaiDuLieu() {
		while (true) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			int soLuongDong = model_table.getRowCount();
			if (soLuongDong == 0)
				break;
			else
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		for (ThiSinh ts : this.model.getDsThiSinh()) {
			this.themThiSinhVaoTable(ts);
		}
	}

	public void hienThiAbout() {
		JOptionPane.showMessageDialog(this, "Phần mềm quản lý thí sinh 1.0");
	}

	public void thoatKhoiChuongTrinh() {
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chương trình không?",
				"Thoát chương trình", JOptionPane.YES_NO_OPTION);
		if (luaChon == JOptionPane.YES_OPTION) {
			System.exit(luaChon);
		}
	}

	public void saveFile(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (ThiSinh ts : this.model.getDsThiSinh()) {
				oos.writeObject(ts);
			}
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void thucHienSave() {
		if (this.model.getTenFile().length() > 0) {
			saveFile(this.model.getTenFile());
		} else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				saveFile(file.getAbsolutePath());
			}
		}
	}

	private void openFile(String path) {
		ArrayList<ThiSinh> ds = new ArrayList<ThiSinh>();
		try {
			this.model.setTenFile(path);
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ThiSinh ts = null;
			while ((ts = (ThiSinh) ois.readObject()) != null) {
				ds.add(ts);
			}
			ois.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.model.setDsThiSinh(ds);
	}

	public void thucHienOpen() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			openFile(file.getAbsolutePath());
		}
		thucHienTaiLaiDuLieu();
	}
}