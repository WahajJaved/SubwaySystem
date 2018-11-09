/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starter;


/**
 *
 * @author student
 */

import java.util.HashMap;
public class HashMaps {
    
    private HashMap< String , SubwayCarDef> def = new HashMap< String , SubwayCarDef>();
    private HashMap< String , SubwayCar> car = new HashMap< String , SubwayCar>();
    private HashMap< String , SubwayTrain> train = new HashMap< String , SubwayTrain>();
    private HashMap< String , Passenger> passenger = new HashMap< String , Passenger>();
    private HashMap< String , BoardingQueue> queue = new HashMap< String , BoardingQueue>();
    
    /**
     * HashMaps Constructor
     */
    public HashMaps(){
        this.def = new HashMap<>();
        this.car = new HashMap<>();
        this.train = new HashMap<>();
        this.passenger = new HashMap<>();
        this.queue = new HashMap<>();
    }
    
    /*
    add the key and value of the subwayCarDef
    */
    public void addDef( String key , SubwayCarDef value ){
        def.put(key , value);
    }
    
    /*
    add the key and value of the SubwayCar
    */
    public void addCar( String key , SubwayCar value){
        car.put(key, value);
    }
    
    /*
    add the key and value of the SubwayTrain
    */
    public void addTrain( String key , SubwayTrain value){
        train.put(key, value);
    }
    
    /*
    add the key and value of the Passenger
    */
    public void addPassenger( String key , Passenger value){
        passenger.put(key , value);
    }
    
    /*
    add the key and value of the Queue
    */
    public void addQueue( String key , BoardingQueue value){
        queue.put(key, value);
    }
    
    /**
     * return the SubwayCarDef HashMap
     * @return 
     */
    public HashMap<String, SubwayCarDef> getDef(){
        return def;
    }
    
    /**
     * return the SubwayCar HashMap
     * @return 
     */
    public HashMap<String, SubwayCar> getCar(){
        return car;
    }
    
    /**
     * return the SubwayTrain HashMap
     * @return 
     */
    public HashMap<String, SubwayTrain> getTrain(){
        return train;
    }
    
    /**
     * return the Passenger HashMap
     * @return 
     */
    public HashMap<String, Passenger> getPassenger(){
        return passenger;
    }
    
    /**
     * return the Queue HashMap
     * @return 
     */
    public HashMap<String, BoardingQueue> getQueue(){
        return queue;
    }

}

