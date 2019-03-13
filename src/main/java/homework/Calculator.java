package homework;

import java.util.Random;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(55, 2));
        System.out.println(sub(78, 56));
        System.out.println(mult(40, 4));
        System.out.println(div(10, 8));
        System.out.println(exp(8.0, 9.0));

    }

    public static int add(int x, int y){
        return x + y;
    }
    public static int sub(int x, int y){
        return x - y;
    }
    public static int mult(int x, int y){
        return  x * y;
    }
    public static int div(int x, int y){
        return x / y;
    }
    public static double exp(double x, double y){
        return Math.pow(x, y);
    }
}
