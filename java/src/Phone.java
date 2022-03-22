import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Phone {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<String>();
        if (digits.length() == 0) {
            return combinations;
        }
        Map<Character, String> phoneMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        Queue<Character> queue = new ArrayBlockingQueue(6);
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i)==1){
                continue;
            }
            queue.add(phoneMap.get(digits.charAt(i)).charAt(0));
        }


        return combinations;
    }


}
