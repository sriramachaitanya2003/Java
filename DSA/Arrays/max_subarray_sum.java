//brute force

public class max_subarray_sum {
    public static void sub_arrays(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    // sum of arrays
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum : " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        sub_arrays(numbers);
    }

}
