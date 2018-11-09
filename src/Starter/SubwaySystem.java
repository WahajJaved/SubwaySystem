package Starter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author student
 */
public class Test60085030 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Location L1 = new Location(150, 200);
		Signal x = new Signal(L1, "S01");
		Location L2 = new Location(150, 200);
		Signal y = new Signal(L2, "S02");
		Track t = new Track(x, y, "T01", "West");
                
                      ReadData r = new ReadData();
        SubwayCarDef[] def = r.ReadDef("SubwayCarDef.txt");
        SubwayCar[] sc = r.ReadSubwayCar("SubwayCar.txt");
        SubwayTrain[] train = r.ReadSubwayTrain("SubwayTrain.txt");
        printData(def , sc , train);
        
        Signal[] signals = r.ReadSignals("Signal.txt");
        Track[] tracks = r.ReadTracks("Track.txt",signals);
        
        SubwayStation[] Station = new SubwayStation[50] ;
        Station[0] = new SubwayStation(signals[15],signals[16],"OneAndOnlyStation"); 
        
        
        BoardingQueue[] bq = r.ReadQueue("BoardingQueue.txt");
        Passenger[] passenger = r.ReadPassengers("Passenger.txt");
        Processing processing = new Processing();
        Passenger[] boarding = processing.Boarding( passenger, train);
        printProcess(boarding , train);
        
        DataProcessing dp = new DataProcessing();
        dp.deleteAllBoardings();
        dp.addPassengerToDataBase(boarding);
        dp.printBoardingFromDataBase(sc);
        
        printPassengerList(train);
        MFrame mainFrame = new MFrame(getAllItems(signals,tracks,Station),train);
	}
        
    private static MasterG[] getAllItems(Signal [] signals , Track[] tracks,SubwayStation[] Stations)
    {
        MasterG[] elements = new MasterG[100];
        int counter = 0;
        for (int i = 0; i < 50; i++) {
            if (signals[i] != null) {
                elements[i] = signals[i];
                counter++;
            }
        }
        for (int i = 0; i < 50; i++) {
            if (tracks[i] != null){
                elements[counter] = tracks[i];
                counter++;
            }
        }
        for (int i = 0; i < 50; i++) {
            if (Stations[i] != null){
                elements[counter] = Stations[i];
                counter++;
            }
        }
        
        return elements;
    }
    /**
     * prints the subwayCar & definition array
     * @param def 
     * @param subCar
     * @return - none
     */
    public static void printData(SubwayCarDef[] def, SubwayCar[] sc , SubwayTrain[] train){
        
        System.out.println("Subway Car Definition");
        System.out.printf("%-10s%10s %n","Id","Max");
        for(int i = 0 ; i< def.length ; i++ ){
            System.out.println(def[i]);
        }
        System.out.println();
        
        
        System.out.println("Subway Car");
        System.out.printf("%-10s%-10s%10s %n","Car No","Type","Current");
        for(int i = 0 ; i< sc.length ; i++ ){                                                 
            System.out.printf("%-10d%-10s%10d %n", sc[i].getCarNo() , sc[i].getCarType().getCarID() , sc[i].getCurrent());                                   
        }        
        System.out.println();
        
        
       System.out.println("Subway Train");
        System.out.printf("%-10s%-10s%-10s%10s %n","Train","Car No","Type","Current");
        for(int i = 0 ; i< train.length ; i++ ){
            for(int k=0 ; k< train[i].getCarNo().size() ; k++){                                                        
            //    System.out.printf("%-10s%-10d%-10s%-10d %n",train[i].getTrainCode(),
            //    train[i].getCarNo().get(k).getCarNo() ,train[i].getCarNo().get(k).getCarType().getCarID() , train[i].getCarNo().get(k).getCurrent() );               
            }
        }
        System.out.println();
        
        
                  
    }
    
    /**
     * prints the passenger array and subway car array after processing 
     * @param p
     * @param sc 
     */
    public static void printProcess(Passenger[] boarding , SubwayTrain[] train){
 
        System.out.println("Boarding Log");
        System.out.printf("%-10s%-10s%-10s %n", "Passenger","Car No","Result");
        for(int i = 0 ; i<= boarding.length-1 ; i++ ){
            System.out.printf("%-10s%-10d%-10s %n",boarding[i].getName() , boarding[i].getCar() , boarding[i].getStatus());
        } 
        System.out.println();
       
       
        System.out.println("Subway Train");
        System.out.printf("%-10s%-10s%-10s%10s %n","Train","Car No","Type","Current");
        for(int i = 0 ; i< train.length ; i++ ){
            for(int k=0 ; k< train[i].getCarNo().size() ; k++){                                                        
             //   System.out.printf("%-10s%-10d%-10s%-10d %n",train[i].getTrainCode(),
            //    train[i].getCarNo().get(k).getCarNo() ,train[i].getCarNo().get(k).getCarType().getCarID() , train[i].getCarNo().get(k).getCurrent() );               
            }
        }
        System.out.println();
    }
    
    /**
     * Prints a passenger report using train array
     * @param train 
     */
    public static void printPassengerList(SubwayTrain[] train){
//        System.out.println();
//        System.out.println("Passenger List");
//        System.out.printf("%-10s%-10s%-10s%10s%10s %n", "Train" ,"Car", "Passenger" , "Transit" , "Mobile");
//        for(int i = 0 ; i< train.length ; i++){
//            System.out.printf("%-10s %n",train[i].getTrainCode()); 
//            for(int k=0 ; k< train[i].getCarNo().size() ; k++){                                                        
//               //System.out.printf("\t  %-10s%n",train[i].getCarNo().get(k).getCarNo());
////                for(int j = 0 ; j < train[i].getCarNo().get(k).getPassengerArray().size() ; j++){
////                    System.out.printf("\t\t    %-10s   %-10s %-10s%n", train[i].getCarNo().get(k).getPassengerArray().get(j).getName() ,
////                            train[i].getCarNo().get(k).getPassengerArray().get(j).getCard().getCard(), 
////                            train[i].getCarNo().get(k).getPassengerArray().get(j).getMobile());
//                }
//            }
//        }
//        
        System.out.println();
        System.out.println();
        
    }
    

}
