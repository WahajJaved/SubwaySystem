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

import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;


public class SubwayTrain extends TrainG {
    private String trainCode ;
    private ArrayList<SubwayCar> carList;
    private int noOfCars;
    private Track currTrack;
    private Location currLocation;
    private int currSpeed;
    private boolean moving;
    private TrackRoute route;
    
    
    /**
     * SubwayTrain constructor
     * @param trainCode
     * @param carList 
     */
    public SubwayTrain(String trainCode, ArrayList<SubwayCar> carNo){
        this.trainCode = trainCode;
        this.carList = carNo;
        noOfCars = carNo.size();
        currLocation = new Location(0,0);
        currSpeed = 5;
        moving = false;
        route = new TrackRoute("Route1");
        route.addAll();
        currTrack = route.getTrackNodes().get(0);
        currLocation = currTrack.getLocA();
    }
    /**
     * gets the train code
     * @return 
     */
    public String getTrainCode(){
        return trainCode;
    }
    /**
     * returns arrayList of the train cars
     * @return 
     */
    public ArrayList<SubwayCar> getCarNo(){
        return carList;
    }
    /**
     * adds a car to the car arrayList
     * @param n 
     */
    public void add(SubwayCar sc){
        carList.add(sc);
    }
    public int getNoOfCars(){
        return carList.size();
        
    }
    public void updateTrack(TrackRoute R){
        ArrayList<Track> toBeUsed = R.getTrackNodes();
        for (int i=0;i<toBeUsed.size();i++){
            if (toBeUsed.get(i) == currTrack){
            
                currTrack = toBeUsed.get(i+1);
                break;
            }
        }  
    }
    public void resetTrain() {
    	currLocation.setX(0);
    	currLocation.setY(0);
    }
    public void startTrain() {
    	moving = true;
    }
    public void stopTrain() {
    	moving = false;
    }
    public void drawMe(Graphics g){
    	//g.setColor(Color.black);
//    	g.drawOval(currLocation.getX(), currLocation.getY(),7,7);
//    	g.setColor(Color.black);
//        g.fillOval(currLocation.getX(), currLocation.getY(),7,7);  
//        
    	g.drawOval(currLocation.getX(), currLocation.getY(),10,10);
    	g.setColor(Color.BLACK);
        g.fillOval(currLocation.getX(), currLocation.getY(),10,10);  
        g.setColor(Color.BLACK);
//        g.drawRect(12, 40, 20, 50);
        boolean fFlag=true;
        for(SubwayCar i:carList) {
        	i.drawMe(g,currLocation);
        //	g.setColor(Color.black);
        //	g.drawOval(currLocation.getX(), currLocation.getY(),15,15);
        //    g.fillOval(currLocation.getX(), currLocation.getY(),15,15);
        }	
//    	g.drawOval(50,50,50,50);
//    	g.setColor(Color.PINK);
//      g.fillOval(50,50,50,50);
    }
    public void moveTrain(){
    	//if (moving) {
    		if (currTrack.stopSignal.getLocA().getX() == currLocation.getX() && currTrack.stopSignal.getLocA().getY() == currLocation.getY() ) {
	    		String nextTrack = currTrack.stopSignal.getName().substring(1) ;
	    		nextTrack = 'T' + nextTrack;
	    		for (Track i : route.getTrackNodes()) {
	    			//System.out.println(nextTrack);
	    			//System.out.println(i.getName());
	    			
	    			if (i.getName().equals(nextTrack))
	    			{
	    				currTrack = i;
	    				System.out.println("Arrived at Signal " + i.startSignal.getName());
	    			}
	    		}
	    		currLocation.setX(currTrack.startSignal.getLocA().getX());
	    	}
    		if(currTrack.getDirection().equals("L")) {
    			currLocation.setX(currLocation.getX()-1);
    		}
	    	else if(currTrack.getDirection()=="R") {
				currLocation.setX(currLocation.getX()+1);
			}
			else if(currTrack.getDirection().equals("U")) {
				currLocation.setY(currLocation.getY()-1);
			}
			else if(currTrack.getDirection()=="D") {
				currLocation.setY(currLocation.getY()+1);
			}
			else {
				currLocation.setX(currLocation.getX()+1);
			}
    		
//    		else if(currTrack.direction.equals("R")) {
//    			currLocation.setX(currLocation.getX()+1);
//    		}
//    		else if(currTrack.direction.equals("U")) {
//    			currLocation.setY(currLocation.getY()-1);
//    		}
//    		else if(currTrack.direction.equals("D")){
//    			currLocation.setY(currLocation.getY()+1);
//    		}
//    		else {
//    			currLocation.setX(currLocation.getX()+1);
//    		}
    	}
   // }	
}
