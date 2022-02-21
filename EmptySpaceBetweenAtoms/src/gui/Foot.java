package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

import metier.Atom;
import metier.Sphere;

public class Foot extends JPanel {
	
	DefaultListModel<Atom> model;
	
	JList<Atom> list;
	
	String borderTitle;
	
	ProgressBarPanel jb;
	
	public Foot(String borderTitle, DefaultListModel<Atom> model) {
		this.list = new JList<Atom>(model);
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createTitledBorder("State of progress .. "));	
		add(list,BorderLayout.CENTER);
		jb = new ProgressBarPanel(new FlowLayout(), 10);
		add(jb, BorderLayout.SOUTH);
	}	
}
