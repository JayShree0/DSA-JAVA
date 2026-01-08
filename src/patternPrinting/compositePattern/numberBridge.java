package patternPrinting.compositePattern;

import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        //  FIRST LINE
        // Printing numbers from 1 to (2*n - 1)
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i + " ");
        }

        // Reduce n because first line is already printed
        n--;

        // Move to next line
        System.out.println();

        // Outer loop controls the number of rows
        for (int i = 1; i <= n; i++) {

            // Variable to print numbers in sequence
            int a = 1;

            // Left side numbers
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(a + " ");
                a++;
            }

            // Middle spaces (creates the bridge gap)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
                a++;   // number count continues
            }

            // Right side numbers
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(a + " ");
                a++;
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}


/*
Enter n : 4
1 2 3 4 5 6 7
1 2 3   5 6 7
1 2       6 7
1           7
 */