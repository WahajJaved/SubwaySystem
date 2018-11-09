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
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class SubwayCar extends CarG
{
   
    private int carNo;
    private SubwayCarDef carType;
    private ArrayList<Passenger> passengers;
    private int current;
    
    
   
    /**constructor for the SubwayCar objects
     * 
     * @param carNo for car the number
     * @param carType for the type of the car
     * @param current for the current number of passengers
     */
    public SubwayCar(int carNo , SubwayCarDef carType , int current){
        
        super();
        this.carNo = carNo;
        this.carType = carType;
        this.current = current;
        passengers = new ArrayList<>();
    }
    
    /**
     * to get the carNo
     * @return car number 
     */
    public int  getCarNo(){
        return carNo;
    }
    
   
    
    /**
     * to get the carType
     * @return carType
     */
    public SubwayCarDef  getCarType(){
        return carType;
    }
    
    /**
     * to get the current number of passengers
     * @return current
     */
    public int getCurrent(){
        return current;
    }
    /**
     * adds one to the current customer each time a passenger 
     * get in a car
     */
    public void AddCurrent(){
        current ++;    
    }
    /**
     * returns the passenger arrayList
     * @return 
     */
    public ArrayList<Passenger> getPassengerArray(){
        return passengers;
    }
    /**
     * adds a passenger to the passenger arrayList
     * @param p 
     */
    public void addPassenger(Passenger p){
        passengers.add(p);
    }
    
    
    /**
     * to format the data while printing to specific format
     * @return String.format
    */
    public String toString(){
        return String.format("%-10d%-10s%10d",carNo,carType,current);
    }
    
    public Location getCarLocation(){
        return currLocation;
    }
    public Color getCarColor(){
        if (this.current > carType.getMaxPassenger() - 2  ){
            return Color.RED ;//set red color as car is full
        } 
        else if (this.current == 0){
            
            return Color.white;//set to white
        }
        else  {
            return Color.BLUE;//set to Blue 
        }
    }
    public void drawMe(Graphics g,Location curr){
    	
    	g.drawOval(curr.getX(), currLocation.getY(),50,50);
    	g.setColor(Color.PINK);
        g.fillOval(currLocation.getX(), currLocation.getY(),50,50);  
//    	g.drawOval(50,50,50,50);
//    	g.setColor(Color.PINK);
//        g.fillOval(50,50,50,50);  
    }
}
