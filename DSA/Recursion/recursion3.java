//print factorial of a number n

public class recursion3 {
    public static int calcFactorial(int n) {
        // base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        int fact_n_1 = calcFactorial(n - 1); // This is (n-1) factorial
        int fact_n = n * fact_n_1;
        return fact_n;
    }

    public static void main(String args[]) {
        int n = 5;
        int factn = calcFactorial(n);
        System.out.println(factn);
    }
}
