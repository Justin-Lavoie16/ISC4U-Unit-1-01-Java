/*
 * much logs a truck can carry if the max weight
 * it can carry is 1100 kg and each log is 20 kg/m
 * *
 * @author  Justin Lavoie
 * @version 1.0
 * @since   2024-09-20
 */

import java.util.Scanner;

/**
 * Max weight per is in kg/m and max weight is in kg.
*
final class Logprog {

    static final double WEIGHTPERLOG = 20;
    static final double MAXWEIGHT = 1100;

    private Logprog() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static void main(final String[] args) {
        // Get inputs
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the length of logs (m) (0.25, 0.5, or 1): ");
        // Calculations
        final float LogLength = scanner.nextFloat();
        // Output
        System.out.println("The truck can carry this many logs: "
            + MAXWEIGHT / (WEIGHTPERLOG * LogLength));

        System.out.println("\nDone.");
    }

}
