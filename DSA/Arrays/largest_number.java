class largest_number {
    public static int get_Largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 1; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 6, 10, 15, 18, 43, 23, 244 };
        System.out.println("The largest among the following is " + get_Largest(numbers));
    }
}