package it.sorint.training.ex5;

import java.util.Random;

public class Main {

    /*
     * Let's implement a program that:
     * 1. generates a large array of random integers
     * 2. calculates minimum, maximum, sum and mean
     * 3. prints out all this interesting information
     */

    /*
     * Arguments:
     * 0: number of values to generate
     * 1: (optional) minimum value - default = 0
     * 2: (optional) maximum value - default = 100
     */
    public static void main(String[] args) {

        int length;
        // get passed parameters

        // create an array and populate it with random values (use a for loop and random(min, max))

        int min = Integer.MAX_VALUE, max = 0, sum;
        // loop all values
        {
            // update sum
            // check if minimum or maximum
        }

        double mean;
        // compute mean

        System.out.println(String.format("Statistics computed over %d values: min=%d, max=%d, sum=%d, mean=%f", length,
                min, max, sum, mean));
    }

    private static int random(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}
