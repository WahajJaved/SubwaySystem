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
public class DataProcessing {
     private DataBaseEngine db;
    
    /**
     * constructor of the DataProcessing class
     */
    public DataProcessing()
    {
        db = new DataBaseEngine();
    }
    
    /**
     * prints the data form the database
     * @param sc 
     */
    public void printBoardingFromDataBase (SubwayCar[] sc)
    {
        Passenger[] p = db.getBoardings(sc);
        System.out.println();
        System.out.println("Boadrfing Log from Database");
        System.out.printf("%-10s%-10s%-10s %n", "Passenger","Car No","Result");
        if (p.length > 0 )
           for (int i=0;i<p.length ;i++){
               
              System.out.println( p[i] );
            }   
        
        else{
            System.out.println("Array is Empty");
        }
    }
    
    /**
     * inserts data to the database
     * @param passenger 
     */
    public void addPassengerToDataBase( Passenger[] passenger)
    {
        
        for(int i=0 ; i< passenger.length ; i++){
            db.addPassenger(passenger[i].getName(), passenger[i].getCar(), passenger[i].getStatus() );
        }
        
    }
    
    /**
     * deletes the data for the database
     */
    public void deleteAllBoardings()
    {
        db.deleteAllBoardings();
    }
    
}
