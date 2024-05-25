package arrayProblems;

import java.util.Scanner;

public class starPatternFour {
    public static void main(String[] args) {
        int limit;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the limit of line for print stars");
        limit = obj.nextInt();
        int tempLimit = limit;

        for (int i = 1; i <= tempLimit; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= limit; k++) {
                System.out.print("* ");
            }
            System.err.println("");
            limit--;
        }
    }
}

// sample output figure 
// * * * * * * * * * * 
//   * * * * * * * * * 
//     * * * * * * * * 
//       * * * * * * * 
//         * * * * * * 
//           * * * * * 
//             * * * * 
//               * * * 
//                 * * 
//                   * 