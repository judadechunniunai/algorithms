import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//    https://leetcode-cn.com/problems/3sum/
public class ThreeNumSum {
    public static void main(String[] args) {
        int[] nums = {-4, -1, -1, 0, 1, 2};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length < 3) {
            return list;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                //比的是当前位置 当前位置后一位 右面的位置的和 数组有序 所以i作为中间的 如果>0肯定不行
                return list;
            }
            int left = i + 1, right = nums.length - 1;
            if (i!=0&&nums[i]==nums[i-1]){
                continue;
            }
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] == 0) {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[left]);
                    list1.add(nums[right]);
                    list.add(list1);
                    while (right > left && nums[right] == nums[right - 1]) {
                        --right;
                    }
                    --right;
                    while (right > left && nums[left] == nums[left + 1]) {
                        ++left;
                    }
                    ++left;
                }else if (nums[left] + nums[right] + nums[i] > 0){
                    --right;
                }else {
                    ++left;
                }
            }

        }
        return list;
    }
}
