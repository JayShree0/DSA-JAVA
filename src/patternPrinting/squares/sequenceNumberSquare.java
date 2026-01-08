package patternPrinting.squares;

import java.util.Scanner;

public class sequenceNumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
Enter n : 4
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
 */