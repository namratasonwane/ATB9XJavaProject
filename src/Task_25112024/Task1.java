package Task_25112024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        if(PalindromeCheck.isPalindrome(input))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }

    public class PalindromeCheck
    {
        static boolean isPalindrome(String str) {
            int start = 0;
            int end = str.length() - 1;
            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }
}
