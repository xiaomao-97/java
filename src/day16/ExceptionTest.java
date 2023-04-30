package day16;

import com.sun.tracing.dtrace.Attributes;
import org.junit.Test;
import org.junit.validator.ValidateWith;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class ExceptionTest {


    @Test
    public void test1(){
        // 空指针异常
        int[] arr = null;
        System.out.println(arr[3]);
        //数组越界

    }

    @Test
    public void test2(){
        // 数组越界
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    @Test
    public void  test3(){
        // classcastException  ----类型转换异常
        Object obj = new Date();
        String str = (String) obj;
    }

    @Test
    public void test4(){
        // numberFormatException
        String str = "abc";
        int num = Integer.parseInt(str);
    }


    @Test
    public void  test5() throws IOException {
        File file = new File("hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int data = fileInputStream.read();
        while (data!= -1){
            System.out.print((char)data);
            data = fileInputStream.read();
        }
        fileInputStream.close();
    }


}
