package Starter;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ControlPanel extends JPanel{
	
	JButton start,stop,reset;
	ControlPanel(CenterPanel c){
		start = new JButton("Start Train");
		
		stop = new JButton("Stop Train");
		reset = new JButton("Reset Train");
		add(start);
		add(stop);
		add(reset);
		
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.trains[0].startTrain();
			}
		});
		stop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.trains[0].stopTrain();
			}
		});
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				c.trains[0].resetTrain();
			}
		});
	}
}
