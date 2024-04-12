import java.util.*;

class half_pyramid_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = sc.nextInt();
        for (int lines = 1; lines <= n; lines++) {
            for (int number = 1; number <= lines; number++) {
                System.out.print(number);
            }
            System.out.println();

            sc.close();
        }
    }
}