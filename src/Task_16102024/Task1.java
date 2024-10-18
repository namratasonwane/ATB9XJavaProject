package Task_16102024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Taking input
        System.out.println("Enter your name: ");
        String Name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int Age = scanner.nextInt();

        System.out.println("Enter your salary: ");
        double Salary = scanner.nextDouble();


        // Printing the output
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Salary: "+Salary);
    }
}
