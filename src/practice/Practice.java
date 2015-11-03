/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import javax.swing.JOptionPane;

/**
 *
 * @author ericbeaudet
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        testCircle();
//        testDiameter();
//        testCircumference();
//        testUserCircle();
//        testRectangle();
//        testPerimeter();
        testVolume();
    }

    private static void testCircle() {
        double myRad = Circle.getArea(1.0);
        System.out.println("the answer is " + myRad);

    }

    private static void testDiameter() {
        double myDiameter = Circle.getDiameter(17);
        System.out.println(myDiameter);

    }

    private static void testCircumference() {
        double myCircumference = Circle.getCircumference(8);
        System.out.println("The circumference of the circle is " + myCircumference);

    }

    private static void testUserCircle() {
        double aRadius = Double.valueOf(JOptionPane.showInputDialog("Please enter a radius"));
        System.out.println("Everything I know about your circle: ");
        System.out.println("  Radius = " + aRadius);
        System.out.println("  Diameter = " + Circle.getDiameter(aRadius));
        System.out.println("  circumferance = " + Circle.getCircumference(aRadius));

    }

    private static void testRectangle() {
        double myHeight = Double.valueOf(JOptionPane.showInputDialog("Please enter a height "));
        double myWidth = Double.valueOf(JOptionPane.showInputDialog("Please enter a width "));
        System.out.println(" The height is " + myHeight);
        System.out.println(" The width is " + myWidth);
        double myArea = Rectangle.getArea(myHeight, myWidth);
        System.out.println(" The answer is " + myArea);

    }

    private static void testPerimeter() {
        
    }

    private static void testVolume() {
        double myHeight = Double.valueOf(JOptionPane.showInputDialog("Please enter a height"));
        double myRadius = Double.valueOf(JOptionPane.showInputDialog("Please enter a radius"));
        System.out.println(" The height is " + myHeight);
        System.out.println(" The Radius is " + myRadius);
        double myVolume = Cylinder.getVolume(myRadius, myHeight);
        System.out.println(" The answer is " + myVolume);
        
        
    }

}
