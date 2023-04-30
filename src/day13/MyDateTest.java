package day13;

import java.util.Date;

//public class MyDateTest {
//    public static void main(String[] args) {
//        MyDate m1 = new MyDate(14,3,1976);
//        MyDate m2 = new MyDate(14,3,1976);
//        if(m1 ==m2){
//            System.out.println("m1=m2");
//        }else{
//            System.out.println("m1!=m2");
//        }
//        if(m1.equals(m2)){
//            System.out.println("m1 equals to m2");
//        }else{
//            System.out.println("m1 is not equals to m2");
//        }
//    }
//}

//public class MyDate{
//    private int day;
//    private int month;
//    private int year;
//
//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        this.day = day;
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        this.month = month;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public MyDate(int day, int month, int year) {
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        // 先比较地址池
//        if(this ==obj){
//            return  true;
//        } else if (obj instanceof  MyDate) {
//            MyDate mydate = (MyDate) obj;
//            return this.day == mydate.day&&this.month==mydate.month&&this.year ==mydate.year;
//
//        }
//
//        return false;
//    }
//}
