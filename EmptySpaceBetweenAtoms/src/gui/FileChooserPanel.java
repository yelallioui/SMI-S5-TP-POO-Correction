package gui;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class FileChooserPanel extends JPanel {
	
	JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	JLabel label = new JLabel();


	public FileChooserPanel(LayoutManager layoutManager, String caption) {
		setLayout(layoutManager);
		label.setText(caption);
		label.setSize(20, 50);
		//fileChooser.setSize(20, 200);
		// Filters – Limit the set of files shown to the user
		fileChooser.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
		fileChooser.addChoosableFileFilter(filter);
		add(label);
		add(fileChooser);
		setVisible(true);
		
	}


	public JFileChooser getFileChooser() {
		return fileChooser;
	}


	public void setFileChooser(JFileChooser fileChooser) {
		this.fileChooser = fileChooser;
	}


	public JLabel getLabel() {
		return label;
	}


	public void setLabel(JLabel label) {
		this.label = label;
	}

	public static void main(String t[]) {
		JFrame f = new JFrame("ghhjk");
		FileChooserPanel fcp = new FileChooserPanel(new FlowLayout(), "File");
		f.getContentPane().add(fcp);
		f.setVisible(true);
		f.setSize(400, 800);
		int returnValue = fcp.getFileChooser().showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fcp.getFileChooser().getSelectedFile();
			fcp.getLabel().setText(selectedFile.getAbsolutePath());
		}
	}
	

}
