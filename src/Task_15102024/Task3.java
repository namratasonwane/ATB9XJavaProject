package Task_15102024;

public class Task3 {
    public static void main(String[] args){
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

        // exp 1 -> -- a -> 19 ; a = 19
        // exp 2 -> a++ -> 19 ; a = 20
        // exp 3 -> a-- -> 20 ; a = 19
    }
}
