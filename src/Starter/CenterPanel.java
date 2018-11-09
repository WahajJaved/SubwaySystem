package Starter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class CenterPanel extends JPanel{
	
	MasterG[] items;
	SubwayTrain[] trains;
	CenterPanel(MasterG[] item , SubwayTrain[] train) {
		items= item;
		trains = train;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		//g.setColor(Color.BLACK);
		//g.fillOval(12, 21, 10, 20);
		
		int counter = 0;
		while (items[counter] != null) {
			items[counter].drawMe(g2);
			counter++;
		}
		counter = 0;
		try {
			while (trains[counter] != null) {
				trains[counter].drawMe(g);
				counter++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
	}
	
}
