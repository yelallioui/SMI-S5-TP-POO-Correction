import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.FileChooserPanel;
import gui.TextFieldPanel;

/**
 * @author Youssouf EL ALLIOUI
 * @version 01
 * 
 */
public class MainFrame extends JFrame {
	
	public MainFrame() {
		frameDefaultValues();
		
		getContentPane().add(frameCenterPanel(), BorderLayout.NORTH);
		
		getContentPane().add(frameSouthPanel(), BorderLayout.SOUTH);
		
	}
	
	void frameDefaultValues() {
		getContentPane().setLayout(new BorderLayout());
		setVisible(true);
		setTitle("Atoms empty space");
		this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
		setResizable(false);
	}
	
	JPanel frameCenterPanel() {
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new FlowLayout());
		centerPanel.setBorder(BorderFactory.createTitledBorder("Input data : "));
		
		JPanel volumPanel = new JPanel();
		volumPanel.setLayout(new BoxLayout(volumPanel, BoxLayout.Y_AXIS));
		volumPanel.setBorder(BorderFactory.createTitledBorder("Vomum : "));
		
		TextFieldPanel xTextFieldPanel = new TextFieldPanel(new FlowLayout(), "X :", 30);
		TextFieldPanel yTextFieldPanel = new TextFieldPanel(new FlowLayout(), "Y :", 30);
		TextFieldPanel zTextFieldPanel = new TextFieldPanel(new FlowLayout(), "Z :", 30);
		TextFieldPanel rTextFieldPanel = new TextFieldPanel(new FlowLayout(), "R :", 30);
		
		volumPanel.add(xTextFieldPanel);
		volumPanel.add(yTextFieldPanel);
		volumPanel.add(zTextFieldPanel);
		volumPanel.add(rTextFieldPanel);
		
		JPanel atomsPanel = new JPanel();
		atomsPanel.setLayout(new BoxLayout(atomsPanel, BoxLayout.Y_AXIS));
		atomsPanel.setBorder(BorderFactory.createTitledBorder("Atoms file : "));
		
		FileChooserPanel fileChooserPanel = new FileChooserPanel(new FlowLayout(), "");
		atomsPanel.add(fileChooserPanel);
		
		
		centerPanel.add(volumPanel);
		centerPanel.add(atomsPanel);
		
		return centerPanel;
	}
	
	JPanel frameMenuPanel() {
		
		return null;
	}
	
	JPanel frameNorthPanel() {
		
		return null;
	}
	
	JPanel frameSouthPanel () {
		JPanel southPanel = new JPanel();
				
		return southPanel;
	}
	
	
	public static void main(String[] args) {
		new MainFrame();

	}

}
