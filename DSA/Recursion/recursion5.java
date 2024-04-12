//print x^n for stack height = n

public class recursion5 {
    public static int calcPower(int x, int n) {
        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }
        int xpown_1 = calcPower(x, n - 1); // This is x^(n-1)
        int xPow = x * xpown_1;
        return xPow;
    }

    public static void main(String[] args) {
        int x = 2, n = 10;
        int answ = calcPower(x, n);
        System.out.println(answ);
    }
}
