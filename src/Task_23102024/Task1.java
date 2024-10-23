package Task_23102024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int Num1 = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int Num2 = scanner.nextInt();
        int Result = sum_of_two_number(Num1,Num2);
        System.out.println("Addition of two numbers: "+Result);

        int Result1 = Sub_of_two_number(Num1,Num2);
        System.out.println("Substration of two numbers: "+Result1);

        int Result2 = Mul_of_two_number(Num1,Num2);
        System.out.println("Multiplication of two numbers: "+Result2);

        int Result3 = Div_of_two_number(Num1,Num2);
        System.out.println("Division of two numbers: "+Result3);

    }
    static int sum_of_two_number(int a,int b)
    {
        return a+b;
    }
    static int Sub_of_two_number(int a,int b)
    {
        return a-b;
    }
    static int Mul_of_two_number(int a,int b)
    {
        return a*b;
    }
    static int Div_of_two_number(int a,int b)
    {
        return a/b;
    }
}
