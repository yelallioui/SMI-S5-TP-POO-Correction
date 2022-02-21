package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class TExtFieldLabelPanel extends JPanel {
	
	private JTextField textField;
	private JLabel label;

	/**
	 * Create the panel.
	 */
	public TExtFieldLabelPanel(String caption) {
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		label = new JLabel(caption);
		add(label);
		
		textField = new JTextField();
		add(textField);
		
		textField.setColumns(20);

	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}
	
	

}
