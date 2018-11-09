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

public class Processing {
 
    /**
     * performs the boarding procedure
     * 
     * @param passenger
     * @param train
     * @return String[] 
     */
    public Passenger[] Boarding(Passenger[] passenger  , SubwayTrain[] train){
        
        
        for(int i=0 ; i< passenger.length ; i++){
            
            BoardingQueue bq = passenger[i].getCard();  

            for(int k =0 ; k < train.length ; k++){
                                
                if(bq.getTCode().equals(train[k])){
//                                       
//                    for(int j=0 ; j < train[k].getCarNo().size() ; j++ ){
//                            
//                        if(train[k].getCarNo().get(j).getCurrent() < train[k].getCarNo().get(j).getCarType().getMaxPassenger() ){
//                           train[k].getCarNo().get(j).AddCurrent();
//                           passenger[i].setStatus("Succsess");
//                           passenger[i].setCar(train[k].getCarNo().get(j).getCarNo());
//                           train[k].getCarNo().get(j).addPassenger(passenger[i]);
//                           break ;
//                        }
//                        else if(j == train[k].getCarNo().size()-1 ){
//                            passenger[i].setStatus("Fail");
//                        }
//                    }
                }                
            }    
        }
       
        return passenger;
    }
    
}
