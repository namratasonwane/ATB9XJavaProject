package DailyPractice_23102024;

import java.util.Scanner;

// take input from user and check if number is even or odd using function
public class Q2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int Num = scanner.nextInt();
        String Result = Even_Or_Odd(Num);
        System.out.println("The Number "+Num+" is "+Result);

    }
    static String Even_Or_Odd(int a)
    {
        if(a % 2 == 0)
        {
            return "Even";
        }
        else
        {
            return "Odd";
        }
    }
}
