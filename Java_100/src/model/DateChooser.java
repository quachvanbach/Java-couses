package model;

import java.util.Properties;

import javax.swing.JTextField;

import org.jdatepicker.JDateComponentFactory;
import org.jdatepicker.JDatePicker;

public class DateChooser{
	private JDatePicker datePicker;
	
	public DateChooser(JTextField textField) {
		JDateComponentFactory dateComponentFactory = new JDateComponentFactory();
		Properties properties = new Properties();
		datePicker = dateComponentFactory.createJDatePicker(properties);
		
		datePicker.addActionListener(e -> {
			Object selectedDate = datePicker.getModel().getValue();
			textField.setText(selectedDate.toString());
		});
		
	}

}
