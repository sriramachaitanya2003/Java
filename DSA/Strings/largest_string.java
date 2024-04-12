/* Find the largest string among 
 * apple, mango , banana
 * This is done through lexicographic method
 */
public class largest_string {
    public static void main(String args[]) {
        String fruits[] = { "apple", "mango", "banana" };
        // Initially taking 0th index as the largest
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
