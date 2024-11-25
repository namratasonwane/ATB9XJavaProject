package DailyPractice_23102024;

import java.util.Scanner;

// take input from user and check if number is even or odd using function
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        Even_Or_Odd(a);

    }
    static void Even_Or_Odd(int Num)
    {
        if(Num % 2 == 0)
        {
            System.out.println(Num +" is Even number");
        }
        else
        {
            System.out.println(Num +" is Odd number");
        }
    }
}
