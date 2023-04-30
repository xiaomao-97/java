package day03;

public class SetValueTest {
    public static void main(String[] args){
        int i1 = 10;
        int j1 = 10;

        int i2,j2;
        i2 = j2 =10;

        // *******
        int num1 = 10;
        num1 +=2;
        System.out.println(num1);

        short s1 = 10;
//        s1 =s1+2;  //编译失败
        s1+=2;// 不会改变变量的数据类型

        // 练习1
        int i = 1;
        i *=1;
        System.out.println(i);
        i++;
        System.out.println(i);

        // 练习2
        int m =2;
        int n =3;
        int z = m++;
        n *=m++;
        System.out.println("m="+m);
        System.out.println("n="+n);
        System.out.println("z="+z);

        //练习3
        int  n1 =10;
        n1 +=(n1++)+(++n1);
        System.out.println(n1);  //32

    }
}
