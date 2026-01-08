package patternPrinting.compositePattern;

import java.util.Scanner;

public class numberPyramidPalindrome {
    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Input: number of rows
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // Outer loop → controls number of rows
        for (int i = 1; i <= n; i++) {   // i = current row number

            // Printing leading spaces for pyramid shape
            // Spaces decrease as row number increases
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Printing increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Printing decreasing numbers from (i-1) to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}

/*
Enter n : 4
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
 */