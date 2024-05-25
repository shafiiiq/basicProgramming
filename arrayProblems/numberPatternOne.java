package arrayProblems;

import java.util.Scanner;

public class numberPatternOne {
    public static void main(String[] args) {
        int limit;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the limit lines to print stars");
        limit = obj.nextInt();

        for (int i = 1; i <= limit; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}

// sample output 
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
// 1 2 3 4 5 6 
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 8 
// 1 2 3 4 5 6 7 8 9 
// 1 2 3 4 5 6 7 8 9 10 