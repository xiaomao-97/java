package day06;

public class ArrayTest {
    public static void main(String[] args) {
        // 静态初始化,数组的初始化和数组元素的赋值操作同时进行
        int[] ids = new int[]{1,2,3,4};
        //动态初始化,数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[2];

        names[0] = "mzh";
        names[1]="fjl";

        //如何获取数据的长度
        System.out.println(ids.length );

        for(int i= 0;i<ids.length;i++){
            System.out.println(i);
        }


    }

}
