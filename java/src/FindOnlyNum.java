import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindOnlyNum {

    public static void main(String[] args) {
        Integer[] arr = {5, 5,3,2,2,4,4};
        int num = findOnlyNumBySet(arr);
        int num1 = findOnlyNum(arr);
        System.out.println(num);
        System.out.println(num1);
    }

    private static int findOnlyNum(Integer[] arr) {
        int flag = 0;
        for (Integer integer : arr) {
            flag ^= integer;
        }
        return flag;

    }

    private static int findOnlyNumBySet(Integer[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        //找到只出现一次的数 最简单的方案
        Set<Integer> set = new HashSet<>();
        set.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                set.remove(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        ArrayList<Integer> integers = new ArrayList<>(set);
        if (integers.isEmpty()) {
            return -1;
        }
        return integers.get(0);
    }
}
