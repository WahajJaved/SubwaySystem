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
public class MasterG {
	private Location LocA;
	private Location LocB;
	private int h;
	private int w;
	private String name;
	private int drawX;
	private int drawY;

	public MasterG(Location LocA, Location LocB, int h, int w, String name) {
		this.LocA = LocA;
		this.LocB = LocB;
		this.h = h;
		this.w = w;
		drawX = LocA.getX() - (w / 2);
		drawY = LocA.getY() - (h / 2);
		this.name = name;
	}

	public MasterG(Location LocA, String name, int h, int w) {
		this.LocA = LocA;
		this.LocB = null;
		this.h = h;
		this.w = w;
		drawX = LocA.getX() - (w / 2);
		drawY = LocA.getY() - (h / 2);
		this.name = name;
	}

	public int getDrawX() {
		return drawX;
	}

	public int getDrawY() {
		return drawY;
	}

	public int getH() {
		return h;
	}

	public int getW() {
		return w;
	}

	public Location getLocA() {
		return LocA;
	}

	public Location getLocB() {
		return LocB;
	}

	public String getName() {
		return name;
	}
	public void drawMe(Graphics g) {
		
	}
}
