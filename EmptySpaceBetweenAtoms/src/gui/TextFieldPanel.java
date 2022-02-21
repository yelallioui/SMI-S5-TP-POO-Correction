package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldPanel extends JPanel {
	
	JTextField textField;
	JLabel label;

	public TextFieldPanel(LayoutManager layoutManager, String caption, int width) {
		setLayout(layoutManager);
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(300, 20));
		label = new JLabel(caption);
		label.setPreferredSize(new Dimension(width, 20));
		add(label);
		add(textField);
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

	public static void main(String t[]) {
		JFrame f = new JFrame("ghhjk");
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		f.getContentPane().setLayout(new FlowLayout());
		TextFieldPanel tfp1 = new TextFieldPanel(new FlowLayout(), "NOM", 50);
		TextFieldPanel tfp2 = new TextFieldPanel(new FlowLayout(), "File", 50);
		p.add(tfp1);
		p.add(tfp2);
		f.getContentPane().add(p);
		f.setVisible(true);
		f.setSize(400, 800);
		
		
	}
	

}
