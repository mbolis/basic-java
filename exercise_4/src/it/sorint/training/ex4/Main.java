package it.sorint.training.ex4;

import it.sorint.training.IOUtil;

import java.util.LinkedList;
import java.util.List;

public class Main {

    /*
     * Let's implement a multiple choice program:
     * 1. first off ask the user her name. halt if the name is invalid
     * 2. then start a loop. the program will ask the user to select an option
     * 3. halt the program when option `q` is selected or stdin is closed
     * 4. (optional) if any operations were performed, print a summary of the results 
     */

    public static void main(String[] args) {
        
        System.out.print("What's your name? ");
        String name = IOUtil.readln();
        // check that name is not null and not empty (only whitespace)

        // now let's loop until the user selects to quit
        {

            /*
             * Get input from the user.
             * 
             * options:
             * `a` or `add` -> perform an addition
             * `s` or `sub` -> perform a subtraction
             * `m` or `mult` -> perform a multiplication
             * `d` or `div` -> perform a division
             * `q` or `quit` -> leave the program
             * 
             * REMEMBER to handle invalid input!
             */

            /* 
             * Check the user's input.
             * 
             * - if null, the stream was closed, so terminate
             * - check all the above options. if necessary ask for more input
             */

            // print the result

            // (optional) add the result to the history : addToHistory(left, op, right, result)

        }

        // (optional) print out all history entries (getHistory()) with a for loop
    }

    private static double string2number(String string) {
        return Double.parseDouble(string);
    }

    private static List<String> history = new LinkedList<>();

    /**
     * Store a history entry.
     * 
     * @param leftOperand the left operand of the operation
     * @param op the operator, written as a single character
     * @param rightOperand the right operand of the operation
     * @param result the result of the operation
     */
    private static void addToHistory(double leftOperand, char op, double rightOperand, double result) {
        history.add(String.format("%s %c %s = %s", leftOperand, op, rightOperand, result));
    }

    /**
     * Get an array containing all history entries.
     * 
     * @return all history entries as String, in the format:<br>
     *         <i>leftOp</i> <i>OP</i> <i>rightOp</i> = <i>result</i>
     */
    private static String[] getHistory() {
        return history.toArray(new String[history.size()]);
    }
}
