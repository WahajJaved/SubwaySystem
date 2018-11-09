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
public class Utilities {

    
    /**
     * connects the subwayCarDef with the SubwayCar Class
     * @param s
     * @param def
     * @return 
     */                                        
    public SubwayCarDef findSubwayCarDef( String s, HashMap< String ,SubwayCarDef> def ){

        SubwayCarDef cartype = null;
        boolean found = def.containsKey(s);
        if (found){
            cartype = def.get(s);
        }
        return cartype;
    }
    
    
    /**
     * connects between the     SubwayTrain and BoardingQueue class
     * @param s
     * @param subwayCar
     * @return 
     */
    public SubwayTrain findSubwayTrainCode( String s, HashMap<String , SubwayTrain> subwayTrain ){
        
        SubwayTrain train = subwayTrain.get(s) ;
        boolean found = subwayTrain.containsKey(s);
        if (found){
            train = subwayTrain.get(s);
        }
        return train;
    }
    
    /**
     * connects between the Train and subwayCar
     * @param s
     * @param sc
     * @return 
     */
    public SubwayCar findSubwayCar( String s, HashMap<String ,SubwayCar> sc ){

        SubwayCar car = null;
        boolean found = sc.containsKey(s);
        if (found){
            car = sc.get(s);
        }
        return car;
    }
    
    /**
     * connects between the passenger and boarding queue
     * @param s
     * @param bq
     * @return 
     */
    public BoardingQueue findBoardingQueue( String s, HashMap< String , BoardingQueue> bq ){
        
        BoardingQueue boarding =null ;
        boolean found = bq.containsKey(s);
        if (found){
            boarding = bq.get(s);
        }
        return boarding;
    }
    
    
}

