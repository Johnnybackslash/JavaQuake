package com.javaquake.app;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App extends JPanel{
	public void paint(Graphics g){
		g.drawLine(10, 10, 200, 300);			
	}
	
	public static void main(String[] args){
		JFrame frame= new JFrame("Welecome to JavaTutorial.net");	
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);		
	}
}
