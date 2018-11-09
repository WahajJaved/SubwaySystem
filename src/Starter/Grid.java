package Starter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Grid {
	private int x;
	private int y;

	public Grid(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Grid(String x, String y) {
		try {
			this.x = Integer.parseInt(x);
			this.y = Integer.parseInt(y);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		return String.format("%5d%5d", x, y);
	}
}
