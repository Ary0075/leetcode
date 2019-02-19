package main.easy;

import java.util.Stack;

public class Q26 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > stack.peek()) {
                stack.push(nums[i]);
            }
        }
        while (!stack.isEmpty()) {
            nums[stack.size()-1] = stack.pop();
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                return i;
            }
        }
        return nums.length;
    }
}
