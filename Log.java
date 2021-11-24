/*
* This program calculates the total amount of logs
*
* @author  Ahmad
* @version 1.0
* @since   2021-11-19
*/

import java.util.Scanner;

/**
*  Calculates the number of logs needed to fill a truck.
*/

final class Log {
    /**
    * Density of logs, in kg/m.
    */
    public static final double DENSITY = 20.0;

    /**
    * Density of logs, in kg/m.
    */
    public static final double MAX_LOAD = 1100;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Logs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    *
    */

    public static void main(final String[] args) {

        // variables
        final double amountLogs;

        final Scanner myObj = new Scanner(System.in);
        // input

        System.out.println("Enter log length (0.25, 0.5 or 1): ");
        // stores float in length

        final float length = myObj.nextFloat();
        // process

        amountLogs = (MAX_LOAD / length) / DENSITY;

        // output
        System.out.println("The truck will be able to take " + amountLogs + " logs that are "
            + length + " meter(s) in length.");
        System.out.println("\nDone");
    }
}
