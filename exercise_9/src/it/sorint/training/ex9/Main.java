package it.sorint.training.ex9;

import it.sorint.training.IOUtil;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Online Virtual Storage.");
        while (true) {
            String selection = prompt();
            switch (selection) {
            case "Q":
                System.out.println("Good bye!");
                return;
            }
        }
    }

    public static String prompt() {
        System.out.println("\n  S - Store an item");
        System.out.println("  L - List stored items");
        System.out.println("  U - Update a stored item");
        System.out.println("  R - Remove a stored item");

        System.out.println("\n  Q - Quit");

        String selection;
        do {
            System.out.print("\nPlease make your selection : ");
            selection = IOUtil.readln();
            selection = selection != null ? selection.toUpperCase() : "Q";
        } while (selection.isEmpty() || !"SLURQ".contains(selection));

        return selection;
    }
}
