package day03;

public class AriTest {
    public  static  void  main(String args[]){
        // 除号
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 /num2;
        System.out.println(result1);

        int result2 = num1/num2*num2;
        System.out.println(result2);

        double result3 = num1/num2;
        System.out.println(result3);  //2.0
        double result4 = num1/num2+0.0; //2.0
        double result5 = num1/(num2+0.0); //2.4

        // %取余运算
        //
        int m1 = 12;
        int n1 =5;
        System.out.println("m1 % n1 = " + m1 % n1);

        int m2= -12;
        int n2=5;
        System.out.println("m2 % n2 = " + m2 % n2);

        int m3 = 12;
        int n3 =-5;
        System.out.println("m3 % n3 = " + m3 % n3);

        int m4 = -12;
        int n4 =-5;
        System.out.println("m4 % n4 = " + m4 % n4);

        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1=" +a1 +",b1 = "+ b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2=" +a2 +",b2 = "+ b2 );

        int a3 =10;
        ++a3; //a3++
        int b3 = a3; //11

        byte bb1 =127;
        bb1 =(byte)(127+100);  //?????二进制加法（学习一下）
        System.out.println(bb1);




    }
}
