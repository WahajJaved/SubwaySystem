package Starter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;

/**
 *
 * @author student
 */
public class RouteTable {
	public HashMap<String, TrackRoute> trackRouteHM;

	public RouteTable() {
		trackRouteHM = new HashMap<String, TrackRoute>();
	}

	public HashMap<String, TrackRoute> getTrackRouteHM() {
		return trackRouteHM;
	}

	public void addRoutes(TrackRoute tr) {
		trackRouteHM.put(tr.name, tr);
	}

}
