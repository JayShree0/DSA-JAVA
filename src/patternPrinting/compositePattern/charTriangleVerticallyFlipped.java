package patternPrinting.compositePattern;

import java.util.Scanner;

public class charTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){ // rows
            for(int j = 1; j <= n+1-i-1; j++) { // spaces
                System.out.print(" " + " ");
            }
            for(int j = 1; j <= i; j++) { // stars
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}

/*
2nd method
for(int i = 1; i <= n; i++){
    for(int j = 1; j <= n; j++) {
        if(i + j > n) {
            System.out.print("*" + " ");
        }
        else{
            System.out.print(" " + " ");
        }
    }
    System.out.println();
}
 */
/*

Enter n : 4
      A
    A B
  A B C
A B C D
 */