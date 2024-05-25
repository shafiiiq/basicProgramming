package arrayProblems;

import java.util.Scanner;

public class numberPatternThree {
    public static void main(String[] args) {
        int limit;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the limit lines to print stars");
        limit = obj.nextInt();
        int number = 1;

        for (int i = 1; i <= limit; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                if (i <= 9) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            number++;
        }
    }
}

// sample output
// 1  
// 2  2  
// 3  3  3  
// 4  4  4  4  
// 5  5  5  5  5  
// 6  6  6  6  6  6  
// 7  7  7  7  7  7  7  
// 8  8  8  8  8  8  8  8  
// 9  9  9  9  9  9  9  9  9  
// 10 10 10 10 10 10 10 10 10 10 