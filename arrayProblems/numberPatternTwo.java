package arrayProblems;

import java.util.Scanner;

public class numberPatternTwo {
    public static void main(String[] args) {
        int limit;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the limit lines to print stars");
        limit = obj.nextInt();
        int number = 1;

        for (int i = 1; i <= limit; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                if (i <= 4) {
                    System.out.print(" ");
                }
                number++;
            }
            System.out.println("");
        }
    }
}

// sample output
// 1  
// 2  3  
// 4  5  6  
// 7  8  9  10  
// 11 12 13 14 15 
// 16 17 18 19 20 21 
// 22 23 24 25 26 27 28 
// 29 30 31 32 33 34 35 36 
// 37 38 39 40 41 42 43 44 45 