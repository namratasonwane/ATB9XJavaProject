package Task_17102024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Score: ");
        int Score = scanner.nextInt();

        if(Score>=90 && Score<=100){
            System.out.println("Grade = A");
        }
        else if (Score>=80 && Score<=89) {
            System.out.println("Grade = B");
        }
        else if (Score>=70 && Score<=79) {
            System.out.println("Grade = C");
        }
        else if (Score>=60 && Score<=69) {
            System.out.println("Grade = D");
        }
        else if (Score>=0 && Score<=59) {
            System.out.println("Grade = F");
        }
        else {
            System.out.println("Invalid Number");
        }
    }
}
