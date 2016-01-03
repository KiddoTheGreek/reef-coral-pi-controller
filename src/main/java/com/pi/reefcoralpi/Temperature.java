/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pi.reefcoralpi;

 
/**
 * @author pi
 *
 */
public class Temperature {
    private String date; 
    private float waterTemp;
    private float roomTemp;
    private long dateMilli;
    private int time;
    public Temperature() {
    }

    public Temperature(String date, float temp1, float temp2) {
        this.date = date;
        this.roomTemp = temp1;
        this.waterTemp = temp2;
    }
    
 
    public String getDate() {
        return date;
    }
 
    public void setDate(String date) {
        this.date = date;
    }
    
    public float getRoomTemp() {
        return roomTemp;
    }
 
    public void setRoomTemp(float temp) {
        this.roomTemp = temp;
    }
    
    public float getWaterTemp() {
        return waterTemp;
    }
 
    public void setWaterTemp(float temp) {
        this.waterTemp= temp;
    }
 
     
    @Override
    public String toString(){
        return "datetime="+date+", roomtemp="+roomTemp+", watertemp="+ waterTemp;
    }

    public void setDateMilli(long time) {
        dateMilli = time;
    }
    
    public long getDateMilli(){
        return dateMilli;
    }

    public void setTime(String time) {
        this.time = Integer.parseInt(time);
    }
    
    public int getTime(){
        return time;
    }
}
