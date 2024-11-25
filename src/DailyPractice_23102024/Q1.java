package DailyPractice_23102024;

import java.util.Scanner;

//How to Take Input from Users?
//
//You can take input from users using the Scanner class
// take 2 number from user name check which number is greater using fun.
public class Q1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int Num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int Num2 = scanner.nextInt();

        int Result = greater_number_between_two(Num1,Num2);
        System.out.println("Greater number between "+Num1+" and "+Num2+" is: "+Result);


    }
    static int greater_number_between_two(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
}
