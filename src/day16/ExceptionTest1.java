package day16;

import org.junit.Test;

public class ExceptionTest1 {

    @Test
    public void test(){
        String str = "abc";
        try{
            int num = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("数值转换异常");
        }
    }



}
