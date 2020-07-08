/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytime;

/**
 *
 * @author 18660
 */
public class TestMyTime {
    public static void main(String[] args) {
        // TODO code application logic here
        MyTime obj = new MyTime();
        obj.setTime(12, 57, 30);
        System.out.println(obj);
        System.out.println("//nextSecond()");
        obj.nextSecond();
        System.out.println(obj);
        System.out.println("//nextHour()");
        obj.nextHour();
        System.out.println(obj);
        System.out.println("//nextMinute()");
        obj.nextMinute();
        System.out.println(obj);
        System.out.println("//previousSecond()");
        obj.previousSecond();
        System.out.println(obj);
        System.out.println("//previousHour()");
        obj.previousHour();
        System.out.println(obj);;
        
        
    }
    
}
