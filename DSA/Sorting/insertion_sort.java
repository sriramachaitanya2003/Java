public class insertion_sort {
    public static void insertionsort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int prev = i - 1;
            // finding out the current position to insert
            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            // insertion
            array[prev + 1] = curr;
        }
    }

    public static void sort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int array[] = { 3, 5, 2, 1, 4 };
        insertionsort(array);
        sort(array);
    }
}
