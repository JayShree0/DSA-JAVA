package patternPrinting.specialPatterns;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // for odd rows
                if (i % 2 != 0) {
                    // for odd cols in odd rows
                    if (j % 2 != 0) {
                        System.out.print("1" + " ");
                    }
                    // for even cols in odd rows
                    else {
                        System.out.print("0" + " ");
                    }
                }
                // for even rows
                else { // i % 2 == 0
                    if (j % 2 != 0) {
                        System.out.print("0" + " ");
                    } else {
                        System.out.print("1" + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
/*
// 2nd method
        // agr i bhi odd hai aur j bhi odd hai to 1 print hoga
        // agr i bhi even hai aur j bhi even hai to 1 print hoga
        // else 0 print hoga
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else{
                    System.out.println(0 + " ");
                }
            }
            System.out.println();
        }
 */
/*
Enter n : 5
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 */
