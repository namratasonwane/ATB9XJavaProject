package Task_15102024;

public class Task2 {
    public static void main(String[] args){
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // exp 1 -> ++a -> 11 ; a = 11
        // exp 2 -> a++ -> 11 ; a = 12
        // exp 3 -> a++ -> 12 ; a = 13
        // exp 1 + exp 2 + exp 3 -> 11 + 11 + 12 = 34
    }
}
