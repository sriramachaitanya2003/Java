import java.util.*;

class reverse_of_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long n = sc.nextLong();
        while (n > 0) {
            long lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
        sc.close(); 
    }
}