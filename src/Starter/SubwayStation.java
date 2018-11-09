/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starter;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Mani
 */
public class SubwayStation extends MasterG {
    private SubwayTrain currTrain;
    private Signal StartSignal;
    private Signal EndSignal;
    
    public SubwayStation(Signal SSignal,Signal ESignal,String Station_name){
        super(new Location(0,0),null,0,0,Station_name);
        StartSignal = SSignal;
        EndSignal = ESignal;
    }
    public void setTrainOnTrack(SubwayTrain comingTrain){
        currTrain = comingTrain;
    }
    public SubwayTrain getCurrTrainOnStation(){
        return currTrain;
    }
    public void drawMe(Graphics g){
        int startX = ((StartSignal.getDrawX()+EndSignal.getDrawX())/2) - 20;
        int startY = StartSignal.getDrawY()+5;
        
        int endX = startX+40;
        int endY = startY + 20;
        g.drawLine(startX, startY, endX, startY);
        g.drawLine(startX, startY, startX, endY);
        g.drawLine(startX, endY, endX, endY);
        g.drawLine(endX, startY, endX, endY);
        
        
        g.setColor(Color.blue);
        g.drawRect(startX+5, startY+5, 30, 5);
        g.fillRect(startX+5, startY+5, 30, 5);
        
    }
}
