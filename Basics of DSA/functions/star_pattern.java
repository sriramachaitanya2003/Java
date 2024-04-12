import java.util.Scanner;

class star_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = sc.nextInt();
        for (int lines = 1; lines <= n; lines++) {
            for (int star = 1; star <= lines; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}