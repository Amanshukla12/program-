// create a program where check palindrome number without reverse


import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        if (num < 0) return false; 

        int divisor = 1;
        while (num / divisor >= 10) {
            divisor *= 10;  
        }

        while (num >= 10) { 
            int firstDigit = num / divisor;
            int lastDigit = num % 10;

            if (firstDigit != lastDigit) {
                return false; 
            }

            
            num = (num % divisor) / 10;
            divisor /= 100;  
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(number + (isPalindrome(number) ? " is a palindrome." : " is not a palindrome."));
    }
}



output is:


Enter a number: 121
121 is a palindrome.

Enter a number: 123
123 is not a palindrome.
