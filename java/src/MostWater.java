//https://leetcode-cn.com/problems/container-with-most-water/
public class MostWater {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }


    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                area = Math.max(height[left] * (right-left), area);
                left++;
            }
            if (height[left] >= height[right]) {
                area = Math.max(height[right] * (right-left), area);
                right--;
            }

        }
        return area;
    }
}
