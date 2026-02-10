// Write a Java program to print the following pattern:
// for n = 4 s = 3
/*
Output:
3
44
555
6666
6666
555
44
3
 */

import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of s: ");
        int s = sc.nextInt();

        // Printing the whole pattern in one loop
        for(int i = 0; i < 2 * n; i++){

            int k = (i < n ) ? i : (2 * n - i - 1); // Calculate the number of characters to print
            
            int numToPrint = s + k; // Calculate the number to print based on s and k

            System.out.println(String.valueOf(numToPrint).repeat(k + 1)); // Print the number k+1 times
        }

        sc.close();

    }
    
}
