package day04;

import java.util.Scanner;

public class SwitchCaseTest3 {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year =  scanner.nextInt();
        System.out.println("请输入的month");
        int month =  scanner.nextInt();
        System.out.println("请输入2019年的天");
        int day = scanner.nextInt();

        int sumDays = 0;
        switch (month){
            case 12:
                sumDays +=30;
            case 11:
                sumDays +=31;
            case 10:
                sumDays +=30;
            case 9:
                sumDays +=31;
            case 8:
                sumDays +=31;
            case 7:
                sumDays +=30;
            case 6:
                sumDays +=31;
            case 5:
                sumDays +=30;

            case 4:
                sumDays +=31;
            case 3:
                if((year%4==0&& year%100 !=0)|| year % 400 == 0){
                    sumDays +=29;
                }else{
                    sumDays+=28;
                }
            case 2:
                sumDays +=31;
            case 1:
                sumDays += day;
        }
        System.out.println("2019"+month+"月"+"day"+"日是当年的第"+sumDays+"天");

    }
}
