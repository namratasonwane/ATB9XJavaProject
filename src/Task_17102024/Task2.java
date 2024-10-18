package Task_17102024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side1: ");
        double Side1 = scanner.nextDouble();

        System.out.println("Enter Side2: ");
        double Side2 = scanner.nextDouble();

        System.out.println("Enter Side3: ");
        double Side3 = scanner.nextDouble();

        if((Side1 == Side2) && (Side2 == Side3)){
            System.out.println("The Triangle is Equilateral triangle");
        }
        else if ((Side1 == Side2)||(Side2 == Side3)||(Side1 == Side3)) {
            System.out.println("The Triangle is Isosceles triangle");
        }
        else{
            System.out.println("The Triangle is scalene triangle");
        }
        scanner.close();
    }
}
