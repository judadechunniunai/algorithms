import java.util.Stack;

//https://leetcode-cn.com/problems/valid-parentheses/
public class IsValid {
    public static void main(String[] args) {

        boolean valid = isValid("[[[]");
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if ('(' == aChar || '{' == aChar || '[' == aChar) {
                stack.add(aChar);
            } else {
                if (stack.empty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (pop == '(' && aChar != ')') {
                    return false;
                } else if (pop == '{' && aChar != '}') {
                    return false;
                } else if (pop == '[' && aChar != ']') {
                    return false;
                }
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;
    }
}
