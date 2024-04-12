import java.util.*;

public class max_of_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Max of 3 numbers");
        System.out.println("Enter the first number");
        float a = sc.nextFloat();
        System.out.println("Enter the second number");
        float b = sc.nextFloat();
        System.out.println("Enter the third number");
        float c = sc.nextFloat();
        if ((a >= b) && (a >= c)) {
            System.out.println(a + " is greater");
        } else if (b >= c) {
            System.out.println(b + " is greater");
        } else {
            System.out.println(c + " os greater");
        }

        sc.close();
    }
}
