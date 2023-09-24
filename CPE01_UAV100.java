// CPE 01 - UAV 100
// The 3n + 1 problem
// Input: Integer i & j
// Output: The max of cycle-lenght over all integers between i & j.
// The cycle-lenght is the number of items of n of the 3n + 1 problem.

import java.util.Scanner;

public class CPE01_UAV100 {

    public static int Even(int e) {
        return e % 2;
    }

    public static int The3n1(int n) {
        int length = 1;

        System.out.print("The 3n+1 of " + n + ": ");
        while (n > 1) {
            if (Even(n) == 1)
                n = 3 * n + 1;
            else
                n /= 2;
            length++;    
            System.out.print(n + " ");
        }
        System.out.println("(length: " + length + ")");
        return length;
    }

    public static void main(String args []) {
        int i, j;
        int max = 0, temp = 0;
        int counter;
        Scanner scn = new Scanner(System.in);

        System.out.print("Input integer i: ");
        i = scn.nextInt();
        System.out.print("Input integer j: ");
        j = scn.nextInt();
        
        if ((i > j) || (i <= 0 || i >= 10000) && (j <=0 || j >= 10000)) {
            System.out.println("The input is not valid, exit.");
            System.exit(-1);
        }
        for (counter = i; counter <= j; counter++) {
            max = The3n1(counter);
            if (max < temp)
                max = temp;
            temp = max;    
        }
        System.out.println("The max cycle-length between " + i + " and " + j + " is " + max + ".");
        
    }
}