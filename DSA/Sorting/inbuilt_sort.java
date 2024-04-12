import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {

    public static void sort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sort1(Integer array1[]) {
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + " ");
        }
    }

    public static void main(String args[]) {
        int array[] = { 2, 5, 3, 1, 4 };
        Integer array1[] = { 2, 4, 3, 1, 5 };
        // direct function to sort the arrays
        Arrays.sort(array);
        Arrays.sort(array1, Collections.reverseOrder());
        sort(array);
        sort1(array1);
    }
}
