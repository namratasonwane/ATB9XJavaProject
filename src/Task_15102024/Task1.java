package Task_15102024;

public class Task1 {
    public static void main(String[] args){
        int a= 18;
        int b = 20;
        int c = 14;
        int Result = (a>=b && a>=c)?a:(b>=c?b:c);
        System.out.println("Largest number between a,b,c is = "+Result);
    }
}
