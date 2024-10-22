package task_22102024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int Vowel = 0;
        int Consonant = 0;

        input = input.toLowerCase();

        for(int i =0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                Vowel++;
            }
            else{
                Consonant++;
            }
        }
        System.out.println("Number of Vowels in string is: "+Vowel);
        System.out.println("Number of Consonant in string is: "+Consonant);
    }
}
