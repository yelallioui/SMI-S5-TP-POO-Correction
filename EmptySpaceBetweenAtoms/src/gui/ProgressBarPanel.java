package gui;

import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.*;    

public class ProgressBarPanel extends JPanel {    

	private JProgressBar progressBar;    
	
	int i=0,num=0;   
	
	ProgressBarPanel(LayoutManager layoutManager, int iterationsProgress){    
		progressBar = new JProgressBar(0,iterationsProgress);    
		progressBar.setBounds(40,40,300,30);         
		progressBar.setValue(0);    
		progressBar.setStringPainted(true);    
		
		setLayout(layoutManager);
		setBorder(BorderFactory.createTitledBorder("Please wait .."));	
		add(progressBar);
	}    
	
	public void iterate(int iterationsProgress){    
		while(i<=iterationsProgress){    
			progressBar.setValue(i);    
			i=i+1;    
			//try{Thread.sleep(150);}catch(Exception e){}    
		}    
	}    
	public static void main(String[] args) {    
		JFrame f = new JFrame("hhh");
		ProgressBarPanel jb = new ProgressBarPanel(new FlowLayout(), 200000000);		   
		f.setVisible(true);    
		f.setBounds(0, 0, 1000, 1000);
		f.getContentPane().setLayout(new FlowLayout());  
		f.getContentPane().add(jb); 
	    //jb.setVisible(true); 
		jb.iterate(200000000);
	}    
	
	public JProgressBar getProgressBar() {
		return progressBar;
	}

	public void setProgressBar(JProgressBar progressBar) {
		this.progressBar = progressBar;
	}
}    
