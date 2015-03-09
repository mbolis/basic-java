package it.sorint.training.ex3;

import it.sorint.training.IOUtil;

public class Main {

    /*
     * Are you in trouble? http://docs.oracle.com/javase/8/docs/api/index.html
     */

    public static void main(String[] args) {
        System.out.print("Hello, what's your name? ");
        String name = IOUtil.readln();
        if (name == null || name.isEmpty()) {
            System.exit(1);
        }

        // make sure the name has no leading nor trailing whitespace
        
        String upperName = ;
        // print the name all in upper-case
        String lowerName = ;
        // print the name all in lower-case
        
        String[] words = ; // the words in the name, separated by white space
        
        // use this object to compose the output: the name with each word capitalized
        // (first letter upper-case, all the rest lower-case)
        StringBuilder capitalized = ; // a new instance of StringBuilder. Do we know its length in advance??
        for (String word: words) {
            String capWord = ; // capitalize the word
            // add the transformed word to the output
        }
        // print the output
    }
}