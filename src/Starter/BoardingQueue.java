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
public class BoardingQueue {
    private String card;
    private SubwayTrain TCode;
    
    /**
     * Boarding Queue Constructor
     * @param card
     * @param TCode 
     */
    public BoardingQueue( String card , SubwayTrain TCode){
        this.card = card;
        this.TCode = TCode;
    }
    /**
     * returns the t code
     * @return 
     */
    public SubwayTrain getTCode(){
        return TCode;
    } 
    /**
     * returns card
     * @return 
     */
    public String getCard(){
        return card;
    }
    
}

