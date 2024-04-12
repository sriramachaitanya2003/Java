import java.util.Scanner;

public class sum_of_even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenno = 0;
        int oddno = 0;
        do {
            System.out.println("Enter the number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenno = evenno + number;
            } else {
                oddno = oddno + number;
            }
            System.out.println("Do you want to continue? If yes press 1 else press 0");
            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("The sum of even nos is " + evenno);
        System.out.println("The sum of odd nos is " + oddno);

        sc.close();
    }
}