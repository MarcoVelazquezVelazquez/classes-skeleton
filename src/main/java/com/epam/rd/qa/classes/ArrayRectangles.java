package com.epam.rd.qa.classes;

import net.bytebuddy.implementation.bytecode.Throw;

import java.util.Arrays;

public class ArrayRectangles {
    //Private field rectangleArray - array of rectangles
    private Rectangle[] rectangleArray;
    //Constructor that creates a null-elements array of the given length.
    // It should throw an IllegalArgumentException if the length is negative or zero.
    public ArrayRectangles(int size) {
        // TODO place your code here
        if (size <= 0) {
            throw new IllegalArgumentException("Length must not be negative or zero");
        }
        rectangleArray = new Rectangle[size];

        throw new UnsupportedOperationException();
    }
    //Constructor that receives an arbitrary number of Rectangle objects or an array of Rectangle objects.
    // It should throw IllegalArgumentException if the array is null or the array length is zero.

    public ArrayRectangles(Rectangle... rectangles) {
        // TODO place your code here

        if (rectangles == null || rectangles.length == 0) {
            throw new IllegalArgumentException("Must not be null or zero");
        }
        /*rectangleArray = rectangles.clone();*/
        rectangleArray = Arrays.copyOf(rectangles, rectangles.length);

        throw new UnsupportedOperationException();
    }
    //Method addRectangle that adds a Rectangle object to the array at the nearest empty place and
    // returns true or false if there is no free space in the array.

    public boolean addRectangle(Rectangle rectangle) {
        // TODO place your code here
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] == null) {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
/*        return false;*/
        throw new UnsupportedOperationException();

    }

    //Method size that returns the actual amount of elements in the array.
    // If addRectangle returns true, then this method should return new amount of elements.
    public int size() {
        // TODO place your code here
            int count = 0;
            for (Rectangle rectangle : rectangleArray) {
                if (rectangle != null) {
                    count++;
                }
            }
            /*return count;*/
            throw new UnsupportedOperationException();
    }

    //Method indexMaxArea that returns the index of the first rectangle with the maximum area in the array.
    public int indexMaxArea() {
        // TODO place your code here
            int maxIndex = 0;
            double maxArea = rectangleArray[0].area();

            for (int i = 1; i < rectangleArray.length; i++) {
                if (rectangleArray[i] != null && rectangleArray[i].area() > maxArea) {
                    maxArea = rectangleArray[i].area();
                    maxIndex = i;
                }
            }

       /*     return maxIndex;*/
        throw new UnsupportedOperationException();
    }

    //Method indexMinPerimeter that returns the index of the first rectangle with the minimum perimeter in the array.

    public int indexMinPerimeter() {
        // TODO place your code here
        int minIndex = 0;
        double minPerimeter = rectangleArray[0].perimeter();

        for (int i = 1; i < rectangleArray.length; i++) {
            if (rectangleArray[i] != null && rectangleArray[i].perimeter() < minPerimeter) {
                minPerimeter = rectangleArray[i].perimeter();
                minIndex = i;
            }
        }

        /*return minIndex;*/
        throw new UnsupportedOperationException();
    }
//Method numberSquares that returns the number of squares in the array.
    public int numberSquares() {
        // TODO place your code here
        int count = 0;
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle != null && rectangle.isSquare()) {
                count++;
            }
        }
        /*return count;*/
        throw new UnsupportedOperationException();
    }
}
