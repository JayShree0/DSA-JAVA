package patternPrinting.squares;

import java.util.Scanner;

public class smallAlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++) {
                System.out.print((char)(j+96)+ " ");
            }
            System.out.println();
        }
    }
}

/*
Enter n : 4
a b c d
a b c d
a b c d
a b c d
 */