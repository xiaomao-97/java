package day09;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,34,32,5,3,54,654,-98,0,-53,5};
        int max = util.getMax(arr);
        System.out.println("最大值"+max);

        System.out.print("排序前");
        util.print(arr);
        System.out.println();
        util.sort(arr);
        System.out.print("排序后");
        util.print(arr);


    }
}
