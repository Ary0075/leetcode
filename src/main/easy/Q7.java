package main.easy;

public class Q7 {

    public static int reverse(int x) {
        System.out.println((1<<31)-1);
        int absX = Math.abs(x);
        System.out.println(absX);
        if (absX < 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(absX));
        String absResultStr = sb.reverse().toString();
        if (Long.parseLong(absResultStr) > ((1<<31) - 1)) {
            return 0;
        }
        return x > 0 ? Integer.parseInt(absResultStr) : -Integer.parseInt(absResultStr);
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }
}
