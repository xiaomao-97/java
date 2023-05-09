package day22;

import org.junit.Test;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {
    @Test
    public void test() throws IOException {
        File file = new File("hello.txt");

        //创建输入型字符流，用于读取数据
        FileReader fr = new FileReader(file);

        System.out.println((char) fr.read());
        // 方式1
        int data = fr.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fr.read();
        }

        fr.close();

    }

    @Test
    public void test1() throws IOException {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");

            //创建输入型字符流，用于读取数据
            fr = new FileReader(file);

            System.out.println((char) fr.read());
            // 方式1
            // fr.read()每次读取一个字符，每次从磁盘读取
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Test
    public void test2() throws IOException {
        FileReader fr = null;
        try {
            File file = new File("hello.txt");

            //创建输入型字符流，用于读取数据
            fr = new FileReader(file);

            //读取数据，并显示在控制台
            char[] cbuffer = new char[5];
            int len;
            // 读取多个数据
            while((len=fr.read(cbuffer))!=-1){
                for(int i =0;i<len;i++){
                    System.out.print(cbuffer[i]);
                }
            }
            // 方式1
            // fr.read()每次读取一个字符,每次从磁盘中读取
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }




// 写入数据
    @Test
    public void test3() {
        // 创建file类对象
        FileWriter fileWriter = null;
        try {
            File file = new File("info.txt");
            // 创建输出流
            // 覆盖文件使用的构造器
//            fileWriter = new FileWriter(file);
            // 追加
            fileWriter = new FileWriter(file,true);
            //写出具体过程
            fileWriter.write("I love u \n");
            fileWriter.write("you love u \n");
            System.out.println("输出成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // 关闭资源
    }

    // 赋值一份hello.txt文件，命名为hello_copy.txt
    @Test
    public void test5()  {
        //
        FileReader fr=null;
        FileWriter fw=null;
        try {
            File src = new File("hello.txt");
            File dest = new File("hello_copy.txt");

            fr = new FileReader(src);
            fw = new FileWriter(dest);

            char[] cbuffer = new char[5];
            int len;
            while ((len = fr.read(cbuffer)) != -1) {
                fw.write(cbuffer,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fr!=null){
                    fr.close();
                }
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                if(fw!=null){
                    fw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
