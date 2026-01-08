package patternPrinting.squares;

import java.util.Scanner;

public class sequenceAlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}

/*
Enter n : 4
A A A A
B B B B
C C C C
D D D D
 */