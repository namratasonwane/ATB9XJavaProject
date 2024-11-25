package DailyPractice_23102024;

import java.util.Scanner;

// Java Program to Check Whether the Character is Vowel or Consonant
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Charater: ");
        char ch = scanner.next().charAt(0);
        String Result = Vowel_Or_Consonant(ch);
        System.out.println("The character "+ch+ " is "+Result);

    }
    static String Vowel_Or_Consonant(char a)
    {
        a = Character.toLowerCase(a);

        if(a == 'a'|| a == 'e'|| a == 'i'|| a == 'o'|| a == 'u')
        {
            return "Vowels";
        } else if (a >= 'a' && a<='z')
        {
            return "Consonant";
        }
        else
        {
            return "Invalid";
        }
    }
}
