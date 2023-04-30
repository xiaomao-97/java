package day03;

/**
 * 位运算符
 */
public class TsetBit {
    public static  void main(String[] args){
        int i = 21;
//        i = -21;
        System.out.println("i <<2:"+(i<<2));
        System.out.println("i <<3:"+(i<<3));
        System.out.println("i <<27:"+(i<<27));


        int m =12;
        int n =5;
        System.out.println("m&n:"+(m&n));
        System.out.println("m|n:"+(m|n));
        System.out.println("m^n:"+(m^n));


        // 练习 交换变量
        int num1 =12;
        int num2 =5;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1="+num1+"num2"+num2);

        // 交换位置
        num1 = num1 +num2;
        num2 = num1-num2;
        num1 =num1-num2;
        System.out.println("num1="+num1+"num2"+num2);


        // 交换位置 --位运算符
        num1 = num1 ^ num2;
        num2 =num1 ^num2;
        num1 = num1^num2;
        System.out.println("num1="+num1+"num2"+num2);

        // 三元运算符
        //表达式1和表达式2要求是一致的
        //三元运算符是可以嵌套的
        //可以用三元运算符的地方，一定可以用if-else；反之，不成立
        //同时可以使用三元运算符和if-else，使用三元运算符；
        int mm = 12;
        int nn =5;
        int max =(m>n)?m:n;
        System.out.println(max);


        // 获取三个数的最大值，注意次数不是排序
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;
        int max1 = (n1>n2)?n1:n2;
        int max2 = (max1 >n3)?max1:n3;
        System.out.println("三个数字的最大值为"+max2);

        System.out.println(2+"PrimeNumberTest1.java");




    }

}
