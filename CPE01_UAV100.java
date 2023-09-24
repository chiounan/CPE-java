// CPE 01 - UAV 100
// The 3n + 1 problem
// Input: Integer i & j
// Output: The max of cycle-lenght over all integers between i & j.
// The cycle-lenght is the number of items of n of the 3n + 1 problem.

import java.util.Scanner;

public class CPE01_UAV100 {

    public static int even(int e) {
        return e % 2;
    }

    public static int The3n1(int n) {
        int length = 1;

        while (n > 1) {
            if (even(n) == 1)
                n = 3 * n + 1;
            else
                n /= 2;
            length++;    
        }
        return length;
    }

    public static void main(String args []) {
        int i, j;
        int max;
        Scanner scn = new Scanner(System.in);

        System.out.print("Input integer i: ");
        i = scn.nextInt();
        System.out.print("Input integer j: ");
        j = scn.nextInt();
        
        for ()
    }
}