package day15.exec;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);
        System.out.println("请输入当月的月份");
        int month = scanner.nextInt();

        //方式二
        Calendar calendar = Calendar.getInstance();
        int month1 = calendar.get(Calendar.MONTH);
        System.out.println(month);


        Employee[] employees = new Employee[2];
        employees[0] = new SalariedEmployee("马森",1002,new MyDate(1992,2,28),10000);
        employees[1] = new HourlyEmployee("潘玉生",2001,new MyDate(1991,1,6),60,240);
        for (int i = 0;i<employees.length;i++){
            System.out.println(employees[i]);
            double salary =  employees[i].earnings();
            System.out.println(salary);
            if (month == employees[i].getBirthday().getMonth()){
                System.out.println("生日快乐，奖励100元");
            }
        }
    }
}
