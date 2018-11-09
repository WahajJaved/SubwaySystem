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
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.HashMap;

public class ReadData {
    
    
    private Scanner fileScanner;
    HashMaps hm = new HashMaps();
    
    /**
     * opens the text file to enable reading data
     * @param text 
     * @return - none
     */
    public void openFile(String text){
        try{
            File datafile = new File(text);
            fileScanner = new Scanner(datafile);
        }
        catch(Exception e){
            System.out.print("File Error");
            e.printStackTrace();
        }
    }
    
    
    /**
     * reads the Definition text file 
     * @return SubwayCarDef[] 
     */
    public SubwayCarDef[] ReadDef(String text){
        openFile(text);
        SubwayCarDef[] temp = new SubwayCarDef[3];
        int counter = 0;
        while(fileScanner.hasNext()){
            String line = fileScanner.nextLine();
            String[] p = line.split(",");
            SubwayCarDef scd = new SubwayCarDef(p[0],Integer.parseInt(p[1]));
            //hm.addDef(p[0], scd);
            hm.addDef(p[0], scd);
            temp[counter] = scd;
            counter++;
        } 
        
        SubwayCarDef[] def= new SubwayCarDef[counter];
        for(int i=0 ; i<counter ; i++){
             def[i] = temp[i] ;
        } 
        closeFile();
        return def;
    }
 
    /**
     * reads the SubwayCar text file 
     * @return SubwayCar[] 
     */
    public SubwayCar[] ReadSubwayCar(String text){
        openFile(text);
        SubwayCar[] temp = new SubwayCar[50];
        int counter = 0;
        Utilities u = new Utilities();
        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] p = line.split(",");
            SubwayCar subwayCar= new SubwayCar(Integer.parseInt(p[0]), u.findSubwayCarDef(p[1], hm.getDef()),Integer.parseInt(p[2]));
            hm.addCar(p[0], subwayCar);
            temp[counter] = subwayCar;
            counter++;
        } 
        SubwayCar[] car= new SubwayCar[counter];
        for(int i=0 ; i<counter ; i++){
             car[i] = temp[i] ;
        }
        closeFile();
        return car;
    }
    
    /**
     * reads the subway train file
     * @param sc
     * @return 
     */
    public SubwayTrain[] ReadSubwayTrain(String text ){
        openFile(text);
        SubwayTrain[] temp = new SubwayTrain[50];
        int counter = 0;
        Utilities u = new Utilities();
        while(fileScanner.hasNext()){
            String line = fileScanner.nextLine();
            String[] p = line.split(",");
            ArrayList<SubwayCar> carNo = new ArrayList<>();
            int i =1;
            while( i < p.length){
                carNo.add(u.findSubwayCar(p[i], hm.getCar())); 
                i++;
            }
            SubwayTrain tr = new SubwayTrain(p[0],carNo);
            hm.addTrain(p[0], tr);
            temp[counter] = tr;
            counter++;
            
        }
        SubwayTrain[] train= new SubwayTrain[counter];
        for(int i=0 ; i<counter ; i++){
             train[i] = temp[i] ;
        }
        closeFile();
        return train ;
    }
    
    /**
     * reads the boarding queue file
     * @param train
     * @return 
     */
    public BoardingQueue[] ReadQueue(String text){
        openFile(text);
        BoardingQueue[] temp = new BoardingQueue[50];
        int counter = 0;
        Utilities u = new Utilities();
        while(fileScanner.hasNext()){
            String line = fileScanner.nextLine();
            String[] p = line.split("	");
            BoardingQueue bq = new BoardingQueue(p[0], u.findSubwayTrainCode(p[1] , hm.getTrain()));
            hm.addQueue(p[0], bq);
            temp[counter] = bq;
            counter++;
        }
        BoardingQueue[] boarding = new BoardingQueue[counter];
        for(int i=0 ; i<counter ; i++){
             boarding[i] = temp[i] ;
        }
        closeFile();
        return boarding;
    
    }
    public Signal[] ReadSignals(String text) {
        openFile(text);
        Signal [] signals = new Signal[50];
        Utilities u = new Utilities();
        int counter = 0;
        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] p = line.split(",");
            Location temp = new Location(Integer.parseInt(p[1]),Integer.parseInt(p[2]));
            signals[counter] = new Signal(temp,p[0]);
            counter++;
        }
        return signals;
    }
    public Track[] ReadTracks(String text, Signal [] signals)
    {
        openFile(text);
        Track [] tracks = new Track[50];
        Utilities u = new Utilities();
        int counter = 0;
        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] p = line.split(",");
            Signal sig1=null,sig2=null;
            for (int i = 0;i < 50;i++)
            {
                if (signals[i] != null)
                {    
                    if (signals[i].getName().equals(p[1])) {
                        sig1 = signals[i];
                    }
                    else if (signals[i].getName().equals(p[2])) {
                        sig2 = signals[i]; 
                    }
                }
            }
            tracks[counter] = new Track(sig1,sig2,p[0],p[3]);
            counter++;
        }
        return tracks;
    }
    

    /**
     * reads the passenger file
     * @return
     */
    public Passenger[] ReadPassengers(String text){
        openFile(text);
        Passenger[] temp = new  Passenger[50];
        int counter = 0;
        Utilities u = new Utilities();
        while(fileScanner.hasNext()){
            String line = fileScanner.nextLine();
            String[] p = line.split("	");
            Passenger pass = new Passenger(p[0], u.findBoardingQueue(p[1], hm.getQueue()) , p[2] , null , 0); 
            hm.addPassenger(p[0], pass);
            temp[counter] = pass;
            counter++;
        }
        Passenger[] passenger = new Passenger[counter];
        for(int i=0 ; i<counter ; i++){
             passenger[i] = temp[i] ;
        }
        closeFile();
        return passenger;  
        
    }
        
    /**
     * closes the text files after reading it
     * @return - none
     */
    public void closeFile(){
        if (fileScanner!=null){
            fileScanner.close();
        }
    }
}
