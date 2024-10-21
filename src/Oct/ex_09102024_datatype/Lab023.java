package Oct.ex_09102024_datatype;

public class Lab023 {
    int instance_variable = 10; // Instance Variable
    static int static_variable = 10; // Static Varible

    public static void main(String[] args) {
        int age = 10; // Local Variable
        {
            int sachin = 10;
            System.out.println(sachin);
        }
        //System.out.println(sachin); Invalid because it is not allow in outside of main method
    }
}
