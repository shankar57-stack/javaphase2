import java.util.HashMap;
import java.util.Map;
public class fruitsinthebasket {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] fruits = {1, 2, 1, 2, 3};
        int result = sol.fruitsinthebasket(fruits);
        System.out.println("Max fruits: " + result);
    }
}
class Solution {
    public int fruitsinthebasket(int[] fruits) {
        // Map to keep track of fruit types and their counts in the current window
        Map<Integer, Integer> baskets = new HashMap<>();
        
        int left = 0;
        int maxFruits = 0;
        
        for (int right = 0; right < fruits.length; right++) {
            // Add the current fruit to the basket
            baskets.put(fruits[right], baskets.getOrDefault(fruits[right], 0) + 1);
            
            // If we have more than 2 types of fruit, shrink the window from the left
            while (baskets.size() > 2) {
                int leftFruit = fruits[left];
                baskets.put(leftFruit, baskets.get(leftFruit) - 1);
                
                // If the count drops to 0, completely remove it from the basket
                if (baskets.get(leftFruit) == 0) {
                    baskets.remove(leftFruit);
                }
                left++; // Move the left pointer forward
            }
            
            // Update the maximum number of fruits we've managed to collect
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        
        return maxFruits;
    }
}
