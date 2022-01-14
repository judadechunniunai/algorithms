public class WeiYunSuan {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;


        print(a);
        System.out.println();
        System.out.println(~a +1 );
        print(~a +1);

    }

    private static void print(int a) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((a & i << i) == 0 ? 0 : 1);
        }
    }

}
