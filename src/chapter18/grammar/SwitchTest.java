package chapter18.grammar;


import org.junit.Test;

enum Week{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY, SUNDAY;
}


public class SwitchTest {

    // jdk12 之前的写法
    @Test
    public void test1(){
        Week day = Week.FRIDAY;
        switch (day){
            case MONDAY :
                System.out.println(1);
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println(2);
                break;
            case FRIDAY:
                System.out.println(3);
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(4);
                break;
            default:
                throw new RuntimeException("what day is today?" + day);
        }
    }


    @Test
    public void test2(){
        Week day = Week.FRIDAY;
        switch (day){
            case MONDAY -> System.out.println(1);
            case TUESDAY,WEDNESDAY,THURSDAY ->System.out.println(2);
            case FRIDAY -> System.out.println(3);
            case SATURDAY,SUNDAY -> System.out.println(4);
            default ->
                throw new RuntimeException("what day is today?" + day);
        }
    }

    // jdk12中的写法，还可以使用变量接受switch表达式的结果
    @Test
    public void test3(){
        Week day = Week.FRIDAY;
        int result  = switch (day){
            case MONDAY -> 1;
            case TUESDAY,WEDNESDAY,THURSDAY ->2;
            case FRIDAY -> 3;
            case SATURDAY,SUNDAY -> 4;
            default ->
                    throw new RuntimeException("what day is today?" + day);
        };
        System.out.println(result);
    }

    // jdk13中的写法，引入了yield的关键字，用于返回指定数据，结束switch结构
    // 这意味着，swith表达式返回值应该使用yield，而yield只会跳出当前switch快
    // 和return的区别在于，return会直接跳出当前方法，而yield只会跳出当前switch
    @Test
    public void test4(){
        Week day = Week.FRIDAY;
        int result  = switch (day){
            case MONDAY -> {
                yield 1;
            }
            case TUESDAY,WEDNESDAY,THURSDAY ->{
                yield 2;
            }
            case FRIDAY -> {
                yield  3;
            }
            case SATURDAY,SUNDAY -> {
                yield 4 ;
            }
            default ->
                    throw new RuntimeException("what day is today?" + day);
        };
        System.out.println(result);
    }


    @Test
    public void test5(){
        Week day = Week.FRIDAY;
        int result  = switch (day){
            case MONDAY :
                yield 1;

            case TUESDAY,WEDNESDAY,THURSDAY:
                yield 2;

            case FRIDAY :
                yield  3;

            case SATURDAY,SUNDAY:
                yield 4 ;

            default :
                yield 5;

        };
        System.out.println(result);
    }
}
