/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author ericbeaudet
 */
public class Circle {

    public static double getArea(double radius) {
        return Math.PI * radius * radius;

    }
    
    public static double getDiameter( double radius) {
        return radius + radius;
    }
    
    public static double getCircumference( double radius) {
        return Math.PI * radius * 2.0;
    }

}
