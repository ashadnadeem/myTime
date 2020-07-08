/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytime;

/**
 *  Ashad Nadeem Mahmudi
 * @author 18660
 */
public class MyTime {

    private int hour;
    private int minute;
    private int second;
    
    public void MyTime(){}
    public void MyTime(int h,int m,int s){
        this.hour = h;
        this.minute = m;
        this.second = s;        
    }
    public void setTime(int h,int m,int s){
        if(h>0 && h<24) this.hour = h;
        else this.hour = 0;
        if(m>0 && m<60) this.minute = m;
        else this.minute = 0;
        if(s>0 && s<60) this.second = s;
        else this.second = 0;    
    }
    
    public void setHour(int h){
        if(h>0 && h<24) this.hour = h;
        else { 
            System.out.println("Invalid Input");
            this.hour = 0;
        }
    }
    public void setMin(int m){
        if(m>0 && m<60) this.minute = m;
        else{ 
            System.out.println("Invalid Input");
            this.minute = 0;
        }
        
    }
    public void setSec(int s){
        if(s>0 && s<60) this.second = s;
        else{ 
            System.out.println("Invalid Input");
            this.second = 0;
        }
        
    }
    
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    
    public String toString(){
        return String.format("%02d:%02d:%02d",this.hour,this.minute,this.second);
    }
    
    public void nextSecond(){
        this.second= this.second + 1;
        if(this.second>59){
            this.second = 0;
            this.nextMinute();   
        }
        
    }
    public void nextMinute(){
        this.minute = this.minute + 1;
        if(this.minute>59){
            this.minute = 0;
            this.nextHour();  
        }
    }
    public void nextHour(){
        this.hour = this.hour + 1;
        if(this.hour>23){
            System.out.println("Next Day");
            this.hour = 0;
             
        }
    }
    
    public void previousSecond(){
        this.second= this.second - 1;
        if(this.second<0){
            this.second = 59;
            this.previousMinute();
            
        }
    }
    public void previousMinute(){
        this.minute = this.minute - 1;
        if(this.minute<0){
            this.minute = 59;
            this.previousHour();
            
        }
    }
    public void previousHour(){
        
        this.hour = this.hour - 1;
        if(this.hour < 0){
            System.out.println("Previos Day");
            this.hour = 23;
               
        }
        
    }
    
}
