//print the fibonacci series till the nth term

public class recursion4 {
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFib(a, b, n - 2); // In this case n=7, in it we already printed two numbers that is a and b,
                               // remaining are 7-2=5; i.e (n-2)

    }
}
