package PracticeIT_Cap4_ConditionalExecution;

import java.util.Scanner;

public class base2ToBase10Conversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Base 2 value:");
        int a = input.nextInt();
        int b = a/10000000;
        double c = b* Math.pow(2, 7);
        int d = Math.abs(a-(10000000*b));
        int e = d/1000000;
        double f = e* Math.pow(2,6);
        int g = Math.abs(d-(1000000*e));
        int h = g/100000;
        double i = h * Math.pow(2,5);
        int j = Math.abs(g-(100000*h));
        int k = j/10000;
        double l = k * Math.pow(2,4);
        int m = Math.abs(j-(10000*k));
        int n = m/1000;
        double o = n * Math.pow(2, 3);
        int p = Math.abs(m-(1000*n));
        int q = p/100;
        double r = q* Math.pow(2, 2);
        int s = Math.abs(p-(100*q));
        int t = s/10;
        double u = t* Math.pow(2,1);
        int v = Math.abs(s-(10*t));

        double base10 = c + f + i + l + o + r + u + v;

        System.out.println("Valuse in Base 10: " + base10);
    }
}
