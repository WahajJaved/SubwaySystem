/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starter;

/**
 *
 * @author Mani
 */
public class SubwayCarDef {
    
    private String carID;
    private int maxPassenger;
    
    /**
     * constructor for the SubwayCar objects
     * @param carID
     * @param maxPassenger 
     */
    public SubwayCarDef(String carID ,int maxPassenger){
        
        this.carID = carID;
        this.maxPassenger= maxPassenger;   
    }
    
    /**
     * to get the car ID
     * @return car ID
     */
    public String getCarID(){
        return carID;
    }
    
    /**
     * to get the max passengers
     * @return maxPassenger
     */
    public int getMaxPassenger(){
        return maxPassenger;
    }
    
    /**
     * to format the data into specific format while printing
     * @return String.format
     */
    public String toString(){
        return String.format( "%-10s%10d", carID , maxPassenger);
    }
}
