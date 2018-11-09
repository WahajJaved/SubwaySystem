package Starter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;

/**
 *
 * @author student
 */
public class SignalG extends MasterG {
	public SignalG(Location Loc, String name) {
		super(Loc, name, 10, 10);
	}

	public void drawMe(Graphics g) {
		g.drawRect(getDrawX(), getDrawY(), getW(), getH());
	}
}
