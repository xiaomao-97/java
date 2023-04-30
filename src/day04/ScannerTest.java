package day04;

// c从键盘种获取不同类型的变量，需要使用scanner类

import java.util.Scanner;

public class ScannerTest {
    public static void  main(String[] args){
        //实例化
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        System.out.println("请输入你的姓名");
        String name = scanner.next();
        System.out.println(name);

        System.out.println("请输入你的年纪");
        int num1= scanner.nextInt();
        System.out.println(num1);

        System.out.println("请输入你的体重");
        int weight = scanner.nextInt();
        System.out.println(weight);
        
        System.out.println("你是否单身体（true/false）");
        boolean isLove = scanner.nextBoolean();
        System.out.println(isLove);
    }



}
