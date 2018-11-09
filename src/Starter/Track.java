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
public class Track extends TrackG {
	String direction;
	
	public Track(Signal startSignal, Signal stopSignal, String name, String direction) {
		super(startSignal, stopSignal, name, direction);
	}

	public String toString() {
		return String.format("%-10s", getDirection());
	}
	
}
