package Oct.ex_16102024_Condition_Loops;

public class Lab072 {
    public static void main(String[] args) {
        // Create a Program to check wheather Shesheh Trivedi will go to Goa OR NOT
        // Take a input age = Shesheh ->  Goa
        // age > 25 -> Drinking - Goa
        // Ternary operator

        //System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        int age = Integer.parseInt(args[1]);
        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");
    }
}
