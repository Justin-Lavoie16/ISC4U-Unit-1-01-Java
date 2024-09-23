/*
 * much logs a truck can carry if the max weight
 * it can carry is 1100 kg and each log is 20 kg/m
 * *
 * @author  Justin Lavoie
 * @version 1.0
 * @since   2024-09-20
 */

import java.util.Scanner;

/*
 * This program calculates how many logs a truck can carry
 * based on the length of the logs and the truck's weight capacity.
 */
final class CheckLogLength {

    private CheckLogLength() {
        // Prevent instantiation
    }

    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);

        System.out.print("Enter log length (m): ");

        final float length = Float.parseFloat(input.nextLine());
        final float maxLogsCarried = 1100 / (20 * length);

        System.out.println("A truck can carry "
            + maxLogsCarried + " " + length + " meter long logs.");

        input.close();

        System.out.println("\nDone.");
    }
}

// Add a newline here to fix the NewlineAtEndOfFile error
