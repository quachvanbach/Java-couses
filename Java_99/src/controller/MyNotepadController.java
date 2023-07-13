package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import view.MyNotepadView;

public class MyNotepadController implements ActionListener {
	MyNotepadView myNotePadView;

	public MyNotepadController(MyNotepadView myNotePadView) {
		this.myNotePadView = myNotePadView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		JFileChooser fc = new JFileChooser();
		if (command.equals("Open")) {
			int returnVal = fc.showOpenDialog(this.myNotePadView);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String fileName = file.getName();
				this.myNotePadView.myNotepadodel.setFileName(file.getAbsolutePath());
				this.myNotePadView.lblNewLabel.setText(this.myNotePadView.myNotepadodel.getFileName());
				if (fileName.endsWith(".txt")) {
					try {
						List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						String result = "";
						for (String line : allText) {
							result += line;
							result += "\n";
						}

						this.myNotePadView.myNotepadodel.setContent(result);
						this.myNotePadView.textArea.setText(this.myNotePadView.myNotepadodel.getContent());
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(myNotePadView, e2, "Error", JOptionPane.ERROR_MESSAGE);
					}

				}
			}
		} else if (command.equals("Save")) {
			if (this.myNotePadView.myNotepadodel.getFileName().length() > 0) {
				saveData(this.myNotePadView.myNotepadodel.getFileName());
			} else {
				int returnVal = fc.showSaveDialog(this.myNotePadView);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					saveData(file.getAbsolutePath());
				}
			}
		}
	}

	public void saveData(String fileName) {
		try {
			PrintWriter pw = new PrintWriter(fileName, "UTF-8");
			String data = this.myNotePadView.textArea.getText();
			pw.print(data);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}
}