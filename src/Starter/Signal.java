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
public class Signal extends SignalG {

	public Signal(Location loc, String name) {
		super(loc, name);
	}

	public String toString() {
		return String.format("%5s%5s%10s", getName(), getLocA());
	}
}
