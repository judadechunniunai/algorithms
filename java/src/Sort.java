import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        //从小到大排序

        Integer[] arr = {1, 5, 9, 2, 4, 7, 3, 4, 5, 6, 2, 1, 10};
//        selectSort(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void selectSort(Integer[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        //选择排序 用确定的位置 去找剩余的数组中数的最小数 换位置 （选择小的换位置）
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                /**
                 * 默认当前位置是最小的
                 * 与当前位置的后面的数进行比较 只要比自己小了 那就换位置
                 */
                exchange(arr, i, j);
            }
        }

    }


    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(Integer[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        //冒泡 一个数字与后面的数字两两比较 满足条件则换位（最小/最大的数会像泡泡一样浮出来）
        for (int i = 0; i < arr.length; i++) {
            //外层控制比较次数
            for (int j = 0; j < arr.length - i - 1; j++) {
                /**
                 * 内层控制比较过程
                 * j 与 j+1 比较 就是相邻的两个比较
                 * j < arr.length - i - 1 是因为每一次大周期的比较 都可以确认一个数是最大或者最小 无需再比 减少比较次数
                 * 写成j < arr.length - 1也可以 必须要-1 因为j+1 在边缘会索引越界
                 */
                exchange(arr, j, j + 1);
            }

        }
    }


    private static void exchange(Integer[] arr, int i, int j) {
        if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }


}
