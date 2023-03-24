package Section6;

public class Question6_1_1 {

    public static void main(String[] args) {

        int a = 12;
        int b = 3;

        plus(a,b);
        minus(a,b);
        divide(a,b);
        multiply(a,b);

    }//

    public static void plus(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void minus(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public static void divide (int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b) + " | " + "나머지 : " + (a % b));
    }

    public static void multiply(int a, int b){
        System.out.println(a + " * " + b + " = " + (a * b));
    }

} // Main method
