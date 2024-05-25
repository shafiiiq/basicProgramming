package arrayProblems;

import java.util.Scanner;

public class starPatternFive {
    public static void main(String[] args) {
        int limit;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the limit of line for print stars");
        limit = obj.nextInt();
        int tempLimit = limit;

        for (int i = 1; i <= tempLimit; i++) {
            for (int j = 1; j <= limit; j++) {
                System.out.print("* ");
            }
            System.err.println("");
            limit--;
        }
    }
}

// sample output 
// * * * * * * * * * * 
// * * * * * * * * * 
// * * * * * * * * 
// * * * * * * * 
// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 