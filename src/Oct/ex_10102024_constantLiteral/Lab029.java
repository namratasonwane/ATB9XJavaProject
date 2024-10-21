package Oct.ex_10102024_constantLiteral;

public class Lab029 {
    public static void main(String[] args) {
        final int a = 10;
        final String STR="TTA";
        final double D1=999.99;

        final int AGE;
        AGE = 19;
        //AGE = 29; // it is not possible because it is final
        System.out.println(AGE);
    }
}
