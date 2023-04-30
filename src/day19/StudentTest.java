package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        System.out.println("请录入学生信息");
        while(true){
            System.out.println("1:继续录入，0：结束录入");
            int selection = scanner.nextInt();
            if(selection ==0){
                break;
            }
            System.out.println("请输入学生的姓名：");
            String name = scanner.next();
            System.out.println("请输入学生的年龄");
            int age = scanner.nextInt();
            Student s = new Student(name, age);
            list.add(s);

            // 遍历集合学生的信息
            System.out.println("遍历学生信息：");
            for(Object object : list){
                System.out.println(s.toString());
            }
            scanner.close();



        }
    }
}
