
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class binomial_coefficient {
    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binomial_coefficient1(int n, int r) {
        int n_factorial = factorial(n);
        int r_factorial = factorial(r);
        int n_r_factorial = factorial(n - r);
        int binomial_coefficient = (n_factorial) / (r_factorial * n_r_factorial);
        return binomial_coefficient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        System.out.println("Enter the r value");
        int r = sc.nextInt();
        int binomial_coefficient = binomial_coefficient1(n, r);
        System.out.println("The binomial coefficeient of the given numbers is " + binomial_coefficient);

        sc.close();
    }
}