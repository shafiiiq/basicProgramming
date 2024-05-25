package arrayProblems;

import java.util.Scanner;

public class starPatternThree {
    public static void main(String[] args) {
        int limit;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the limit lines to print stars");
        limit = obj.nextInt();
        System.out.println("");

        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
            System.out.println("");
        }
    }
}

// sample output figure
//          * 
//         * * 
//        * * * 
//       * * * * 
//      * * * * * 
//     * * * * * * 
//    * * * * * * * 
//   * * * * * * * * 
//  * * * * * * * * * 
