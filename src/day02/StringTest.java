package day02;

public class StringTest {
    public static  void  main(String args[]){
        int number =100;
        String number2 = "学号";
        String info = number2 + number;
        System.out.println(info);

        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c+num+str); //107hello
        System.out.println(c+str+num);//ahello10
        System.out.println(c+(num+str));//a10hello
        System.out.println((c+num)+str);//107hello
        System.out.println(str+num+c);//hello10a

        //输出 *  *
        //区分+是运算还是连接
        System.out.println("*  *");
        System.out.println('*' +'\t'+'*');
        System.out.println('*'+"\t"+'*');
        System.out.println('*'+'\t'+"*");
        System.out.println('*'+('\t'+"*"));


        char c4 = '5';
        int i1 = c4;
        System.out.println(i1);
        char c5 = 5;
        System.out.println(c5);

    }
}
