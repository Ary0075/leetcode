package main.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Q20 {

    /*public static boolean isValid(String s) {
        // 空字符串直接返回true
        if (s.equals("")) {
            return true;
        }
        // 奇数不可能成对
        if (s.length() % 2 == 1) {
            return false;
        }
        // 不以反括号结尾的字符串不可能成对
        if (!s.endsWith(")")
                && !s.endsWith("]")
                && !s.endsWith("}")) {
            return false;
        }
        List<String> brackets = Arrays.asList(s.split(""));
        String childStr;
        int preBracketIndex;
        int sameBracket;
        for (int i = 0; i < brackets.size(); i++) {
            String a = brackets.get(i);
            if (brackets.get(i).equals("(")) {
                if (brackets.get(i+1).equals(")")) {
                    i += 1;
                }
            } else if (brackets.get(i).equals(")")) {
                preBracketIndex = s.substring(0, i).lastIndexOf("(");
                if (preBracketIndex == -1) {
                    return false;
                }
                if (s.substring(0, i).lastIndexOf(")") == -1) {
                    if ((i - preBracketIndex) % 2 == 0
                            || !isValid(s.substring(preBracketIndex + 1, i))) {
                        return false;
                    }
                } else {
                    childStr = s.substring(0, i);
                    for (String character : s.substring(0, i).split("")){
                        if (character.equals(")")) {
                            childStr = childStr.substring(0, preBracketIndex);
                            preBracketIndex = childStr.substring(0, preBracketIndex).lastIndexOf("(");
                            if (preBracketIndex == -1) {
                                return false;
                            }
                        }
                    }
                }
            } else if (brackets.get(i).equals("[")) {
                if (brackets.get(i+1).equals("]")) {
                    i += 1;
                }
            } else if (brackets.get(i).equals("]")) {
                preBracketIndex = s.substring(0, i).lastIndexOf("[");
                if (preBracketIndex == -1) {
                    return false;
                }
                if (s.substring(0, i).lastIndexOf("]") == -1) {
                    if ((i - preBracketIndex) % 2 == 0
                            || !isValid(s.substring(preBracketIndex + 1, i))) {
                        return false;
                    }
                } else {
                    childStr = s.substring(0, i);
                    for (String character : s.substring(0, i).split("")){
                        if (character.equals("]")) {
                            childStr = childStr.substring(0, preBracketIndex);
                            preBracketIndex = childStr.substring(0, preBracketIndex).lastIndexOf("[");
                            if (preBracketIndex == -1) {
                                return false;
                            }
                        }
                    }
                }
            } else if (brackets.get(i).equals("{")) {
                if (brackets.get(i+1).equals("}")) {
                    i += 1;
                }
            } else if (brackets.get(i).equals("}")) {
                preBracketIndex = s.substring(0, i).lastIndexOf("{");
                if (preBracketIndex == -1) {
                    return false;
                }
                if (s.substring(0, i).lastIndexOf("}") == -1) {
                    if ((i - preBracketIndex) % 2 == 0
                            || !isValid(s.substring(preBracketIndex + 1, i))) {
                        return false;
                    }
                } else {
                    childStr = s.substring(0, i);
                    for (String character : s.substring(0, i).split("")){
                        if (character.equals("}")) {
                            childStr = childStr.substring(0, preBracketIndex);
                            preBracketIndex = childStr.substring(0, preBracketIndex).lastIndexOf("{");
                            if (preBracketIndex == -1) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }*/

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (stack.size() == 0) {
                stack.push(aChar);
            } else if (isSym(stack.peek(), aChar)) {
                stack.pop();
            } else {
                stack.push(aChar);
            }
        }
        return stack.size() == 0;
    }

    private static boolean isSym(char c1, char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }
}
