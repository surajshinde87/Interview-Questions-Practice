// Write a program for Binary to Decimal to conversion

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = sc.nextLine();
        int decimalValue = 0;

        for (int i = 0; i < binaryStr.length(); i++) {
            char bit = binaryStr.charAt(binaryStr.length() - 1 - i);
            if (bit == '1') {
                decimalValue += Math.pow(2, i);
            }
        }
        System.out.println("Decimal value: " + decimalValue);
    }
}
