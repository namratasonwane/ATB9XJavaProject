package task_22102024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int Number = scanner.nextInt();
        int Reversed = 0;

        for(;Number != 0;Number = Number/10)
        {
            int Digit = Number % 10;
            Reversed = Reversed*10+Digit;
        }
        System.out.println("Reversed Number is: "+Reversed);
    }
}
