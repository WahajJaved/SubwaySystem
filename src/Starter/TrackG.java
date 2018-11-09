package Starter;

import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class TrackG extends MasterG {
	Signal startSignal;
	Signal stopSignal;
	private String direction;

	public TrackG(Signal startSignal, Signal stopSignal, String name, String direction) {
		super(startSignal.getLocA(), stopSignal.getLocA(), 0, 0, name);
		this.startSignal = startSignal;
		this.stopSignal = stopSignal;
		this.direction = direction;

	}
        public void drawMe(Graphics g) {
//        	if(startSignal.getDrawY()==stopSignal.getDrawY()) {
//    			g.drawLine(startSignal.getLocA().getX(), startSignal.getLocA().getY()-2, stopSignal.getLocA().getX(), stopSignal.getLocA().getX()-2);
//    			g.drawLine(startSignal.getLocA().getX(), startSignal.getLocA().getY()+2, stopSignal.getLocA().getX(), stopSignal.getLocA().getX()+2);
//    		}
//    		else {
//    			g.drawLine(startSignal.getLocA().getX()-2, startSignal.getLocA().getY(), stopSignal.getLocA().getX()-2, stopSignal.getLocA().getX());
//    			g.drawLine(startSignal.getLocA().getX()+2, startSignal.getLocA().getY(), stopSignal.getLocA().getX()+2, stopSignal.getLocA().getX());
//    		}
		if(startSignal.getDrawY()==stopSignal.getDrawY()) {
			g.drawLine(startSignal.getDrawX(), startSignal.getDrawY()-2, stopSignal.getDrawX(), stopSignal.getDrawY()-2);
			g.drawLine(startSignal.getDrawX(), startSignal.getDrawY()+2, stopSignal.getDrawX(), stopSignal.getDrawY()+2);
		}
		else {
			g.drawLine(startSignal.getDrawX()-2, startSignal.getDrawY(), stopSignal.getDrawX()-2, stopSignal.getDrawY());
			g.drawLine(startSignal.getDrawX()+2, startSignal.getDrawY(), stopSignal.getDrawX()+2, stopSignal.getDrawY());
		}
	}
	public String getDirection() {
		return direction;
	}
}
