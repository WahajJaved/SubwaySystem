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
public class Passenger {
    private String name;
    private BoardingQueue card ;
    private String mobile;
    private String status;
    private int car;

    /**constructor for the Passenger class
     * 
     * @param name
     * @param carNo
     *  
     */
    public Passenger(String name, BoardingQueue card , String mobile ,String status , int car) {
        this.name = name;
        this.card = card;
        this.mobile = mobile;
        this.status = status;
        this.car = car;
    }
    //DB Constructor
    public Passenger(String name , int car , String status){
        
        
    }
    
    /**
     * gets the car
     * @return 
     */
    public int getCar() {
        return car;
    }
    
    /**
     * gets the passenger boarding status
     * @return 
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * sets the passenger car
     * @param s 
     */
    public void setCar(int s) {
         car = s;
    }
    
    /**
     * gets the name of the passenger
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * gets the passenger carNo
     * @return carNo
     */
    public BoardingQueue getCard() {
        return card;
    }
    
    
    /**
     * gets the result of the passenger boarding
     * @return 
     */
    public String getMobile(){
        return mobile;
    }
    
    /**
     * sets the result of the passenger boarding
     * @param s 
     */
    public void setStatus(String s){
        this.status = s;
    }
    
    /**
     * formats the passenger attributes for printing
     * @return 
     */
     
    public String toString(){
        return String.format("%-10s%-10d%-10s",name,car ,status);
    }
    
        
    
}

