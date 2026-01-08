package patternPrinting.compositePattern;

import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Input: number of rows for the diamond
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // ---------------- UPPER PYRAMID ----------------
        // This loop prints the top half of the diamond
        for (int i = 1; i <= n; i++) {   // i = current row

            // Printing leading spaces to center the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Printing stars (odd count: 1, 3, 5, ...)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }

        // Reduce n to avoid repeating the middle row
        n--;

        // ---------------- LOWER PYRAMID ----------------
        // This loop prints the bottom half of the diamond
        for (int i = 1; i <= n; i++) {   // i = current row

            // Printing leading spaces (increase each row)
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            // Printing stars on left side
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }

            // Printing stars on right side
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}


/*
2nd method


package patternPrinting.compositePattern;

import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // ---------- UPPER DIAMOND ----------
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // ---------- LOWER DIAMOND ----------
        for (int i = n - 1; i >= 1; i--) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

 */