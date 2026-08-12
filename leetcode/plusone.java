import java.util.*;

public class plusone {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test Case 1: Standard addition
        int[] result1 = sol.plusOne(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(result1)); // [1, 2, 4]

        // Test Case 2: Trailing nines
        int[] result2 = sol.plusOne(new int[]{1, 2, 9});
        System.out.println(Arrays.toString(result2)); // [1, 3, 0]

        // Test Case 3: All nines (array size increases)
        int[] result3 = sol.plusOne(new int[]{9, 9, 9});
        System.out.println(Arrays.toString(result3)); // [1, 0, 0, 0]
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}

