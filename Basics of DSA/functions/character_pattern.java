import java.util.*;

class character_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        char ch = 'A';
        int n = sc.nextInt();
        for (int lines = 1; lines <= n; lines++) {
            for (int chars = 1; chars <= lines; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();

            sc.close();
        }
    }
}