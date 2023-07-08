package com.epam.rd.qa.classes;

import java.util.Objects;

public class Rectangle {

    //Private real fields sideA and sideB (sides А and В of the rectangle).
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b){//Constructor with two real
        // parameters a and b to specify the sides of the rectangle.
        sideA = a;
        sideB = b;

    }
    //Constructor with a real parameter side to specify the same values for sides A and B of the rectangle.
/*    public void sideA(double sideA){ //Constructor with a real parameter side to specify the same values for sides A and B of the rectangle.
        this.sideA = 10;
    }
    public void sideB(double sideB){ //Constructor with a real parameter side to specify the same values for sides A and B of the rectangle.
        this.sideB = 20;
    }*/

    public Rectangle(double side) {
        sideA = side;
        sideB = side;
    }

    //Constructor without parameters (initializes side A with 4 and side B with 3).
    public Rectangle(){
        sideA = 4;
        sideB = 3;
    }

    //Method getSideA, returns value of the side А.

    public double getSideA(){
        return sideA;
    }

    //Method getSideВ, returns value of the side В.
    public double getSideB(){
        return sideB;
    }
    //Method area, calculates and returning the area value.
    public double area(){
        return sideA * sideB;
    }
    //Method perimeter, calculates and returning the perimeter value.
    public double perimeter(){
        return sideA * 2 + sideB * 2;
    }

    //Method isSquare, checks whether current rectangle is shape square or not.
    // Returns true if the shape is square and false in another case.

    public boolean isSquare(){
        return sideA == sideB;
        /*if (sideA == sideB){
            return true;
        }
        else {
            return false;
        }*/
    }

    //Method replaceSides, swaps rectangle sides.
    public void replaceSides(){
        double temp = sideA;
        sideA = sideB;
        sideB = temp;
    }

    //Override equals and hashCode methods.

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.sideA, sideA) == 0 &&
                Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    //Override toString method (optional, not tested).

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
