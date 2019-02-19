package main.easy;

import java.util.ArrayList;
import java.util.List;

public class Q9 {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }
        int n = 0;
        long remainder = x % (new Double(Math.pow(10, n)).longValue());
        List<Long> nums = new ArrayList<>();
        nums.add((x / (new Double(Math.pow(10, n)).longValue())) % 10);
        while (remainder != x) {
            n++;
            remainder = x % (new Double(Math.pow(10, n)).longValue());
            nums.add((x / (new Double(Math.pow(10, n)).longValue())) % 10);
        }
        nums.remove(nums.lastIndexOf(0L));
        if (nums.size() == 1) {
            return true;
        } else if (nums.size() % 2 == 1) {
            for (int i = 0; i < (nums.size()+1)/2; i++) {
                if (i == (nums.size()-1)/2) {
                    break;
                } else {
                    if (!nums.get(i).equals(nums.get((nums.size()-1)-i))) {
                        return false;
                    }
                }
            }
        } else if (nums.size() % 2 == 0) {
            for (int i = 0; i < nums.size()/2; i++) {
                if (!nums.get(i).equals(nums.get((nums.size()-1)-i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
