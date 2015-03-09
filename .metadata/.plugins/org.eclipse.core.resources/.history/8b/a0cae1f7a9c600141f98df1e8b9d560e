package it.sorint.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOUtil {

    private static BufferedReader rd;

    public static String readln() {
        if (rd == null) {
            rd = new BufferedReader(new InputStreamReader(System.in));
        }
        try {
            return rd.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
