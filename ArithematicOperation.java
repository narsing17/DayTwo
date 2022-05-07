import java.util.Scanner;

public class ArithematicOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any three positive integer numbers:");

        int p = in.nextInt();
        int q = in.nextInt();
        int r = in.nextInt();

        System.out.println("SUM         " + p + " + " + q + " = " + Sum(p, q, r));
        System.out.println("DIFFERENCE  " + p + " - " + q + " = " + Sub(p, q, r));
        System.out.println("PRODUCT     " + p + " * " + q + " = " + Mul(p, q, r));
        System.out.println("QUOTIENT    " + p + " / " + q + " = " + Div(p, q, r));
    }


    public static int Sum(int x, int y, int r) {
        return x + y * r;
    }

    public static int Sub(int x, int y, int r) {
        return r + x / y;
    }

    public static int Mul(int x, int y, int r) {
        return x % y + r;
    }

    public static float Div(int x, int y, int r) {
        return x * y + r;
    }
}