public class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        char[] stack = new char[n];
        int[] count = new int[n];
        int i = 0; // points to next free position in stack

        for (char c : s.toCharArray()) {
            stack[i] = c;
            if (i > 0 && stack[i - 1] == c) {
                count[i] = count[i - 1] + 1;
            } else {
                count[i] = 1;
            }

            if (count[i] == k) {
                // remove the last k characters by moving i back
                i -= k;
            }
            i++;
        }

        return new String(stack, 0, i);
    }
}