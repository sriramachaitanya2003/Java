class linear_search {
    public static int search(int numbers[], int key) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 6, 10, 15, 18, 43, 23, 39 };
        int key = 10;
        int index = search(numbers, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("The number is at index " + index);
        }
    }
}