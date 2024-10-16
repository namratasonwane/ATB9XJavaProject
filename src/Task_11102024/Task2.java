package Task_11102024;

public class Task2 {
    public static void main(String[] args){
        //Arithmetic Operator
        int A= 15;
        int B= 5;
        System.out.println("------Arithmetic Operators-------");
        System.out.println("A+B = "+(A+B)); // Addition
        System.out.println("A-B = "+(A-B)); // Substraction
        System.out.println("A*B = "+(A*B)); // Multiplication
        System.out.println("A/B = "+(A/B)); // Division
        System.out.println("A%B = "+(A%B)); // Modulo


        //Assignment Operator
        System.out.println("-------Assignment Operator--------");
        System.out.println("A+=B = "+(A+=B));
        System.out.println("A-=B = "+(A-=B));
        System.out.println("A*=B = "+(A*=B));
        System.out.println("A/=B = "+(A/=B));
        System.out.println("A%=B = "+(A%=B));

        //Relational Operator
        System.out.println("________Relational Operators__________");
        System.out.println("A==B = "+(A==B));  // == Operator
        System.out.println("A!=B = "+(A!=B)); // != operator
        System.out.println("A<=B = "+(A<=B)); // <= operator
        System.out.println("A>=B = "+(A>=B));  // >= operator
        System.out.println("A>B = "+(A>B));   // > operator
        System.out.println("A<B = "+(A<B));  // < operator

        // Logical Operator
        System.out.println("_________Logical Operator__________");
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false
    }
}
