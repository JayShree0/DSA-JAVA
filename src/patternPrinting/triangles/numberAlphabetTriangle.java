package patternPrinting.triangles;

import java.util.Scanner;

public class numberAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                // rows odd hai to number
                if(i % 2 != 0) {
                    System.out.print(j + " ");
                }
                // rows even hai to alphabet
                else{
                    System.out.print((char)(j+64) + " ");
                }
            }
            System.out.println();
        }
    }
}

/*
Enter n : 5
1
A B
1 2 3
A B C D
1 2 3 4 5
 */

/*
Enter n : 6
1
A B
1 2 3
A B C D
1 2 3 4 5
A B C D E F
 */