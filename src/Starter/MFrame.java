package Starter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author student
 */
public class MFrame extends JFrame implements ActionListener {
	CenterPanel cp;
	ControlPanel bp;
	 SubwayTrain[] trains;
	 
	public MFrame(MasterG[] items, SubwayTrain[] trains) {
		super("Controls");
		this.trains = trains;
		System.out.println(items.toString());
		Container c = this.getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new BorderLayout());
		cp = new CenterPanel(items, trains);
		bp = new ControlPanel(cp);
		c.add(cp, BorderLayout.CENTER);
		c.add(bp, BorderLayout.EAST);
		setSize(900, 600);
		setVisible(true);
		
		Timer t =new Timer(50,this);
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		trains[0].moveTrain();
		cp.repaint();
		
	}
	
}
