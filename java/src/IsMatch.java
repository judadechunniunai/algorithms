

/**
 * https://leetcode-cn.com/problems/regular-expression-matching/
 */
public class IsMatch {


    public static void main(String[] args) {
        String s = "aa";
        String p = "a";
        boolean match = isMatch(s, p);
        System.out.println(match);
    }
    public static boolean isMatch(String s, String p) {
        if (p.length()<s.length() && p.charAt(p.length()-1)!='*'){
            return false;
        }

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (c == s.charAt(i) || c=='.') {
                continue;
            }
            if (i != 0 && c == '*') {
                char c1 = s.charAt(i - 1);
                //保证s后面的全都是c1
                if (p.charAt(i-1) == '.'){
                    return true;
                }
                char[] chars = s.toCharArray();
                for (int i1 = i; i1 < chars.length; i1++) {
                    if (c1!=chars[i1]){
                        return false;
                    }
                }
            }

        }
        return true;
    }

}
