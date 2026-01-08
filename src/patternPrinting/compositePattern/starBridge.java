package patternPrinting.compositePattern;

import java.util.Scanner;

public class starBridge {
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Asking user to enter number of rows
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // Printing the first row (full stars)
        // Total stars = 2*n - 1
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println(); // move to next line

        // m represents remaining rows after first row
        int m = n - 1;

        // Loop for remaining rows
        for (int i = 1; i <= m; i++) {

            // Left side stars
            for (int j = 1; j <= m + 1 - i; j++) {
                System.out.print("* ");
            }

            // Middle spaces (creates the gap/bridge)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }

            // Right side stars
            for (int j = 1; j <= m + 1 - i; j++) {
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}



/*

Enter n : 4
* * * * * * *
* * *   * * *
* *       * *
*           *
 */