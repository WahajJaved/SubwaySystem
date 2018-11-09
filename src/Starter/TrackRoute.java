package Starter;

import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author student
 */
public class TrackRoute {
	public String name;
	public ArrayList<Track> trackNodes;

	public TrackRoute(String name) {
		this.name = name;
		this.trackNodes = new ArrayList<Track>();
		System.out.println("Track Route Start for " + name);
	}

	public void addNode(Track n) {
		trackNodes.add(n);
	}
	public void addAll() {
		ReadData r = new ReadData();
		Signal [] signals= r.ReadSignals("Signal.txt");
		Track [] tracks = r.ReadTracks("Track.txt", signals);
		int counter = 0;
		while (counter != 50) {
			if (tracks[counter] != null) {
				trackNodes.add(tracks[counter]);
			}
			counter++;
		}
	}
	public ArrayList<Track> getTrackNodes() {
		return trackNodes;
	}

	public String getName() {
		return name;
	}
        
	public String toString() {
		String s = String.format("%5s", name);
                ListIterator<Track> iter = trackNodes.listIterator();
//		while (iter.hasNext())
//                    s = s + String.format("%5s%5s%5s", " ", trackNodes.get(iter.()).getName(), n.next.getName());
		return s;
	}
	
	public void drawMe(Graphics g) {
		for(Track i:trackNodes){
			i.drawMe(g);
		}
	}
}