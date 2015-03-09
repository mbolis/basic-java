package it.sorint.training.ex8;

import java.awt.Point;
import java.util.List;

public class Main {

    private static class Operations {

    }

    public static void main(String[] args) {
        Operations operations = new Operations();
        
        
        int[] numbers = { 3, 5, 9, 1, 7, 6, 2, 0, 4, 8 };
        
        // java.util.Arrays

        /*
         *  Method `accept` should sort and print an array of integers (int[])
         */
        operations.accept(numbers);
        
        
        List<Point> triangle = ; // create list of 3 points
        
        // java.lang.Math
        
        /* 
         * Method `accept` should compute the perimeter of a polygon (List<Point>):
         * 1. start from the first point
         * 2. compute the Euclidean distance of each subsequent pair of points
         * 3. add the distance between the first and last point
         * 4. print the sum of all distances
         */
        operations.accept(triangle);
        
    }
}
